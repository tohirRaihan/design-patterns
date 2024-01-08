package design_patterns.creational_design_patterns.builder.demo1;

class Director {
    BuilderInterface myBuilder;

    public void construct(BuilderInterface builder) {
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }
}
