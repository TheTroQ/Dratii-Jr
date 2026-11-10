package me.dratii.data.tracking.yuntrack;

import me.dratii.data.schema.Statuses;

import java.util.HashMap;
import java.util.Map;

public class YunTrackStatuses {
    public static Map<Integer, Statuses> Status = new HashMap<>();

    static {
        Status.put(10, Statuses.INFORMATION_PREPARED);
        Status.put(20, Statuses.IN_TRANSIT);
        Status.put(30, Statuses.IN_TRANSIT);
        Status.put(40, Statuses.OUT_FOR_DELIVERY);
        Status.put(60, Statuses.OUT_FOR_DELIVERY);
        Status.put(70, Statuses.OUT_FOR_DELIVERY);
        Status.put(100, Statuses.OUT_FOR_DELIVERY);
        Status.put(50, Statuses.DELIVERED);
    }
}

