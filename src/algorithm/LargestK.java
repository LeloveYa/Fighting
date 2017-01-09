package algorithm;

import java.util.Scanner;

/*
 * LargestK
Write a program LargestK.java that for 
an arbitrary positive integer N (read from the keyboard) 
computes the largest K such that 0+2+4+6+8+...+K ¡Ü N. 
For example N=5 => K=2 (0+2<5 but 0+2+4>5),
 N=110 => K=20, etc.
 */
public class  LargestK{
	public static void main(String[]args){
		System.out.println("please input positive number");
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		if(N<=0){
			System.out.println("N should be positive number");
		}
		else{
			int sum=0;
			int i=0;
			while(sum<=N){
				sum=sum+2*i;
				i++;
			}
			System.out.println(2*(i-2));
			scanner.close();
		}
	}
	
}