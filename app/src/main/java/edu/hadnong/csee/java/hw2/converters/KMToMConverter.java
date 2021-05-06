package edu.handong.csee.java.hw2.converters;
/**
 * This is a Convert kilometer to meter class.
*/
public class KMToMConverter implements Convertible {
    private double kilometer;
    private double meter;
    
    /**
     * This is an interface.
     * using convertible interface, return meter value to main method. 
    */
    public void setFromValue(double fromValue) {
        kilometer = fromValue;
    }

    /**
     * This is an interface.
     * @return double
    */
    public double getConvertedValue(){
        return meter;
    }
    /**
     * This is an interface.
    */
    public void convert(){
        meter = kilometer * 1000;
    }
}
