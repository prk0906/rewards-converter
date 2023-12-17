public class RewardValue
{
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private double cashValue;
    private int milesValue;
    public RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue)
    {
        this.milesValue = milesValue;
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }




}
