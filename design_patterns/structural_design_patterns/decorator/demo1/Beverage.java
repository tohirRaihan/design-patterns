package design_patterns.structural_design_patterns.decorator.demo1;

import java.math.BigDecimal;

abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract BigDecimal cost();
}

class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public BigDecimal cost() {
        return BigDecimal.valueOf(1.99);
    }
}

class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public BigDecimal cost() {
        return BigDecimal.valueOf(.89);
    }
}

class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public BigDecimal cost() {
        return BigDecimal.valueOf(.80);
    }
}
