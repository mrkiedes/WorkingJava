// 2 params and 2 constructors
// Attritbutes (params/vars) come first
// Constructors MUST set values

public class Pizza{
  private String toppping;
  private int size;

  public Pizza{
    topping = "cheese";
    size = 8;
  }

  public Pizza(String topping, int size){
    this.topping = topping;
    this.size = size;
  }

  public String getTopping(){ return topping; }
  public int getSize(){ return size; }

  public void setTopping(String topping){ this.topping = topping; }
  public void setSize(int size){ this.size = size; }

}
