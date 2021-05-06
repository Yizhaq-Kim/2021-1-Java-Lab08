package edu.handong.csee.java.hw2.converters;
/**
 * TONToGConverter converts ton to gram.
 */
public class TONToGConverter implements Convertible {
 
    private double x;
    /**
     * Get fromValue from IntegratedConverter and set the x as same as fromValue.
     */
    public void setFromValue(double fromValue){
        
        x=fromValue;

    }
    /**
     * just return x.
     */
    public double getConvertedValue(){

        return x;

    }
    /**
     * convert ton to gram, multiplying 10^6.
     */
    public void convert(){

        x*=1000000;

    }


}
