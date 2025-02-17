package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
protected LocalDate manifactureDate;

public UsedProduct() {
	super();
}

public UsedProduct(String name, double price, LocalDate manifactureDate) {
	super(name, price);
	this.manifactureDate = manifactureDate;
}

public LocalDate getManifactureDate() {
	return manifactureDate;
}

public void setManifactureDate(LocalDate manifactureDate) {
	this.manifactureDate = manifactureDate;
}
@Override
public String priceTag() {
	return getName() 
			+ " (used) - $ " 
			+String.format("%.2f", price)  
			+ "(Manufacture date: " 
            + manifactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+")" ;
}

}
