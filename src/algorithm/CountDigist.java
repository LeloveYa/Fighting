package algorithm;

import java.util.Scanner;

/*
 CountDigits
Write a program CountDigits.java that for an arbitrary positive 
integer N (read from the keyboard) prints the number of zeros, odd digits, 
even digits and computes the sum of all digits. An execution might look like this:
Provide a positive integer: 6789500
Zeros: 2
Odd: 3
Even: 2
Sum: 35
 */
public class CountDigist{
	public static void main(String[]args){
		System.out.println("Please input a positive integer:");
		Scanner scanner =new Scanner(System.in);
		String N= scanner.next();
		int s=N.length();
		int zeros = 0;
		int evens = 0;
		int odds = 0;
		int sum = 0;
		for(int i=0;i<s;i++){
			int digit=Character.getNumericValue(N.charAt(i));//Key point
			sum=sum+digit;
			if(digit==0){
				zeros++;
			}
			else if(digit%2==0){
				evens++;
			}
			else if(digit%2!=0){
				odds++;
			}
		}
		scanner.close();
		System.out.println("sum"+sum);
		System.out.println("zeros"+zeros);
		System.out.println("evens"+evens);
		System.out.println("odds"+odds);
		
	}
}