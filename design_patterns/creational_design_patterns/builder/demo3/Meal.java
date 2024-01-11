package design_patterns.creational_design_patterns.builder.demo3;

class Meal {
    private String curry;
    private String bread;
    private String coldDrink;
    private String briyani;

    public String getCurry() {return curry;}
    public void setCurry(String curry) {this.curry = curry;}

    public String getBread() {return bread;}
    public void setBread(String bread) {this.bread = bread;}

    public String getColdDrink() {return coldDrink;}
    public void setColdDrink(String coldDrink) {this.coldDrink = coldDrink;}

    public String getBriyani() {return briyani;}
    public void setBriyani(String briyani) {this.briyani = briyani;}
    
    @Override
    public String toString() {
        return "Meal [curry=" + curry + ", bread=" + bread + ", coldDrink=" + coldDrink + ", briyani=" + briyani + "]";
    }

}
