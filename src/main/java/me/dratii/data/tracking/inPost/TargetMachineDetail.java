
package me.dratii.data.tracking.inPost;

import java.io.Serializable;
import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class TargetMachineDetail implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("opening_hours")
    @Expose
    private String openingHours;
    @SerializedName("location_description")
    @Expose
    private String locationDescription;
    @SerializedName("type")
    @Expose
    private List<String> type;
    @SerializedName("location247")
    @Expose
    private Boolean location247;
    private final static long serialVersionUID = 850976448552118537L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TargetMachineDetail withName(String name) {
        this.name = name;
        return this;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public TargetMachineDetail withOpeningHours(String openingHours) {
        this.openingHours = openingHours;
        return this;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public TargetMachineDetail withLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
        return this;
    }




    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public TargetMachineDetail withType(List<String> type) {
        this.type = type;
        return this;
    }

    public Boolean getLocation247() {
        return location247;
    }

    public void setLocation247(Boolean location247) {
        this.location247 = location247;
    }

    public TargetMachineDetail withLocation247(Boolean location247) {
        this.location247 = location247;
        return this;
    }

}
