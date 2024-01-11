package design_patterns.creational_design_patterns.builder.demo3;

abstract class MealBuilder {
    public abstract void addBiriyani();
    public abstract void addBread();
    public abstract void addColdDrink();
    public abstract void addCurry();
    public abstract Meal build();
}
