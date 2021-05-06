package edu.handong.csee.java.hw2.converters;
/**
 * MILEToKmConverter converts Mile to kilometer
 */
public class MILEToKMConverter implements Convertible{

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
     * convert mile to km, multiplying 1.6
     */
    public void convert(){

        x*=1.6;

    }

    
}
