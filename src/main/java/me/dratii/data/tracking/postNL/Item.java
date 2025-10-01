
package me.dratii.data.tracking.postNL;

import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Item {

    @SerializedName("item")
    @Expose
    private String item;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("destination_code")
    @Expose
    private String destinationCode;
    @SerializedName("destination_name")
    @Expose
    private String destinationName;
    @SerializedName("client_code")
    @Expose
    private String clientCode;
    @SerializedName("freight_forwarder")
    @Expose
    private Object freightForwarder;
    @SerializedName("hawb")
    @Expose
    private Object hawb;
    @SerializedName("mawb")
    @Expose
    private Object mawb;
    @SerializedName("events")
    @Expose
    private List<Event> events;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    public Item(String item, Object message, String destinationCode, String destinationName, String clientCode, Object freightForwarder, Object hawb, Object mawb, List<Event> events) {
        super();
        this.item = item;
        this.message = message;
        this.destinationCode = destinationCode;
        this.destinationName = destinationName;
        this.clientCode = clientCode;
        this.freightForwarder = freightForwarder;
        this.hawb = hawb;
        this.mawb = mawb;
        this.events = events;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Item withItem(String item) {
        this.item = item;
        return this;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Item withMessage(Object message) {
        this.message = message;
        return this;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public Item withDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
        return this;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public Item withDestinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public Item withClientCode(String clientCode) {
        this.clientCode = clientCode;
        return this;
    }

    public Object getFreightForwarder() {
        return freightForwarder;
    }

    public void setFreightForwarder(Object freightForwarder) {
        this.freightForwarder = freightForwarder;
    }

    public Item withFreightForwarder(Object freightForwarder) {
        this.freightForwarder = freightForwarder;
        return this;
    }

    public Object getHawb() {
        return hawb;
    }

    public void setHawb(Object hawb) {
        this.hawb = hawb;
    }

    public Item withHawb(Object hawb) {
        this.hawb = hawb;
        return this;
    }

    public Object getMawb() {
        return mawb;
    }

    public void setMawb(Object mawb) {
        this.mawb = mawb;
    }

    public Item withMawb(Object mawb) {
        this.mawb = mawb;
        return this;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Item withEvents(List<Event> events) {
        this.events = events;
        return this;
    }

}
