
package me.dratii.data.tracking.cainiao;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("")
public class LatestTrace {

    @SerializedName("time")
    @Expose
    private Long time;
    @SerializedName("timeStr")
    @Expose
    private String timeStr;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("standerdDesc")
    @Expose
    private String standerdDesc;
    @SerializedName("descTitle")
    @Expose
    private String descTitle;
    @SerializedName("timeZone")
    @Expose
    private String timeZone;
    @SerializedName("actionCode")
    @Expose
    private String actionCode;
    @SerializedName("group")
    @Expose
    private Group__1 group;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getTimeStr() {
        return timeStr;
    }

    public void setTimeStr(String timeStr) {
        this.timeStr = timeStr;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStanderdDesc() {
        return standerdDesc;
    }

    public void setStanderdDesc(String standerdDesc) {
        this.standerdDesc = standerdDesc;
    }

    public String getDescTitle() {
        return descTitle;
    }

    public void setDescTitle(String descTitle) {
        this.descTitle = descTitle;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public Group__1 getGroup() {
        return group;
    }

    public void setGroup(Group__1 group) {
        this.group = group;
    }

}
