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
public class Vehicle {
    
    private String number;
    private String fuelType;

    public Vehicle(String number, String fuelType) {
        this.number = number;
        this.fuelType = fuelType;
    }

    public String getNumber() {
        return number;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "number=" + number + ", fuelType=" + fuelType + '}';
    }
    
    
}
