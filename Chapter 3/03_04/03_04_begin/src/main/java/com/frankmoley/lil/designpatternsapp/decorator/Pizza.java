package main.java.com.frankmoley.lil.designpatternsapp.decorator;

public abstract class Pizza {

    protected Sting description;

    public String getDescription() {
        return description;
    }

    public abstract BigDecimal getCost();
}