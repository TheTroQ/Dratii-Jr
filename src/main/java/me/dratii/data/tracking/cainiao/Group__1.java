
package me.dratii.data.tracking.cainiao;

import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("")
public class Group__1 {

    @SerializedName("nodeCode")
    @Expose
    private String nodeCode;
    @SerializedName("nodeDesc")
    @Expose
    private String nodeDesc;
    @SerializedName("currentIconUrl")
    @Expose
    private String currentIconUrl;
    @SerializedName("historyIconUrl")
    @Expose
    private String historyIconUrl;

    public String getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    public String getNodeDesc() {
        return nodeDesc;
    }

    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc;
    }

    public String getCurrentIconUrl() {
        return currentIconUrl;
    }

    public void setCurrentIconUrl(String currentIconUrl) {
        this.currentIconUrl = currentIconUrl;
    }

    public String getHistoryIconUrl() {
        return historyIconUrl;
    }

    public void setHistoryIconUrl(String historyIconUrl) {
        this.historyIconUrl = historyIconUrl;
    }

}
