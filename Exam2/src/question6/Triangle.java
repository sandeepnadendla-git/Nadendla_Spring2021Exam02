/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author S541768
 */
public class Triangle extends GeometricObject{
     private double sideOne;
    private double SideTwo;
    private double SideThree;
    private String color;
    private boolean isTriangleFilled;

    public Triangle(double sideOne, double SideTwo, double SideThree, String color, 
            boolean isTriangleFilled) {
        this.sideOne = sideOne;
        this.SideTwo = SideTwo;
        this.SideThree = SideThree;
        this.color = color;
        this.isTriangleFilled = isTriangleFilled;
    }

    @Override
    public double calcArea() {
        double p=calcPerimeter();
        return Math.sqrt(p*(p-sideOne)*(p-SideTwo)*(p-SideThree));
    }

    @Override
    public double calcPerimeter() {
       return (sideOne+SideTwo+SideThree)/2;
    }

    @Override
    public String toString() {
      return  "length of sides are: " + sideOne + "," + SideTwo + "," + SideThree
                + "\n" + "colour is: " + color + "\n" + "is filled or not: "
                + "" + isTriangleFilled + "\n" + "area: " + calcArea() + "\n" 
              + "perimter: " + calcPerimeter();        
    }   
}
