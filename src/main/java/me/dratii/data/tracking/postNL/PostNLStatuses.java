package me.dratii.data.tracking.postNL;

import me.dratii.data.schema.Statuses;

import java.util.HashMap;
import java.util.Map;

public class PostNLStatuses {
    public static Map<String, Statuses> Status = new HashMap<>();
    static{
        Status.put("Preparing",Statuses.INFORMATION_PREPARED);
        Status.put("Transit",Statuses.IN_TRANSIT);
        Status.put("Arrived",Statuses.IN_TRANSIT);
        Status.put("Delivered",Statuses.DELIVERED);
    }
}
