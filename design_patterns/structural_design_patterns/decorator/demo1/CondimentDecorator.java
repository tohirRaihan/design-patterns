package design_patterns.structural_design_patterns.decorator.demo1;

import java.math.BigDecimal;

abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    @Override
    public abstract String getDescription();
}

class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public BigDecimal cost() {
        return beverage.cost().add(BigDecimal.valueOf(.20));
    }
}

class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public BigDecimal cost() {
        return beverage.cost().add(BigDecimal.valueOf(.10));
    }
}

class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public BigDecimal cost() {
        return beverage.cost().add(BigDecimal.valueOf(.15));
    }
}
