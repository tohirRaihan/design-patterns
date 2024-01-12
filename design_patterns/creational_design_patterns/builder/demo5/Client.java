package design_patterns.creational_design_patterns.builder.demo5;

class Client {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder().size("LARGE").mayonese(true).egg(true).extraCheese(false).onion(true).lettuce(false).build();
        System.out.println(burger.toString());
    }
}
