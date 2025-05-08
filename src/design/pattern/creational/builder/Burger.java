package design.pattern.creational.builder;

public class Burger {
    private final String bun;
    private final String patty;
    private final boolean cheese;
    private final boolean lettuce;
    private final boolean tomato;

    // Private constructor so object is created only via Builder
    private Burger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
    }

    @Override
    public String toString() {
        return "Burger [Bun: " + bun + ", Patty: " + patty +
                ", Cheese: " + cheese + ", Lettuce: " + lettuce +
                ", Tomato: " + tomato + "]";
    }

    // Builder Class (Static Inner Class)
    static class BurgerBuilder {
        private String bun;
        private String patty;
        private boolean cheese;
        private boolean lettuce;
        private boolean tomato;

        public BurgerBuilder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public BurgerBuilder setPatty(String patty) {
            this.patty = patty;
            return this;
        }

        public BurgerBuilder addCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder addLettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public BurgerBuilder addTomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        // Final build method to create Burger object
        public Burger build() {
            return new Burger(this);
        }
    }
}
