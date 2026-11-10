package me.dratii.data.tracking.yuntrack;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class TrackData {

    @SerializedName("ChildCount")
    @Expose
    private Integer childCount;
    @SerializedName("TrackStatus")
    @Expose
    private String trackStatus;
    @SerializedName("IsAlert")
    @Expose
    private Boolean isAlert;
    @SerializedName("DetailingId")
    @Expose
    private String detailingId;
    @SerializedName("ProcessGroupList")
    @Expose
    private List<ProcessGroup> processGroupList;

    public Integer getChildCount() {
        return childCount;
    }

    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    public String getTrackStatus() {
        return trackStatus;
    }

    public void setTrackStatus(String trackStatus) {
        this.trackStatus = trackStatus;
    }

    public Boolean getIsAlert() {
        return isAlert;
    }

    public void setIsAlert(Boolean isAlert) {
        this.isAlert = isAlert;
    }

    public String getDetailingId() {
        return detailingId;
    }

    public void setDetailingId(String detailingId) {
        this.detailingId = detailingId;
    }

    public List<ProcessGroup> getProcessGroupList() {
        return processGroupList;
    }

    public void setProcessGroupList(List<ProcessGroup> processGroupList) {
        this.processGroupList = processGroupList;
    }

}
