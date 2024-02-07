package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("What number would you like to start with?");
		int n = in.nextInt();

		boolean[] primeArray = new boolean[n];
		
	//for (int i=0; i< primeArray.length; i++);{	
	for (int i = 2; i < n; i++) {
		for (int j = i+i; j < n; j+=i) {
		

		primeArray[j]= true;
		//System.out.println(primeArray);
		//primeArray = 
		}
	}
	
	for (int i=0; i< primeArray.length; i++){ 	
		System.out.println("The prime numbers from 1 to " + n + " are: " + primeArray[i]);

	}
	
	
		

	
		
	}

}
