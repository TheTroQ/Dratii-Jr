package me.dratii.data.tracking.gls;

import me.dratii.data.schema.Statuses;

import java.util.HashMap;
import java.util.Map;

public class GLSstatuses {
    public static Map<String, Statuses> Status = new HashMap<>();

    static {
        Status.put("PREADVICE", Statuses.INFORMATION_PREPARED);
        Status.put("INTRANSIT", Statuses.IN_TRANSIT);
        Status.put("INWAREHOUSE", Statuses.IN_TRANSIT);
        Status.put("INDELIVERY", Statuses.OUT_FOR_DELIVERY);
        Status.put("DELIVERED", Statuses.DELIVERED);
    }


}
