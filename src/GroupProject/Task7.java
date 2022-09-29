package GroupProject;

public class Task7 {

	public static void main(String[] args) {
		// Write a java program to check whether a given # is prime or not
		
		int num=41;
		boolean prime=true;
		if(num>1) {
			

		for(int i=2;i<=num/2;i++) {
			if(num %i==0) {
				prime=false;
				break;
			}
		} 
			if(prime)
			{
		System.out.println(num+ " is prime");
			} else {
				System.out.println(num+" is not prime");
			}
		}}


	}


