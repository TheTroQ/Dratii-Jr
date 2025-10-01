package me.dratii.data.tracking.cainiao;

public record CainiaoInfo(String status, String time, String desc, LatestTrace latestTrace) {
    public record Trace(String desc) {

    }
}
