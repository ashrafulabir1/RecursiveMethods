package MethodsOfEquation;

public class CombinationFormula {
	
	//function finds combination of a number nCr = n!/((n-r)!*r!)
	  public static int combination(int n, int r){
		  FactorialFormula factorial = new FactorialFormula();
		  int combination  = factorial.factorial(n)/(factorial.factorial(n-r)*factorial.factorial(r));
		  return combination;
       }
}
