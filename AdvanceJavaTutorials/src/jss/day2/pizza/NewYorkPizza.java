package jss.day2.pizza;

import java.util.Objects;

public class NewYorkPizza extends Pizza{

  public enum Size {SMALL, MEDIUM, LARGE}
  private final Size size;

  NewYorkPizza(Builder builder) {
    super(builder);
    this.size = builder.size;
  }
//////////// BUILD START HERE////////////////
  public static class Builder extends Pizza.Builder<Builder>{
    private final Size size;

    public Builder(Size size){
      this.size = Objects.requireNonNull(size);
    }

    @Override
    public NewYorkPizza build(){
      return new NewYorkPizza(this);
    }

    @Override
    protected Builder self() {
      return this;      
    }
  }

  public Pizza self(){
      return this;
  }

  public String toString(){
    return ""+toppings1;
  }
  
}
