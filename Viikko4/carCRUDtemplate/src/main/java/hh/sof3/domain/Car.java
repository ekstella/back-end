package hh.sof3.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
	// attribuutit
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String model;
	@Column(name = "pYear")
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
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", year=" + year + "]";
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}