package me.dratii.data.tracking.yuntrack;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class LastTrackEvent {

    @SerializedName("ProcessDate")
    @Expose
    private String processDate;
    @SerializedName("ProcessContent")
    @Expose
    private String processContent;
    @SerializedName("ProcessLocation")
    @Expose
    private String processLocation;
    @SerializedName("ProcessCity")
    @Expose
    private String processCity;
    @SerializedName("TrackingStatus")
    @Expose
    private Integer trackingStatus;
    @SerializedName("CreatedOn")
    @Expose
    private String createdOn;
    @SerializedName("FlowType")
    @Expose
    private Integer flowType;
    @SerializedName("Comments")
    @Expose
    private Object comments;
    @SerializedName("dataCreateTime")
    @Expose
    private String dataCreateTime;
    @SerializedName("dataCreateTimeZone")
    @Expose
    private String dataCreateTimeZone;
    @SerializedName("followUpNotes")
    @Expose
    private String followUpNotes;
    @SerializedName("GmtProcessTimezone")
    @Expose
    private String gmtProcessTimezone;
    @SerializedName("groupTrackType")
    @Expose
    private String groupTrackType;
    @SerializedName("IsPod")
    @Expose
    private Boolean isPod;
    @SerializedName("isTrackOPStatus")
    @Expose
    private Boolean isTrackOPStatus;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("marks")
    @Expose
    private Object marks;
    @SerializedName("ProcessContentOrg")
    @Expose
    private String processContentOrg;
    @SerializedName("ProcessCountryName")
    @Expose
    private String processCountryName;
    @SerializedName("ReturnShipmentNumber")
    @Expose
    private String returnShipmentNumber;
    @SerializedName("returnTrackingNumber")
    @Expose
    private String returnTrackingNumber;
    @SerializedName("stc")
    @Expose
    private Boolean stc;

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

    public String getProcessLocation() {
        return processLocation;
    }

    public void setProcessLocation(String processLocation) {
        this.processLocation = processLocation;
    }

    public String getProcessCity() {
        return processCity;
    }

    public void setProcessCity(String processCity) {
        this.processCity = processCity;
    }

    public Integer getTrackingStatus() {
        return trackingStatus;
    }

    public void setTrackingStatus(Integer trackingStatus) {
        this.trackingStatus = trackingStatus;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getFlowType() {
        return flowType;
    }

    public void setFlowType(Integer flowType) {
        this.flowType = flowType;
    }

    public Object getComments() {
        return comments;
    }

    public void setComments(Object comments) {
        this.comments = comments;
    }

    public String getDataCreateTime() {
        return dataCreateTime;
    }

    public void setDataCreateTime(String dataCreateTime) {
        this.dataCreateTime = dataCreateTime;
    }

    public String getDataCreateTimeZone() {
        return dataCreateTimeZone;
    }

    public void setDataCreateTimeZone(String dataCreateTimeZone) {
        this.dataCreateTimeZone = dataCreateTimeZone;
    }

    public String getFollowUpNotes() {
        return followUpNotes;
    }

    public void setFollowUpNotes(String followUpNotes) {
        this.followUpNotes = followUpNotes;
    }

    public String getGmtProcessTimezone() {
        return gmtProcessTimezone;
    }

    public void setGmtProcessTimezone(String gmtProcessTimezone) {
        this.gmtProcessTimezone = gmtProcessTimezone;
    }

    public String getGroupTrackType() {
        return groupTrackType;
    }

    public void setGroupTrackType(String groupTrackType) {
        this.groupTrackType = groupTrackType;
    }

    public Boolean getIsPod() {
        return isPod;
    }

    public void setIsPod(Boolean isPod) {
        this.isPod = isPod;
    }

    public Boolean getIsTrackOPStatus() {
        return isTrackOPStatus;
    }

    public void setIsTrackOPStatus(Boolean isTrackOPStatus) {
        this.isTrackOPStatus = isTrackOPStatus;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Object getMarks() {
        return marks;
    }

    public void setMarks(Object marks) {
        this.marks = marks;
    }

    public String getProcessContentOrg() {
        return processContentOrg;
    }

    public void setProcessContentOrg(String processContentOrg) {
        this.processContentOrg = processContentOrg;
    }

    public String getProcessCountryName() {
        return processCountryName;
    }

    public void setProcessCountryName(String processCountryName) {
        this.processCountryName = processCountryName;
    }

    public String getReturnShipmentNumber() {
        return returnShipmentNumber;
    }

    public void setReturnShipmentNumber(String returnShipmentNumber) {
        this.returnShipmentNumber = returnShipmentNumber;
    }

    public String getReturnTrackingNumber() {
        return returnTrackingNumber;
    }

    public void setReturnTrackingNumber(String returnTrackingNumber) {
        this.returnTrackingNumber = returnTrackingNumber;
    }

    public Boolean getStc() {
        return stc;
    }

    public void setStc(Boolean stc) {
        this.stc = stc;
    }

}
