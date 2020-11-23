package co.sunny;

public class CarThis {
    private String model;
    private String color;
    private String engine;

  public CarThis() {
	
  }
  
  public CarThis(String model, String color, String engine) {
	  this.model = model;
	  this.color = color;
	  this.engine = engine;
  }

  public CarThis(String model) {
	  this(model, "silver", "3,000cc");
	
  }
  public CarThis(String model, String color) {
	  this(model, color, "3,000cc");
  }
  
  public String toString() {
	  System.out.println(model);
	  System.out.println(color);
	  System.out.println(engine);
	  
	  return null;
  }
}
