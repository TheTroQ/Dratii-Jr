package me.dratii.data.tracking.yuntrack;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class TrackEventDetail {

    @SerializedName("ProcessLocation")
    @Expose
    private String processLocation;
    @SerializedName("CreatedOn")
    @Expose
    private String createdOn;
    @SerializedName("ProcessContent")
    @Expose
    private String processContent;

    public String getProcessLocation() {
        return processLocation;
    }

    public void setProcessLocation(String processLocation) {
        this.processLocation = processLocation;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getProcessContent() {
        return processContent;
    }

    public void setProcessContent(String processContent) {
        this.processContent = processContent;
    }

}
