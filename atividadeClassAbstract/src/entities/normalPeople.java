package entities;

public abstract class normalPeople {
protected String name;

public normalPeople() {
	super();
}

public normalPeople(String name) {
	super();
	this.name = name;
}

public String getname() {
	return name;
}

public void setname(String name) {
	this.name = name;
}
public abstract double val();
public abstract double total();
}
