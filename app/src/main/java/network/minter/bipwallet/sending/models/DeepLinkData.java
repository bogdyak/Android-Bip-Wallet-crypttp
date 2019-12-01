package network.minter.bipwallet.sending.models;

public class DeepLinkData {

    private String coin;
    private String amount;
    private String to;
    private String payload;
    private String memo;
    private String onsuccess;
    private String onerror;

    public DeepLinkData(String coin, String amount, String to, String payload, String memo, String onsuccess, String onerror) {
        this.coin = coin;
        this.amount = amount;
        this.to = to;
        this.payload = payload;
        this.memo = memo;
        this.onsuccess = onsuccess;
        this.onerror = onerror;
    }

    public String getCoin() {
        return coin;
    }

    public String getAmount() {
        return amount;
    }

    public String getTo() {
        return to;
    }

    public String getPayload() {
        return payload;
    }

    public String getMemo() {
        return memo;
    }

    public String getOnsuccess() {
        return onsuccess;
    }

    public String getOnerror() {
        return onerror;
    }
}
