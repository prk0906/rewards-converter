public class RewardValue
{
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

    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        if (milesValue>0)
        {
            return (int) (milesValue*1.0);
        }
        return  milesValue;
    }

//    public int getMilesValue() {
//        return Integer.parseInt(String.valueOf(milesValue*0.0035));
//    }


}
