package com.priyavrat;

public class Main {

    public static void main(String[] args) {
	    int myValue=1_234_567_890;//can be separated with underscore in order to make it readable. This is a feature of java 1.8
           //integer range -2147483648 to 2147483647 . It has a width of 32
        System.out.println(myValue);
        byte myByteValue=-128;
        //range of byte is -128 to 127. It has a width of 8
         short myShortValue=-32768;
         //range of short is -32768 to 32767. It has a width of 16
        long myLongValue=100L;
        //It has a width of 64. 2^63
        System.out.println("------------------------------------------------");
        byte newByte=55;
        short newShort=5555;
        int newInt=12345;
        long result=50000L+10L*(newByte+newShort+newInt);
        System.out.println(result);

        int myIntValue=5;
        float myFloatValue=5f;
        double myDoubleValue=5d;
        System.out.println("int/3 : "+myIntValue/3);
        System.out.println("float/3 : "+myFloatValue/3);
        System.out.println("double/3 : "+myDoubleValue/3);

        char myCharValue='\u00A9'; //char can contain a single character or any unicode character.
        System.out.println("Print character "+myCharValue);

        String mystring="This is a string";
        String numberstring1="123";
        String numberstring2="456";
        String numbertotalstring=numberstring1+numberstring2;
        System.out.println("Two number string addition :"+numbertotalstring);

        String laststring="10";
        int number=50;
        laststring=laststring+number;
        System.out.println("Laststring value :"+laststring);

    }
}
