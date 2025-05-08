package design.pattern.nullObject;

public class GoldMember implements LoyaltyMember{
    @Override
    public double getDiscount() {
        return 0.10;
    }
}
