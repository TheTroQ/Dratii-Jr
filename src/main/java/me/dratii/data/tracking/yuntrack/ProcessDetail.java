package me.dratii.data.tracking.yuntrack;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class ProcessDetail {

    @SerializedName("ProcessDate")
    @Expose
    private String processDate;
    @SerializedName("ProcessContent")
    @Expose
    private String processContent;
    @SerializedName("IsPod")
    @Expose
    private Boolean isPod;
    @SerializedName("Comments")
    @Expose
    private List<Object> comments;
    @SerializedName("marks")
    @Expose
    private List<Object> marks;
    @SerializedName("returnTrackingNumber")
    @Expose
    private String returnTrackingNumber;
    @SerializedName("IsSignature")
    @Expose
    private Boolean isSignature;

    public String getProcessDate() {
        return processDate;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    public String getProcessContent() {
        return processContent;
    }

    public void setProcessContent(String processContent) {
        this.processContent = processContent;
    }

    public Boolean getIsPod() {
        return isPod;
    }

    public void setIsPod(Boolean isPod) {
        this.isPod = isPod;
    }

    public List<Object> getComments() {
        return comments;
    }

    public void setComments(List<Object> comments) {
        this.comments = comments;
    }

    public List<Object> getMarks() {
        return marks;
    }

    public void setMarks(List<Object> marks) {
        this.marks = marks;
    }

    public String getReturnTrackingNumber() {
        return returnTrackingNumber;
    }

    public void setReturnTrackingNumber(String returnTrackingNumber) {
        this.returnTrackingNumber = returnTrackingNumber;
    }

    public Boolean getIsSignature() {
        return isSignature;
    }

    public void setIsSignature(Boolean isSignature) {
        this.isSignature = isSignature;
    }

}
