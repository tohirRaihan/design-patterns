package design_patterns.creational_design_patterns.builder.demo5;

// Example of "Fluent Builder"
class Burger {
    
    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean mayonese;
    private boolean onion;
    private boolean lettuce;
    
    private Burger(BurgerBuilder burgerBuilder) {
        // Private constructor to force the use of the builder
        // Initialize all fields and you can also add validations
        this.size = burgerBuilder.size;
        this.egg = burgerBuilder.egg;
        this.extraCheese = burgerBuilder.extraCheese;
        this.mayonese = burgerBuilder.mayonese;
        this.onion = burgerBuilder.onion;
        this.lettuce = burgerBuilder.lettuce;
    }

    // Builders (Builder Pattern) should not have @Setters.
    // Builders are immutable objects and should not be modified once instantiated.
    public String getSize() {return size;}
    public boolean isEgg() {return egg;}
    public boolean isExtraCheese() {return extraCheese;}
    public boolean isMayonese() {return mayonese;}
    public boolean isOnion() {return onion;}
    public boolean isLettuce() {return lettuce;}

    public static class BurgerBuilder {
        private String size;
        private boolean egg;
        private boolean extraCheese;
        private boolean mayonese;
        private boolean onion;
        private boolean lettuce;

        public BurgerBuilder size(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder egg(boolean egg) {
            this.egg = egg;
            return this;
        }

        public BurgerBuilder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public BurgerBuilder mayonese(boolean mayonese) {
            this.mayonese = mayonese;
            return this;
        }

        public BurgerBuilder onion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public BurgerBuilder lettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Burger build() {return new Burger(this);}
    }

    @Override
    public String toString() {
        return "Burger [size=" + size + ", egg=" + egg + ", extraCheese=" + extraCheese + ", mayonese=" + mayonese
                + ", onion=" + onion + ", lettuce=" + lettuce + "]";
    }
}
