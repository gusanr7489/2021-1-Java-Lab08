package edu.handong.csee.java.hw2.converters;
/**
 * This is a Convert kilometer to mile class.
*/
public class KMToMILEConverter implements Convertible{
    private double kilometer;
    private double mile;

    /**
     * using convertible interface, return mile value to main method. 
    */
    public void setFromValue(double fromValue) {
        kilometer = fromValue;
    }

    /**
     * @return double
    */
    public double getConvertedValue() {
        return mile;
    }
    /**
     * This is an interface converting mile.
    */
    public void convert() {
        mile = kilometer / 1.6; 
    }

}
