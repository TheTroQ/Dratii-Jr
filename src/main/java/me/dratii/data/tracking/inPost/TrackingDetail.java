
package me.dratii.data.tracking.inPost;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class TrackingDetail implements Serializable
{

    @SerializedName("origin_status")
    @Expose
    private String originStatus;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("agency")
    @Expose
    private Object agency;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("datetime")
    @Expose
    private String datetime;
    private final static long serialVersionUID = 5874468606942618261L;

    public String getOriginStatus() {
        return originStatus;
    }

    public void setOriginStatus(String originStatus) {
        this.originStatus = originStatus;
    }

    public TrackingDetail withOriginStatus(String originStatus) {
        this.originStatus = originStatus;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TrackingDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    public Object getAgency() {
        return agency;
    }

    public void setAgency(Object agency) {
        this.agency = agency;
    }

    public TrackingDetail withAgency(Object agency) {
        this.agency = agency;
        return this;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public TrackingDetail withLocation(Object location) {
        this.location = location;
        return this;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public TrackingDetail withDatetime(String datetime) {
        this.datetime = datetime;
        return this;
    }

}
