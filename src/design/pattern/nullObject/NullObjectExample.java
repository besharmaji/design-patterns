package design.pattern.nullObject;

public class NullObjectExample {
    public static void main(String[] args) {
        User goldUser = new User(LoyaltyMemberFactory.getMember("gold"));
        User silverUser = new User(LoyaltyMemberFactory.getMember("silver"));
        User invalidUser = new User(LoyaltyMemberFactory.getMember("platinum"));

        System.out.println("Gold User Discount: " + goldUser.getDiscount());      // 0.10
        System.out.println("Silver User Discount: " + silverUser.getDiscount()); // 0.05
        System.out.println("Invalid User Discount: " + invalidUser.getDiscount()); // 0.0
    }
}
