package design_patterns.creational_design_patterns.builder.demo2;

interface MealBuilderInterface {
    void buildBurger();

    void buildDrink();

    Meal getMeal();
}

class VegMealBuilder implements MealBuilderInterface {
    private Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {
        vegMeal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}

class NonVegMealBuilder implements MealBuilderInterface {
    private Meal nonVegMeal = new Meal();

    @Override
    public void buildBurger() {
        nonVegMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        nonVegMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }

}
