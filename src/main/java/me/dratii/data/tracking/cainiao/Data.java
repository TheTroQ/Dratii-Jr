
package me.dratii.data.tracking.cainiao;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("")
public class Data {

    @SerializedName("module")
    @Expose
    private List<Module> module;
    @SerializedName("success")
    @Expose
    private Boolean success;

    public List<Module> getModule() {
        return module;
    }

    public void setModule(List<Module> module) {
        this.module = module;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
