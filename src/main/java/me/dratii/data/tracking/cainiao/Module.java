
package me.dratii.data.tracking.cainiao;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("")
public class Module {

    @SerializedName("mailNo")
    @Expose
    private String mailNo;
    @SerializedName("originCountry")
    @Expose
    private String originCountry;
    @SerializedName("destCountry")
    @Expose
    private String destCountry;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("statusDesc")
    @Expose
    private String statusDesc;
    @SerializedName("mailNoSource")
    @Expose
    private String mailNoSource;
    @SerializedName("processInfo")
    @Expose
    private ProcessInfo processInfo;
    @SerializedName("globalEtaInfo")
    @Expose
    private GlobalEtaInfo globalEtaInfo;
    @SerializedName("globalCombinedLogisticsTraceDTO")
    @Expose
    private GlobalCombinedLogisticsTraceDTO globalCombinedLogisticsTraceDTO;
    @SerializedName("latestTrace")
    @Expose
    private LatestTrace latestTrace;
    @SerializedName("detailList")
    @Expose
    private List<Detail> detailList;
    @SerializedName("daysNumber")
    @Expose
    private String daysNumber;

    public String getMailNo() {
        return mailNo;
    }

    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getDestCountry() {
        return destCountry;
    }

    public void setDestCountry(String destCountry) {
        this.destCountry = destCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public String getMailNoSource() {
        return mailNoSource;
    }

    public void setMailNoSource(String mailNoSource) {
        this.mailNoSource = mailNoSource;
    }

    public ProcessInfo getProcessInfo() {
        return processInfo;
    }

    public void setProcessInfo(ProcessInfo processInfo) {
        this.processInfo = processInfo;
    }

    public GlobalEtaInfo getGlobalEtaInfo() {
        return globalEtaInfo;
    }

    public void setGlobalEtaInfo(GlobalEtaInfo globalEtaInfo) {
        this.globalEtaInfo = globalEtaInfo;
    }

    public GlobalCombinedLogisticsTraceDTO getGlobalCombinedLogisticsTraceDTO() {
        return globalCombinedLogisticsTraceDTO;
    }

    public void setGlobalCombinedLogisticsTraceDTO(GlobalCombinedLogisticsTraceDTO globalCombinedLogisticsTraceDTO) {
        this.globalCombinedLogisticsTraceDTO = globalCombinedLogisticsTraceDTO;
    }

    public LatestTrace getLatestTrace() {
        return latestTrace;
    }

    public void setLatestTrace(LatestTrace latestTrace) {
        this.latestTrace = latestTrace;
    }

    public List<Detail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Detail> detailList) {
        this.detailList = detailList;
    }

    public String getDaysNumber() {
        return daysNumber;
    }

    public void setDaysNumber(String daysNumber) {
        this.daysNumber = daysNumber;
    }

}
