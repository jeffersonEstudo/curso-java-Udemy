package entities;

public class Products {
 public String name;
 public double price;
 public int quantity;
 
 
  public double totalValueInStock() {
	  return price * quantity; 
  }
  
  public void addProducts(int quantity) {
	  this.quantity+=quantity;
	  
  }
  
  
  
  
  public String toString() {
	  return "Product data: "
        + name
		+ ", $ "
		+ String.format("%.2f", price) 
		+ ", "
		+ quantity
		+" units, Total: $ "
		+String.format("%.2f", totalValueInStock()) ;
		
  }
  
  
}
