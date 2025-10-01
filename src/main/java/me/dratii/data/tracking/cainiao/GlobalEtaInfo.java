
package me.dratii.data.tracking.cainiao;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("")
public class GlobalEtaInfo {

    @SerializedName("etaDesc")
    @Expose
    private String etaDesc;
    @SerializedName("deliveryMinTime")
    @Expose
    private Long deliveryMinTime;
    @SerializedName("deliveryMaxTime")
    @Expose
    private Long deliveryMaxTime;

    public String getEtaDesc() {
        return etaDesc;
    }

    public void setEtaDesc(String etaDesc) {
        this.etaDesc = etaDesc;
    }

    public Long getDeliveryMinTime() {
        return deliveryMinTime;
    }

    public void setDeliveryMinTime(Long deliveryMinTime) {
        this.deliveryMinTime = deliveryMinTime;
    }

    public Long getDeliveryMaxTime() {
        return deliveryMaxTime;
    }

    public void setDeliveryMaxTime(Long deliveryMaxTime) {
        this.deliveryMaxTime = deliveryMaxTime;
    }

}
