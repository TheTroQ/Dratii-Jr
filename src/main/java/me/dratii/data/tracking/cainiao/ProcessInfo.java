
package me.dratii.data.tracking.cainiao;

import java.util.List;

import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("")
public class ProcessInfo {

    @SerializedName("progressStatus")
    @Expose
    private String progressStatus;
    @SerializedName("progressRate")
    @Expose
    private Double progressRate;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("progressPointList")
    @Expose
    private List<ProgressPoint> progressPointList;

    public String getProgressStatus() {
        return progressStatus;
    }

    public void setProgressStatus(String progressStatus) {
        this.progressStatus = progressStatus;
    }

    public Double getProgressRate() {
        return progressRate;
    }

    public void setProgressRate(Double progressRate) {
        this.progressRate = progressRate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ProgressPoint> getProgressPointList() {
        return progressPointList;
    }

    public void setProgressPointList(List<ProgressPoint> progressPointList) {
        this.progressPointList = progressPointList;
    }

}
