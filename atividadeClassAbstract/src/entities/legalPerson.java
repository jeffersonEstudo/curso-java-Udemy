package entities;

public class legalPerson extends normalPeople{
protected double cashyearly;
protected int funcionarios;

public legalPerson() {
	super();
}



	public legalPerson(String name, double cashyearly, int funcionarios) {
	super(name);
	this.cashyearly = cashyearly;
	this.funcionarios = funcionarios;
}



	public double getCashyearly() {
		return cashyearly;
	}



	public void setCashyearly(double cashyearly) {
		this.cashyearly = cashyearly;
	}



	public int getFuncionarios() {
		return funcionarios;
	}



	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}



	@Override
	public double val() {
		if(funcionarios>10) {
		return	cashyearly * 0.14;
		}
		else{
			return cashyearly * 0.16;
			}
	}
	@Override
	public double total() {
		return val() ;
	}

}
