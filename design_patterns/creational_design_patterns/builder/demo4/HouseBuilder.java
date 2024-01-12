package design_patterns.creational_design_patterns.builder.demo4;

interface HouseBuilder {
    
    public void buildBasement(); 
    public void buildStructure(); 
    public void buildRoof(); 
    public void buildInterior(); 
    public House getHouse();
    
}
