package me.dratii.data.tracking.pocztaPolska;

import java.util.List;

public record PocztaPolskaInfo(MailInfo mailInfo, info info) {
    public record info(List<State> states, List<Event> events) {
    }
}