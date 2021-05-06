package edu.handong.csee.java.hw2.converters;
/**
 *  this class is a returning value interface.
*/
public interface Convertible {

    public void setFromValue(double fromValue);
    public double getConvertedValue();
    public void convert();

}