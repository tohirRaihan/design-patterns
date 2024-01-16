package design_patterns.structural_design_patterns.adapter.demo1;

// Object adapter example
class Client {
    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The Turkey says ...");
        Client.testTurkey(turkey);

        System.out.println("\nThe Duck says ...");
        Client.testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says ...");
        Client.testDuck(turkeyAdapter);

        System.out.println("\nThe DuckAdapter says ...");
        Client.testTurkey(duckAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    private static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
