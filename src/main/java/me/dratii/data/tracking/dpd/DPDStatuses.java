package me.dratii.data.tracking.dpd;

import me.dratii.data.schema.Statuses;

import java.util.HashMap;
import java.util.Map;

public class DPDStatuses {
    public static Map<String, Statuses> Status = new HashMap<>();
    static{
        Status.put("Zarejestrowano dane przesyłki",Statuses.INFORMATION_PREPARED);
        Status.put("Powiadomienie mail",Statuses.INFORMATION_PREPARED);
        Status.put("Przyjęcie przesyłki w oddziale DPD",Statuses.IN_TRANSIT);
        Status.put("Przesyłka odebrana przez Kuriera",Statuses.IN_TRANSIT);
        Status.put("Przekazanie przesyłki kurierowi",Statuses.IN_TRANSIT);
        Status.put("Przeładunek w sortowni za granicą",Statuses.IN_TRANSIT);
        Status.put("Przyjęcie paczki w sortowni za granicą",Statuses.IN_TRANSIT);
        Status.put("przesyłka oczekuje na odbiór w DHL POP",Statuses.READY_FOR_PICKUP);
        Status.put("Wydanie przesyłki do doręczenia",Statuses.OUT_FOR_DELIVERY);
        Status.put("Przesyłka doręczona",Statuses.DELIVERED);
    }
}