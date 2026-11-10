package me.dratii.data.tracking.yuntrack;
import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Result {

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Status")
    @Expose
    private Integer status;
    @SerializedName("TrackInfo")
    @Expose
    private TrackInfo trackInfo;
    @SerializedName("TrackData")
    @Expose
    private TrackData trackData;
    @SerializedName("TrackNotification")
    @Expose
    private List<Object> trackNotification;
    @SerializedName("ResendTrackList")
    @Expose
    private List<Object> resendTrackList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public TrackInfo getTrackInfo() {
        return trackInfo;
    }

    public void setTrackInfo(TrackInfo trackInfo) {
        this.trackInfo = trackInfo;
    }

    public TrackData getTrackData() {
        return trackData;
    }

    public void setTrackData(TrackData trackData) {
        this.trackData = trackData;
    }

    public List<Object> getTrackNotification() {
        return trackNotification;
    }

    public void setTrackNotification(List<Object> trackNotification) {
        this.trackNotification = trackNotification;
    }

    public List<Object> getResendTrackList() {
        return resendTrackList;
    }

    public void setResendTrackList(List<Object> resendTrackList) {
        this.resendTrackList = resendTrackList;
    }

}