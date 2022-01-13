package jss.day2.pizza;

import jss.day2.pizza.NewYorkPizza.Size;
import jss.day2.pizza.Pizza.Topping;    
 
public class PizzaDirector {     
  
  public static void main(String[] args){
    NewYorkPizza nyPizza = new NewYorkPizza.Builder(Size.LARGE).addTopping(Topping.MUSHROOM)
                                .addTopping(Topping.ONION).addTopping(Topping.HAM).build();
    System.out.println(nyPizza);
    
    
    
//    CalzonePizza czPizza = new CalzonePizza.Builder().addTopping(Topping.HAM).sauceInside().build();
//    System.out.println(czPizza);
  }
}



