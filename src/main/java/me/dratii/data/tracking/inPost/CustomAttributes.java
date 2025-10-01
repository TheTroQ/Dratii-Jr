
package me.dratii.data.tracking.inPost;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CustomAttributes implements Serializable
{

    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("target_machine_id")
    @Expose
    private String targetMachineId;
    @SerializedName("target_machine_detail")
    @Expose
    private me.dratii.data.tracking.inPost.TargetMachineDetail targetMachineDetail;
    @SerializedName("end_of_week_collection")
    @Expose
    private Boolean endOfWeekCollection;
    private final static long serialVersionUID = -2271835246247222634L;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public CustomAttributes withSize(String size) {
        this.size = size;
        return this;
    }

    public String getTargetMachineId() {
        return targetMachineId;
    }

    public void setTargetMachineId(String targetMachineId) {
        this.targetMachineId = targetMachineId;
    }

    public CustomAttributes withTargetMachineId(String targetMachineId) {
        this.targetMachineId = targetMachineId;
        return this;
    }

    public TargetMachineDetail getTargetMachineDetail() {
        return targetMachineDetail;
    }

    public void setTargetMachineDetail(TargetMachineDetail targetMachineDetail) {
        this.targetMachineDetail = targetMachineDetail;
    }

    public CustomAttributes withTargetMachineDetail(TargetMachineDetail targetMachineDetail) {
        this.targetMachineDetail = targetMachineDetail;
        return this;
    }

    public Boolean getEndOfWeekCollection() {
        return endOfWeekCollection;
    }

    public void setEndOfWeekCollection(Boolean endOfWeekCollection) {
        this.endOfWeekCollection = endOfWeekCollection;
    }

    public CustomAttributes withEndOfWeekCollection(Boolean endOfWeekCollection) {
        this.endOfWeekCollection = endOfWeekCollection;
        return this;
    }

}
