package me.dratii.tracking.helpers;

import me.dratii.Globals;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * Yuntrack (YunExpress) request signing.
 *
 *   base      = "Timestamp=" + timestamp + "&NumberList=" + JSON.stringify(numberList)
 *   Signature = lowercase hex( HMAC_SHA256(base, KEY) )
 */
public final class YuntrackSign {

    /** Hardcoded in the public web bundle (app.164a84c698577a7a356f.js). */
    private static final byte[] HMAC_KEY =
            Globals.configData.YunTrackHMACKey().getBytes(StandardCharsets.UTF_8);

    private YuntrackSign() {
    }

    /** Computes the Signature field for a tracking request. */
    public static String getSign(long timestamp, List<String> numberList) {
        String base = "Timestamp=" + timestamp + "&NumberList=" + jsStringify(numberList);
        return hmacSha256Hex(base);
    }

    private static String hmacSha256Hex(String message) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(HMAC_KEY, "HmacSHA256"));
            byte[] digest = mac.doFinal(message.getBytes(StandardCharsets.UTF_8));
            StringBuilder hex = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                hex.append(Character.forDigit((b >> 4) & 0x0F, 16));
                hex.append(Character.forDigit(b & 0x0F, 16));
            }
            return hex.toString();
        } catch (Exception e) {
            throw new IllegalStateException("HmacSHA256 is unavailable", e);
        }
    }

    /**
     * Equivalent to JSON.stringify for a JSON array of strings:
     * no spaces, quotes/backslashes/control chars escaped, non-ASCII emitted raw.
     */
    private static String jsStringify(List<String> values) {
        StringBuilder out = new StringBuilder("[");
        for (int i = 0; i < values.size(); i++) {
            if (i > 0) {
                out.append(',');
            }
            out.append(quoteJsonString(values.get(i)));
        }
        return out.append(']').toString();
    }

    private static String quoteJsonString(String value) {
        StringBuilder out = new StringBuilder(value.length() + 2).append('"');
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            switch (c) {
                case '"'  -> out.append("\\\"");
                case '\\' -> out.append("\\\\");
                case '\b' -> out.append("\\b");
                case '\f' -> out.append("\\f");
                case '\n' -> out.append("\\n");
                case '\r' -> out.append("\\r");
                case '\t' -> out.append("\\t");
                default -> {
                    if (Character.isHighSurrogate(c) && i + 1 < value.length()
                            && Character.isLowSurrogate(value.charAt(i + 1))) {
                        out.append(c).append(value.charAt(i + 1));
                        i++;                       // valid surrogate pair: raw, like JS
                    } else if (c < 0x20 || Character.isSurrogate(c)) {
                        out.append(String.format("\\u%04x", (int) c));
                    } else {
                        out.append(c);
                    }
                }
            }
        }
        return out.append('"').toString();
    }
}