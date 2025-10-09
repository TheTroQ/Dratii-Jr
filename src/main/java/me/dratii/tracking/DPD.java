package me.dratii.tracking;

import me.dratii.data.tracking.dpd.DPDInfo;
import me.dratii.data.tracking.pocztaPolska.Data;
import okhttp3.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

import static me.dratii.Globals.*;

public class DPD {
    public static DPDInfo getTrackingInfo(String number) {
        RequestBody formBody = new FormBody.Builder()
                .add("typ", "1")
                .add("q", number)
                .build();
        // Build the request
        Request request = new Request.Builder()
                .url("https://tracktrace.dpd.com.pl/findPackage")
                .post(formBody)
                .addHeader("Cookie","DPD01c34874=01f262e2884de92c8d4e995ec14ac322cc068c982d8a44759397d6628b9afebd6d1a63e01d31b57a869095f36512ab7a7055f87c88; JSESSIONID=518080~2C23F76974FF918B0F937EB6BBF8B316; f5avraaaaaaaaaaaaaaaa_session_=ONFCBNIDACEOOLACDNFJMJJKCBHGGELFLJBNMFJDMMPLHENOHIHBOGCEBFAGCOMAHAKDNMINLHJEFDMKDAMANHFPBOIJIPKPEPPBEJEAFDMMHJCDKLKJCNNEDOKFMHGC; DPD01e71088=01f262e28822b8b54664e13767e6c388ad2a98595a4130db55948f93e4aec417af1bb46022b47690092009d66f80f72d1740fa16ea24f72455faa662857cc99dea863209531392b6ee399151d2f84946ecbd2532f6; DPD7ff31a9a029=088473a0d2ab280049703f16278ded338e992f75bcca0c4cd2ee6a0f89ee6a11ebf68a3de7814e086703f7545d23b788; DPD00000000076=088473a0d2ab28002f4a8f059e2a838a53d09a0a911ce005edd94c53a90f0d59987b2502efe8a1cbc101cbff5a35532008ca17228209d00062fc046f75250ddb7e69a87ac2093cd08ebc6e016d9f76ffd824070b040761430176608005c3bfba3e7c6b640b387a4e42e4976bf082697f61f30dca0406be7e0f8d6446e4e500008a4fcb3aa7bfdde2fe104c1217353fc4ade4ccb4ead1a8ecb9a94629276bd6f06627a6f0a0025c90a9366dba6ba1df50f48ba253ce9dbf8b47b099a8b6fa19da3bbbde87b8c3e92d3180a771b675238fe233dca0b9abb99c609d5d302056c69c247667fc94fe68c72aed3616bdeb973bd56a13045531cbf8c3bf2fc4b584a918ed8588ce67784b71; TSPD_101_DID=088473a0d2ab28002f4a8f059e2a838a53d09a0a911ce005edd94c53a90f0d59987b2502efe8a1cbc101cbff5a35532008ca17228206380058edb5e51de56b023ed0ccd375a6e140cdad0a1f60438a06c860cc92a43c048cc3600e5cd456d3a3282b77d82cb84912879a3ae8082c2faf; DPD00000000027=088473a0d2ab2000e18f5b3f047d70fcb9d4ca74396e0690788d06e69e4b05ce7448f9a56850c6e308b4199fbf1130002d11f25a29c495c1b7d2e615343faed0e5e9ac69950be381f8e8c65861d9d5cd612247522d28347d803513ff2ecfa72f")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36")
                .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8")
                .addHeader("Accept-Language", "en-US,en;q=0.5")
                .addHeader("Upgrade-Insecure-Requests", "1")
                .addHeader("Pragma", "no-cache")
                .addHeader("Cache-Control", "no-cache")
                .addHeader("Content-type", "application/x-www-form-urlencoded,charset=utf-8")
                .addHeader("Referer", "https://tracktrace.dpd.com.pl/parcelDetails?typ=1&p1="+number)
                .build();

        // Execute the request and handle the response
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            Document doc = Jsoup.parse(response.body().string());
            List<Element> elementy = doc.select("tbody tr");
            String date = elementy.getFirst().select("td:nth-child(1)").text();
            String time = elementy.getFirst().select("td:nth-child(2)").text();
            String staus = elementy.getFirst().select("td:nth-child(3)").text();
            String obj = elementy.getFirst().select("td:nth-child(4)").text();
            return (new DPDInfo(date,time,staus,obj,number));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
