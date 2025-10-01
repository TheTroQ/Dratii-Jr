
package me.dratii.data.tracking.pocztaPolska;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class MailInfo {

    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("dispatchCountryCode")
    @Expose
    private String dispatchCountryCode;
    @SerializedName("dispatchCountryName")
    @Expose
    private String dispatchCountryName;
    @SerializedName("recipientCountryCode")
    @Expose
    private String recipientCountryCode;
    @SerializedName("recipientCountryName")
    @Expose
    private String recipientCountryName;
    @SerializedName("typeOfMailCode")
    @Expose
    private String typeOfMailCode;
    @SerializedName("typeOfMailName")
    @Expose
    private String typeOfMailName;
    @SerializedName("states")
    @Expose
    private List<State> states;
    @SerializedName("finished")
    @Expose
    private Boolean finished;
    @SerializedName("events")
    @Expose
    private List<Event> events;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public MailInfo withNumber(String number) {
        this.number = number;
        return this;
    }

    public String getDispatchCountryCode() {
        return dispatchCountryCode;
    }

    public void setDispatchCountryCode(String dispatchCountryCode) {
        this.dispatchCountryCode = dispatchCountryCode;
    }

    public MailInfo withDispatchCountryCode(String dispatchCountryCode) {
        this.dispatchCountryCode = dispatchCountryCode;
        return this;
    }

    public String getDispatchCountryName() {
        return dispatchCountryName;
    }

    public void setDispatchCountryName(String dispatchCountryName) {
        this.dispatchCountryName = dispatchCountryName;
    }

    public MailInfo withDispatchCountryName(String dispatchCountryName) {
        this.dispatchCountryName = dispatchCountryName;
        return this;
    }

    public String getRecipientCountryCode() {
        return recipientCountryCode;
    }

    public void setRecipientCountryCode(String recipientCountryCode) {
        this.recipientCountryCode = recipientCountryCode;
    }

    public MailInfo withRecipientCountryCode(String recipientCountryCode) {
        this.recipientCountryCode = recipientCountryCode;
        return this;
    }

    public String getRecipientCountryName() {
        return recipientCountryName;
    }

    public void setRecipientCountryName(String recipientCountryName) {
        this.recipientCountryName = recipientCountryName;
    }

    public MailInfo withRecipientCountryName(String recipientCountryName) {
        this.recipientCountryName = recipientCountryName;
        return this;
    }

    public String getTypeOfMailCode() {
        return typeOfMailCode;
    }

    public void setTypeOfMailCode(String typeOfMailCode) {
        this.typeOfMailCode = typeOfMailCode;
    }

    public MailInfo withTypeOfMailCode(String typeOfMailCode) {
        this.typeOfMailCode = typeOfMailCode;
        return this;
    }

    public String getTypeOfMailName() {
        return typeOfMailName;
    }

    public void setTypeOfMailName(String typeOfMailName) {
        this.typeOfMailName = typeOfMailName;
    }

    public MailInfo withTypeOfMailName(String typeOfMailName) {
        this.typeOfMailName = typeOfMailName;
        return this;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public MailInfo withStates(List<State> states) {
        this.states = states;
        return this;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public MailInfo withFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public MailInfo withEvents(List<Event> events) {
        this.events = events;
        return this;
    }

}
