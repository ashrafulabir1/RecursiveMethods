package MainMethod;

import java.util.Scanner;

import MethodsOfEquation.CombinationFormula;
import MethodsOfEquation.FactorialFormula;
import MethodsOfEquation.PermutationFormula;

public class Main {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		    
		    //Enter value of n
		    System.out.print("Enter n: ");
		    int n = in.nextInt();
		    
		    //Enter value of r
		    System.out.print("Enter r: ");
		    int r = in.nextInt();
		    
		    //find nCr using the formula
		  int nCr = CombinationFormula.combination(n,r);
		    System.out.println("nCr: "+nCr);
		    int nPr = PermutationFormula.permutation(n,r);
		    System.out.println("nPr: "+nPr);
		    int factorial = FactorialFormula.factorial(n);
		    System.out.println("Factorial: "+factorial);
		  }

	}

