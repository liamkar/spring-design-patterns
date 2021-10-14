package main.java.com.frankmoley.lil.designpatternsapp.decorator;

public class ThickCrustPizza extends Pizza {

    public ThickCrustPizza() {
        super();
        this.descrption = "Thick crust pizza";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }
    
}
