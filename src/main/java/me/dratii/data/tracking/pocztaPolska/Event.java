
package me.dratii.data.tracking.pocztaPolska;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Event {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("postOffice")
    @Expose
    private PostOffice postOffice;
    @SerializedName("finished")
    @Expose
    private Boolean finished;
    @SerializedName("canceled")
    @Expose
    private Boolean canceled;
    @SerializedName("state")
    @Expose
    private State__1 state;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Event withCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Event withName(String name) {
        this.name = name;
        return this;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Event withTime(String time) {
        this.time = time;
        return this;
    }

    public PostOffice getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(PostOffice postOffice) {
        this.postOffice = postOffice;
    }

    public Event withPostOffice(PostOffice postOffice) {
        this.postOffice = postOffice;
        return this;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Event withFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }

    public Boolean getCanceled() {
        return canceled;
    }

    public void setCanceled(Boolean canceled) {
        this.canceled = canceled;
    }

    public Event withCanceled(Boolean canceled) {
        this.canceled = canceled;
        return this;
    }

    public State__1 getState() {
        return state;
    }

    public void setState(State__1 state) {
        this.state = state;
    }

    public Event withState(State__1 state) {
        this.state = state;
        return this;
    }

}
