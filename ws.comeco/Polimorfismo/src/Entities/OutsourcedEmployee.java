package Entities;

public class OutsourcedEmployee extends Employee {
    private double additionalCharge;
    
    
    public OutsourcedEmployee() {
    	
    }


	public OutsourcedEmployee(String name, int hours, double valuePerHours, double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}


	public double getadditionalCharge() {
		return additionalCharge;
	}


	public void setadditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
    
   @Override
   public double payment(){
	   return super.payment() + additionalCharge * 1.1;
   }
   
    
}
