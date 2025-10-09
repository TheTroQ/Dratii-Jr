package me.dratii.data.tracking.pocztaPolska;

import me.dratii.data.schema.Statuses;

import java.util.HashMap;
import java.util.Map;

public class PocztaPolskaStatuses {
    public static Map<String, Statuses> Status = new HashMap<>();

    static {
        Status.put("confirmed", Statuses.INFORMATION_PREPARED);
        Status.put("collected_from_sender", Statuses.SENT);
        Status.put("dispatched_by_sender", Statuses.SENT);
        Status.put("taken_by_courier", Statuses.IN_TRANSIT);
        Status.put("adopted_at_source_branch", Statuses.IN_TRANSIT);
        Status.put("sent_from_source_branch", Statuses.IN_TRANSIT);
        Status.put("out_for_delivery", Statuses.OUT_FOR_DELIVERY);
        Status.put("ready_to_pickup", Statuses.READY_FOR_PICKUP);
        Status.put("stack_in_box_machine", Statuses.READY_FOR_PICKUP);
        Status.put("delivered", Statuses.DELIVERED);
    }
}
