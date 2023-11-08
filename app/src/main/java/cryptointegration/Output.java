package coinbase;

public class Output {
    public String currCode;
    public Double currVal;
    public String percentGainOrLoss;
    public String oneBtcBoughtOneDayAgo;

    public String toString() {
        String output = "";
        output = "{currencyCode: " + currCode + ", " +
        "currencyValue: " + currVal.toString() + ", " +
        "percentGainOrLoss: " + percentGainOrLoss + ", " + 
        "oneBtcBoughtOneDayAgoValueInCurrencyNow: " + oneBtcBoughtOneDayAgo + "}";
        return output;

    }
}
