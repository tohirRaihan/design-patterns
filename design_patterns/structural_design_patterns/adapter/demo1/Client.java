package design_patterns.structural_design_patterns.adapter.demo1;

// Object adapter example
class Client {
    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says ...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says ...");
        Client.testDuch(duck);

        System.out.println("\nThe TurkeyAdapter says ...");
        Client.testDuch(turkeyAdapter);
    }

    private static void testDuch(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
