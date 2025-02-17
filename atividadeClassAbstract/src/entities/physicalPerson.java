package entities;

public class physicalPerson extends normalPeople{
protected double valoranual;
protected double medicmoney;

public physicalPerson() {
	super();
}

	

	public physicalPerson(String name, double valoranual, double medicmoney) {
	super(name);
	this.valoranual = valoranual;
	this.medicmoney = medicmoney;
}



	public double getValoranual() {
		return valoranual;
	}



	public void setValoranual(double valoranual) {
		this.valoranual = valoranual;
	}



	public double getMedicmoney() {
		return medicmoney;
	}



	public void setMedicmoney(double medicmoney) {
		this.medicmoney = medicmoney;
	}



	@Override
	public double val() {
		if(valoranual<20000) {
			return valoranual * 0.15;
		}
		else{
			return (valoranual * 0.25)-(medicmoney * 0.50);
			}
	}
	@Override
	public double total() {		
		return val()  ;
	}

}
