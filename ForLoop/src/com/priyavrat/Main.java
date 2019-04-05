package com.priyavrat;

public class Main {

    public static void main(String[] args) {
	int count=0;
	for(int i=1;i<=500;i++){
	    if(isPrime(i)){
	        count++;
            System.out.println("Number "+i +" is a prime number");

        }
    }
    }

    public static boolean isPrime(int number){
        if(number==1){
            return false;
        }
        for(int i=2;i<=number/2;i++){
            if(number%i==0)
                return false;
        }
        return true;
    }
}
