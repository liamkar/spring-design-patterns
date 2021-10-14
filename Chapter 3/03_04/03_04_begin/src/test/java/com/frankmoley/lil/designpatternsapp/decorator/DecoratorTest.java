//package test.java.com.frankmoley.lil.designpatternsapp.decorator;

package com.frankmoley.lil.designpatternsapp.decorator;

import org.junit.Test;


//import main.java.com.frankmoley.lil.designpatternsapp.decorator.Pizza;

public class DecoratorTest {
    
//ingredients. So, we will create a class, called PizzaIngredient. And this will extend Pizza. We will create a public abstract method, that returns a string, called getDescription. 'Cause we're not ready to implement that yet. We also need to make our class abstract. So, now our decorator itself is actually ready to be used. So, let's create my favorite topping on a pizza... Which is pepperoni. Now, Pepperoni will extend PizzaIngredient. We'll implement some methods here. And we will start out with a constructor. And the constructor is going to take a pizza. And that pizza is going to be stored on this object. So, in our constructor, we will call super. And this.pizza, = pizza. So, now we've stored it. So, to our description, we will return this.pizza.getDescription, Plus. And then we're going to say, plus pepperoni. So, if you remember, on our ThickCrustPizza, we said that was a ThickCrustPizza. This way, the text will make sense. And now, for the cost. So, we will return a new BigDecimal. And we're going to charge 1.50 per topping. And we will add that to this.pizza.getCost. And now we're good to go. So, let's create a test for this. We'll go down to src/test/java. Base package. Create a new package down here, called decorator. And in the decorator, we will create a new Java class, called DecoratorTest. So, @Test. Public void. TestDecorator. So, what we've done here, is we've created a pizza. We're putting on its description and its cost. Now, we're going to create a pepperoni pizza. And we will pass our original pizza. And we're going to do the same thing. Copy those two values. And now we're going to do one more. In this case, we're going to do a doublePepperoni. And this time, we're going to pass our pepperoni pizza to it. Copy these two statements one more time. And bring in the double. And now, we'll run our test. So, as you might expect, we created the first ThickCrustPizza. We then decorated it with pepperoni. We then took that pepperoni pizza and decorated it with another round of pepperoni. The cost has been adjusted. The text has been adjusted. Each and every time. And now, if we added other ingredients we could do the same thing until we got to the supreme


    @Test
    public void testDecorator() {
        Pizza pizza = new ThickCrustPizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        Pepperoni pepperoni = new Pepperoni(pizza);
        System.out.println(pepperoni.getDescription());
        System.out.println(pepperoni.getCost());

        Pepperoni doublePepperoni = new Pepperoni(pepperoni);
        System.out.println(doublePepperoni.getDescription());
        System.out.println(doublePepperoni.getCost());

    }
}
