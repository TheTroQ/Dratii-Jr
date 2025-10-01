
package me.dratii.data.tracking.pocztaPolska;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Data {

    public MailInfo mailInfo() {
        return mailInfo;
    }

    @SerializedName("mailInfo")
    @Expose
    private MailInfo mailInfo;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("mailStatus")
    @Expose
    private Integer mailStatus;

    public MailInfo getMailInfo() {
        return mailInfo;
    }

    public void setMailInfo(MailInfo mailInfo) {
        this.mailInfo = mailInfo;
    }

    public Data withMailInfo(MailInfo mailInfo) {
        this.mailInfo = mailInfo;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Data withNumber(String number) {
        this.number = number;
        return this;
    }

    public Integer getMailStatus() {
        return mailStatus;
    }

    public void setMailStatus(Integer mailStatus) {
        this.mailStatus = mailStatus;
    }

    public Data withMailStatus(Integer mailStatus) {
        this.mailStatus = mailStatus;
        return this;
    }

}
