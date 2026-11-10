package me.dratii.data.tracking.yuntrack;

public record YunTrackInfo(LastTrackEvent lastTrackEvent) {
    public record lastTrackEvent(ProcessDetail detail){
    }
}
