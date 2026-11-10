package me.dratii.data.tracking.yuntrack;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class ProcessGroup {

    @SerializedName("ProcessGroupDate")
    @Expose
    private String processGroupDate;
    @SerializedName("ProcessDetailList")
    @Expose
    private List<ProcessDetail> processDetailList;

    public String getProcessGroupDate() {
        return processGroupDate;
    }

    public void setProcessGroupDate(String processGroupDate) {
        this.processGroupDate = processGroupDate;
    }

    public List<ProcessDetail> getProcessDetailList() {
        return processDetailList;
    }

    public void setProcessDetailList(List<ProcessDetail> processDetailList) {
        this.processDetailList = processDetailList;
    }

}
