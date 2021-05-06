package edu.handong.csee.java.hw2.converters;

/**
 * This is a Convert TON to gram class. 
*/
public class TONToGConverter implements Convertible{
    private double ton;
    private double gram;
     
    /**
     * using convertible interface, return gram value to main method. 
    */
    public void setFromValue(double fromValue) {
        ton = fromValue;
    }

    /**
     * @return double
    */
    public double getConvertedValue() {
        return gram;
    }
    /**
     * This is an interface converting gram.
    */
    public void convert() {
        gram = ton * 1000 * 1000;
    }
}
