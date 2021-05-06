package edu.handong.csee.java.hw2.converters;

/**
 * INTERFACE for various converters.
 * It simplifies typing same statements in many cases.
 */
public interface Convertible {

    /**
     * method setFromValue is used for setting field of various converters.
     * the first parameter of IntegratedConverter.main will be the fromValue.
     */
    public void setFromValue(double fromValue);

    /**
     * method getConvertedValue returns the converted value.
     */
    public double getConvertedValue();

    /**
     * method convert converts the value.
     */
    public void convert();

}