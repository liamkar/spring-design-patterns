package main.java.com.frankmoley.lil.designpatternsapp.decorator;

public class Pepperoni extends PizzaIngredient{

    private Pizza pizza;
    public Pepperoni(Pizza pizza)  {
        super();
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return this.pizza.getDescription() + " + pepperoni";
    }

    @Override
    public BigDecimal getCost() {
        // TODO Auto-generated method stub
        return (new BigDecimal(1.50)).add(this.pizza.getCost());
    }

    
    
}
