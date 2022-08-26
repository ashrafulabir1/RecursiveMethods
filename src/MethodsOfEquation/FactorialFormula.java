package MethodsOfEquation;

public class FactorialFormula {
	
	 public static int factorial(int number){
	 if(number==0 || number==1)
	      return 1;
	 
	    int factorial = 1;
	    for(int i=2; i<=number; i++){
	    	factorial = factorial*i;
	    }
	    return factorial;
	  }
}
