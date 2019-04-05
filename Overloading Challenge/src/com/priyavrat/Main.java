package com.priyavrat;

public class Main {

    public static void main(String[] args) {
        double one=calcFeetAndInchesToCentimeters(4,11);
        System.out.println(one);

        double two=calcFeetAndInchesToCentimeters(58);
        System.out.println(two);
    }

    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet>=0 && inches>=0 && inches <=12){
            double cms=(feet*12+inches)*2.54;
            return cms;
        }
        else return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0){
            double feets=(int)inches/12;
            inches=(int)inches-(feets*12);
            double result=calcFeetAndInchesToCentimeters(feets,inches);
            return result;
        }
        else return -1;
    }
}
