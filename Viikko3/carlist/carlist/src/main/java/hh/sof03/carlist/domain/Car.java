package hh.sof03.carlist.domain;

public class Car {
	// attribuutit
	private String model;
	private int year;
	
	//konstruktorit
	public Car() {
		super();
		this.model = null;
		this.year = 0;
	}
	public Car(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}
	//setterit
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	// getterit
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	// toString
	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + "]";
	}
	
	

}
