package MethodsOfEquation;

public class PermutationFormula {
	//function finds permutation of a number nPr = n!/(n-r)!
	 public static int permutation(int n, int r){
	         FactorialFormula factorial = new FactorialFormula();
	         int permutation = factorial.factorial(n) / factorial.factorial(n-r);
	        return permutation;
    }
}