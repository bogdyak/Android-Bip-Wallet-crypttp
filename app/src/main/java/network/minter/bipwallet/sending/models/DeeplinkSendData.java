package network.minter.bipwallet.sending.models;

public class DeeplinkSendData {

    private String to;
    private String amount;
    private String payload;
    private String successUrl;
    private String errorUrl;

    public DeeplinkSendData(String to, String amount, String payload, String successUrl, String errorUrl) {
        this.to = to;
        this.amount = amount;
        this.payload = payload;
        this.successUrl = successUrl;
        this.errorUrl = errorUrl;
    }

    public String getTo() {
        return to;
    }

    public String getAmount() {
        return amount;
    }

    public String getPayload() {
        return payload;
    }

    public String getSuccessUrl() {
        return successUrl;
    }

    public String getErrorUrl() {
        return errorUrl;
    }
}
