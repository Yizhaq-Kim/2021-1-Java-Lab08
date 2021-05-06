package edu.handong.csee.java.hw2.converters;

/**
 * TONToKGConverter converts ton to kilograms.
 */
public class TONToKGConverter implements Convertible {
 
    private double x;
    /**
     * Get fromValue from IntegratedConverter and set the x as same as fromValue.
     */
    public void setFromValue(double fromValue){
        
        x=fromValue;

    }
    /**
     * Just return x.
     */
    public double getConvertedValue(){

        return x;

    }
    /**
     * convert ton to kg, multiplying 1000
     */
    public void convert(){

        x*=1000;

    }
    
}
