package web.model;

public class Car {
    private String carModel;
    private String carColor;
    private int carVIN;

    public Car() {
    }

    public Car(String carModel, String carColor, int carVIN) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.carVIN = carVIN;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarVIN() {
        return carVIN;
    }

    public void setCarVIN(int carVIN) {
        this.carVIN = carVIN;
    }
}