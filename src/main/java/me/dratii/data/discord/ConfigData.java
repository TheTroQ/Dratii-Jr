package me.dratii.data.discord;


public class ConfigData {
    private String Token;
    private String BotOwnerID;
    private String DebugChannelID;
    private String ErrorWebhookURL;
    private String PocztaPolskaApiKey;
    private String PostNLApiKey;

    public ConfigData(String token, String botOwnerId, String debugChannelId, String ErrorWebhookURL, String PocztaPolskaApiKey, String PostNLApiKey) {
        this.Token = token;
        this.BotOwnerID = botOwnerId;
        this.DebugChannelID = debugChannelId;
        this.ErrorWebhookURL = ErrorWebhookURL;
        this.PocztaPolskaApiKey = PocztaPolskaApiKey;
        this.PostNLApiKey = PostNLApiKey;
    }

    public String Token() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public String BotOwnerID() {
        return BotOwnerID;
    }

    public void setBotOwnerID(String botOwnerID) {
        BotOwnerID = botOwnerID;
    }

    public String DebugChannelID() {
        return DebugChannelID;
    }

    public void setDebugChannelID(String debugChannelID) {
        DebugChannelID = debugChannelID;
    }

    public String ErrorWebhookURL() {
        return ErrorWebhookURL;
    }

    public void setErrorWebhookURL(String errorWebhookURL) {
        ErrorWebhookURL = errorWebhookURL;
    }

    public String PocztaPolskaAPIKey() {
        return PocztaPolskaApiKey;
    }

    public void setPocztaPolskaApiKey(String pocztaPolskaApiKey) {
        PocztaPolskaApiKey = pocztaPolskaApiKey;
    }

    public String PostNLApiKey() {return PostNLApiKey;}

    public void setPostNLApiKey(String postNLApiKey) {PostNLApiKey = postNLApiKey;}
}
