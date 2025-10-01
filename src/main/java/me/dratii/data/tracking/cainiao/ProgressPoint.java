
package me.dratii.data.tracking.cainiao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("")
public class ProgressPoint {

    @SerializedName("pointName")
    @Expose
    private String pointName;
    @SerializedName("light")
    @Expose
    private Boolean light;
    @SerializedName("reload")
    @Expose
    private Boolean reload;

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public Boolean getLight() {
        return light;
    }

    public void setLight(Boolean light) {
        this.light = light;
    }

    public Boolean getReload() {
        return reload;
    }

    public void setReload(Boolean reload) {
        this.reload = reload;
    }

}
