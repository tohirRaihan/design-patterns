package design_patterns.creational_design_patterns.builder.demo3;

class Client {
    public static void main(String[] args) {
        Meal meal = new MealDirector(new VegMealBuilder()).prepareMeal();
        System.out.println(meal);
    }
}
