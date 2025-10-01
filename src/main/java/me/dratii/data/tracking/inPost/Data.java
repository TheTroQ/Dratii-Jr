
package me.dratii.data.tracking.inPost;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import me.dratii.data.tracking.inPost.CustomAttributes;
import me.dratii.data.tracking.inPost.TrackingDetail;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Data implements Serializable
{

    @SerializedName("tracking_number")
    @Expose
    private String trackingNumber;
    @SerializedName("service")
    @Expose
    private String service;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("custom_attributes")
    @Expose
    private CustomAttributes customAttributes;
    @SerializedName("tracking_details")
    @Expose
    private List<TrackingDetail> trackingDetails;
    @SerializedName("expected_flow")
    @Expose
    private List<Object> expectedFlow;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    private final static long serialVersionUID = 3609886077953108618L;

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Data withTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Data withService(String service) {
        this.service = service;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Data withType(String type) {
        this.type = type;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data withStatus(String status) {
        this.status = status;
        return this;
    }

    public CustomAttributes getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(CustomAttributes customAttributes) {
        this.customAttributes = customAttributes;
    }

    public Data withCustomAttributes(CustomAttributes customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }

    public List<TrackingDetail> getTrackingDetails() {
        return trackingDetails;
    }

    public void setTrackingDetails(List<TrackingDetail> trackingDetails) {
        this.trackingDetails = trackingDetails;
    }

    public Data withTrackingDetails(List<TrackingDetail> trackingDetails) {
        this.trackingDetails = trackingDetails;
        return this;
    }

    public List<Object> getExpectedFlow() {
        return expectedFlow;
    }

    public void setExpectedFlow(List<Object> expectedFlow) {
        this.expectedFlow = expectedFlow;
    }

    public Data withExpectedFlow(List<Object> expectedFlow) {
        this.expectedFlow = expectedFlow;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Data withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Data withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

}
