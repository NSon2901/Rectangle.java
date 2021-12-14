package thediscountsystem;

public class DiscountRate {
    private final double serviceDiscountPremium = 0.2;
    private final double serviceDiscountGold = 0.15;
    private final double serviceDiscountSilver = 0.1;
    private final double productDiscountPremium = 0.1;
    private final double productDiscountGold = 0.1;
    private final double productDiscountSilver = 0.1;

    public double getServiceDiscount(String s) {
        if (s.equals("Premium"))
            return 0.2;
        else if(s.equals("Gold")) {
            return 0.15;
        }else
            return 0.1;
    }

    public double getProductDiscount(String s) {
        return 0.1;
    }
}
