package jss.day2.pizza;

public class CalzonePizza extends Pizza {
  
  public final boolean sauceInside;

  private CalzonePizza(Builder builder){
    super(builder);
    sauceInside = builder.sauceInside;
  }

  public static class Builder extends Pizza.Builder<Builder>{
    private boolean sauceInside = false;

    public Builder sauceInside(){
       sauceInside = true;
       return this;
    }

    @Override
    public CalzonePizza build(){
      return new CalzonePizza(this);
    }

    @Override
    protected Builder self(){
      return this;
    } 

  }

  public String toString(){
    return this.sauceInside+ "";
  }

}
