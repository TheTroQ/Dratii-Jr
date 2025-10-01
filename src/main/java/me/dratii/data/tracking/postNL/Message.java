
package me.dratii.data.tracking.postNL;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Message {

    @SerializedName("code")
    @Expose
    private Object code;
    @SerializedName("payload")
    @Expose
    private Object payload;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Message() {
    }

    public Message(Object code, Object payload) {
        super();
        this.code = code;
        this.payload = payload;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public Message withCode(Object code) {
        this.code = code;
        return this;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public Message withPayload(Object payload) {
        this.payload = payload;
        return this;
    }

}
