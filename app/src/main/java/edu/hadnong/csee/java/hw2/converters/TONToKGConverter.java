package edu.handong.csee.java.hw2.converters;

/**
 * This is a Convert ton to kilogram class.
*/
public class TONToKGConverter implements Convertible{
    private double ton;
    private double kilogram;
    
    /**
     * using convertible interface, return kilogram value to main method. 
    */
    public void setFromValue(double fromValue) {
        ton = fromValue;
    }

    /**
     * @return double
    */
    public double getConvertedValue() {
        return kilogram;
    }
    /**
     * This is an interface converting kilogram.
    */
    public void convert() {
        kilogram = ton  * 1000;
    }
}
