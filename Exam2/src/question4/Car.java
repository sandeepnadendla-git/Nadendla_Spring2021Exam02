/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Sandeep Nadendla
 */
public class Car extends Vehicle {
     
    private String model;

    public Car(String model, String number, String fuelType) {
        super(number, fuelType);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car " + "model=" + model + " number="+super.getNumber()+" Fuel Type="+super.getFuelType();
    }
    
    
}
