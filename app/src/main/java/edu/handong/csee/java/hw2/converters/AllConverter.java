package edu.handong.csee.java.hw2.converters;
/**
 * This is AllConverter for convert more than one cases in one execution.
 */
public class AllConverter {

    private double x;
    private String convertThis;
    private String xInString;
    /**
     * get fromValue from parameter of IntegratedConverter, and give the value and change its form.
     * Because the IntegratedConverter using chainmethods, return this to continue the method chain.
     */
    public AllConverter setFromValue(double fromValue){
        
        this.x=fromValue;
        this.xInString=Double.toString(x);

        return this;

    }
    /**
     * Get originalMeasure from parameter of IntegratedConverter, and give the value to the variable convertThis.
     * return this to continue the chain method.
     * */
    public AllConverter setOriginalMeasure(String originalMeasure){

        this.convertThis=originalMeasure;

        return this;

    }
    
    /**
     * make instances of various converters, which converts "convertThis" to something else.
     * call the methods in each of converters that fit to condition, and then printout the result.
     * if the amount of converters that converts from "convertThis" to other measure unit is less than two, print that AllConverter does not work for that.
     */
    public void convertAndPrintOut(){
        
        String[] args = new String[3];

        args[0]=xInString;
        args[1]=convertThis;

        if(args[1].equals("KM")){

            KMToMConverter printKMM = new KMToMConverter();
            KMToMILEConverter printKMMILE = new KMToMILEConverter();

            args[2]="M";
            printKMM.setFromValue(x);
            printKMM.convert();
            System.out.println(args[0]+" "+args[1]+" to "+ printKMM.getConvertedValue() +" "+args[2]);
            
            args[2]="MILE";
            printKMMILE.setFromValue(x);
            printKMMILE.convert();
            System.out.println(args[0]+" "+args[1]+" to "+ printKMMILE.getConvertedValue() +" "+args[2]);

        } else if (args[1].equals("TON")){

            TONToKGConverter printTONKG = new TONToKGConverter();
            TONToGConverter printTONG = new TONToGConverter();

            args[2]="KG";
            printTONKG.setFromValue(x);
            printTONKG.convert();
            System.out.println(args[0]+" "+args[1]+" to "+ printTONKG.getConvertedValue() +" "+args[2]);

            args[2]="G";
            printTONG.setFromValue(x);
            printTONG.convert();
            System.out.println(args[0]+" "+args[1]+" to "+ printTONG.getConvertedValue() +" "+args[2]);

        } else {
            System.out.println("AllConverter cannot support the measure!");
        }

    }

}
