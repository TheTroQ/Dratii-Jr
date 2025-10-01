
package me.dratii.data.tracking.postNL;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Event {

    @SerializedName("datetime_local")
    @Expose
    private String datetimeLocal;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("status_description")
    @Expose
    private String statusDescription;
    @SerializedName("country_code")
    @Expose
    private Object countryCode;
    @SerializedName("country_name")
    @Expose
    private Object countryName;
    @SerializedName("nondelivery_status")
    @Expose
    private Object nondeliveryStatus;
    @SerializedName("category")
    @Expose
    private String category;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Event() {
    }

    public Event(String datetimeLocal, Integer status, String statusDescription, Object countryCode, Object countryName, Object nondeliveryStatus, String category) {
        super();
        this.datetimeLocal = datetimeLocal;
        this.status = status;
        this.statusDescription = statusDescription;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.nondeliveryStatus = nondeliveryStatus;
        this.category = category;
    }

    public String getDatetimeLocal() {
        return datetimeLocal;
    }

    public void setDatetimeLocal(String datetimeLocal) {
        this.datetimeLocal = datetimeLocal;
    }

    public Event withDatetimeLocal(String datetimeLocal) {
        this.datetimeLocal = datetimeLocal;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Event withStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Event withStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }

    public Object getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Object countryCode) {
        this.countryCode = countryCode;
    }

    public Event withCountryCode(Object countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public Object getCountryName() {
        return countryName;
    }

    public void setCountryName(Object countryName) {
        this.countryName = countryName;
    }

    public Event withCountryName(Object countryName) {
        this.countryName = countryName;
        return this;
    }

    public Object getNondeliveryStatus() {
        return nondeliveryStatus;
    }

    public void setNondeliveryStatus(Object nondeliveryStatus) {
        this.nondeliveryStatus = nondeliveryStatus;
    }

    public Event withNondeliveryStatus(Object nondeliveryStatus) {
        this.nondeliveryStatus = nondeliveryStatus;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Event withCategory(String category) {
        this.category = category;
        return this;
    }

}
