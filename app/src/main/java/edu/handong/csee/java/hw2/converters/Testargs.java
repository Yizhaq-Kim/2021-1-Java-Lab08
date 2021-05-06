package edu.handong.csee.java.hw2.converters;

public class Testargs {

    static public void main(String[] args){

        if(args[0]=="Test"){
            System.out.println("If Test passed.\n");
        } else {
            System.out.println("If Test failed.\n");
        }

        if(args[0].equals("Test")){
            System.out.println("Equals Test passed.\n");
        } else {
            System.out.println("Equals Test failed.\n");
        }

    }
    
}
