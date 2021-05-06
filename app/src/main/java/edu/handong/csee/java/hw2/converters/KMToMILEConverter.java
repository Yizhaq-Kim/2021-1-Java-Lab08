package edu.handong.csee.java.hw2.converters;


/**
 * KMToMILEConverter converts kilometer to mile.
 */
public class KMToMILEConverter implements Convertible{

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
     * convert km to mile, dividing by 1.6.
     */
    public void convert(){

        x/=1.6;

    }

    
}
