package design.pattern.nullObject;

public class LoyaltyMemberFactory {
    public static LoyaltyMember getMember(String type) {
        return switch (type.toLowerCase()) {
            case "gold" -> new GoldMember();
            case "silver" -> new SilverMember();
            default -> new NoLoyaltyMember(); // 🔒 Safe fallback
        };
    }
}
