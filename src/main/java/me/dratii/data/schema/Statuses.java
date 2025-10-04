package me.dratii.data.schema;

import java.util.EnumMap;

public enum Statuses {
    UNKNOWN(0, "???", ""),
    INFORMATION_PREPARED(1, "INFORMATION_PREPARED", "📝"),
    SENT(2, "SENT", "✉️"),
    IN_TRANSIT(3, "IN_TRANSIT", "🚚"),
    OUT_FOR_DELIVERY(4, "OUT_FOR_DELIVERY", "🚶"),
    READY_FOR_PICKUP(5, "READY_FOR_PICKUP", "📦"),
    DELIVERED(6, "DELIVERED", "✅"),
    FAILURE(7, "FAILURE", "❗");

    private final int value;
    private final String name;
    private final String emoji;

    Statuses(int value, String name, String emoji) {
        this.value = value;
        this.name = name;
        this.emoji = emoji;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getEmoji() {
        return emoji;
    }

    public static final java.util.Map<Integer, Statuses> valueMap = new java.util.HashMap<>();
    public static final java.util.Map<String, Statuses> nameMap = new java.util.HashMap<>();
    public static final java.util.Map<String, Statuses> emojiMap = new java.util.HashMap<>();

    static {
        for (Statuses status : Statuses.values()) {
            valueMap.put(status.getValue(), status);
            nameMap.put(status.getName(), status);
            emojiMap.put(status.getEmoji(), status);
        }
    }

    public static Statuses getByValue(int value) {
        return valueMap.get(value);
    }

    public static Statuses getByName(String name) {
        return nameMap.get(name);
    }
    public static void init(){}
}
