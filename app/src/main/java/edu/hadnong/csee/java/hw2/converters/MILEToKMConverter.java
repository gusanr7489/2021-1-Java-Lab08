package edu.handong.csee.java.hw2.converters;

/**
 * This is a Convert mile to kilometer class.
*/
public class MILEToKMConverter implements Convertible{
    private double mile;
    private double kilometer;

    /**
     * using convertible interface, return kilometer value to main method. 
    */
    public void setFromValue(double fromValue) {
        mile =fromValue;
    }

    /**
     * @return double
    */
    public double getConvertedValue() {
        return kilometer;
    }

    /**
     * This is an interface method of converting kilometer.
    */
    public void convert() {
        kilometer = mile / 1.6;
    }
}
