package hh.backend.autoprojektini.domain;

public class Car {

    // attribuutit
    private String model;
    private long pYear;

    // konstruktorit
    // parametrillinen konstruktori
    public Car(String model, long pYear) {
        this.model = model;
        this.pYear = pYear;
    }

    // parametriton konstruktori
    public Car() {
        this.model = null;
        this.pYear = 0;
    }

    // setterit
    public void setModel(String model) {
        this.model = model;
    }

    public void setpYear(long pYear) {
        this.pYear = pYear;
    }

    // getterit
    public String getModel() {
        return model;
    }

    public long getpYear() {
        return pYear;
    }

    // toString
    @Override
    public String toString() {
        return "Car [model=" + model + ", pYear=" + pYear + "]";
    }

}
