package design.pattern.nullObject;

public class SilverMember implements LoyaltyMember{
    @Override
    public double getDiscount() {
        return 0.05;
    }
}
