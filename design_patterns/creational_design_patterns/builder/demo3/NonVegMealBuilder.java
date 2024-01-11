package design_patterns.creational_design_patterns.builder.demo3;

class NonVegMealBuilder extends MealBuilder {

    private Meal meal;

    public NonVegMealBuilder() {meal = new Meal();}

    @Override
    public void addBiriyani() {this.meal.setBriyani("Chicken");}

    @Override
    public void addBread() {this.meal.setBread("Roti");}

    @Override
    public void addColdDrink() {this.meal.setColdDrink("Cocacola");}

    @Override
    public void addCurry() {this.meal.setCurry("Non-Veg");}

    @Override
    public Meal build() {return meal;}
    
}
