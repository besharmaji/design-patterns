package design.pattern.nullObject;

public class User {
    private final LoyaltyMember loyaltyMember;

    public User(LoyaltyMember loyaltyMember) {
        this.loyaltyMember = loyaltyMember;
    }

    public double getDiscount() {
        return loyaltyMember.getDiscount();
    }
}
