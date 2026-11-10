package me.dratii.data.discord;


public class ConfigData {
    private String token;
    private String botOwnerId;
    private String debugChannelId;
    private String errorWebhookUrl;
    private String pocztaPolskaApiKey;
    private String postNlaApiKey;
    private String glsApiKey;
    private String yunTrackHMACKey;

    public ConfigData(String token, String botOwnerId, String debugChannelId, String errorWebhookUrl, String pocztaPolskaApiKey, String postNLApiKey, String glsApiKey, String yunTrackHMACKey) {
        this.token = token;
        this.botOwnerId = botOwnerId;
        this.debugChannelId = debugChannelId;
        this.errorWebhookUrl = errorWebhookUrl;
        this.pocztaPolskaApiKey = pocztaPolskaApiKey;
        this.postNlaApiKey = postNLApiKey;
        this.glsApiKey = glsApiKey;
        this.yunTrackHMACKey = yunTrackHMACKey;
    }

    public String getToken() { return token; }

    public String BotOwnerID() {
        return botOwnerId;
    }

    public void setBotOwnerID(String botOwnerID) {
        botOwnerId = botOwnerID;
    }

    public String DebugChannelID() {
        return debugChannelId;
    }

    public void setDebugChannelID(String debugChannelID) {
        debugChannelId = debugChannelID;
    }

    public String ErrorWebhookURL() {
        return errorWebhookUrl;
    }

    public void setErrorWebhookURL(String errorWebhookURL) {
        errorWebhookURL = errorWebhookURL;
    }

    public String PocztaPolskaAPIKey() {
        return pocztaPolskaApiKey;
    }

    public void setPocztaPolskaApiKey(String pocztaPolskaApiKey) {
        pocztaPolskaApiKey = pocztaPolskaApiKey;
    }

    public String PostNLApiKey() {return postNlaApiKey;}

    public void setPostNLApiKey(String postNLApiKey) {postNLApiKey = postNLApiKey;}

    public String GLSAPIkey() {return glsApiKey;}

    public String YunTrackHMACKey() {return yunTrackHMACKey;}

    public void setPostGLSAPIkey(String Glsapikey) {glsApiKey = Glsapikey;}
}
