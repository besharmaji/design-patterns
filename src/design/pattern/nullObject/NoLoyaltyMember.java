package design.pattern.nullObject;

public class NoLoyaltyMember implements LoyaltyMember{
    @Override
    public double getDiscount() {
        return 0.0;
    }
}
