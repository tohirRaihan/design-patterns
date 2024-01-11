package design_patterns.creational_design_patterns.builder.demo3;

class MealDirector {
    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {this.mealBuilder = mealBuilder;}

    public Meal prepareMeal() {
        mealBuilder.addBiriyani();
        mealBuilder.addBread();
        mealBuilder.addColdDrink();
        mealBuilder.addCurry();
        return mealBuilder.build();
    }
}
