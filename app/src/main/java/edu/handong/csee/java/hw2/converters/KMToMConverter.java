package edu.handong.csee.java.hw2.converters;

/**
 * KMToMConverter converts km units to m units.
 * 
 */
public class KMToMConverter implements Convertible{

    private double x;

    /**
     * Get fromValue from IntegratedConverter and set the x as same as fromValue.
     */
    public void setFromValue(double fromValue){
        
        x=fromValue;

    }
    /**
     * Just return the x. */    
    public double getConvertedValue(){

        return x;

    }
    
    /**
     * convert km to m, multiplying 1000.
     */
    public void convert(){

        x*=1000;

    }
   
}
