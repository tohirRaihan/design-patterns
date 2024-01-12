package design_patterns.creational_design_patterns.builder.demo4;

class Builder {
    public static void main(String[] args) {
        HouseBuilder iglooBuilder = new IglooHouseBuilder(); 
        CivilEngineer engineer = new CivilEngineer(iglooBuilder); 
  
        engineer.constructHouse(); 
  
        House house = engineer.getHouse(); 
  
        System.out.println("Builder constructed: "+ house); 
    }   
}
