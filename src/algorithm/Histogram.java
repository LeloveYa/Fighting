package algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Histogram{
	public static void main(String[] args){
	
			System.out.println("Reading integers from the file:");//NB:1,the file should be a *.txt file
			                                                      //2, the number should like 1 2 3 34 45 between the number only one space
			Scanner scanner = new Scanner(System.in);  
	   	 String  filePath; 
	   	filePath = scanner.nextLine(); 
			readTxtFile(filePath);
			scanner.close();
		}
		public static void readTxtFile(String filePath){
	        try {
	                File file=new File(filePath);
	                if(file.isFile() && file.exists()){ 
	                    InputStreamReader read = new InputStreamReader(
	                    new FileInputStream(file));
	                    BufferedReader bufferedReader = new BufferedReader(read);
	                    String lineTxt = null;
	                    while((lineTxt = bufferedReader.readLine()) != null){
	                       if(null != lineTxt){
	                        	print(lineTxt);
	                        }
	                    }
	                   
	                    read.close();
	        }else{
	            System.out.println("can not find file");
	        }
	        } catch (Exception e) {
	            System.out.println("something wrong with read file");
	            e.printStackTrace();
	        }
	     
	    }


		private static void print(String lineTxt) {
			String str[] = lineTxt.split(" ");
			Integer int1_30 = 0;
			Integer int31_60 = 0;
			Integer int61_90 = 0;
			Integer int91_100 = 0;
			Integer int101_200 = 0;
			for(int i = 0;i<str.length;i++){
				if(( 1<Integer.parseInt(str[i]) || 1==Integer.parseInt(str[i]) )  && Integer.parseInt(str[i])<30 ){
					int1_30 ++;
				}
				if(( 31<Integer.parseInt(str[i]) || 11==Integer.parseInt(str[i]) )  && Integer.parseInt(str[i])<60 ){
					int31_60 ++;
				}
				if(( 61<Integer.parseInt(str[i]) || 21==Integer.parseInt(str[i]) )  && Integer.parseInt(str[i])<90 ){
					int61_90 ++;
				}
				if(( 91<Integer.parseInt(str[i]) || 31==Integer.parseInt(str[i]) )  && Integer.parseInt(str[i])<100 ){
					int91_100 ++;
				}
				
				if(( 101<Integer.parseInt(str[i]) || 101==Integer.parseInt(str[i]) )  && Integer.parseInt(str[i])<200 ){
					int101_200 ++;
				}
			}
			int sum=int1_30+ int31_60+int61_90+int91_100;
			int sum1=int101_200;
			System.out.println("Number of integers in the interval [1,100]:"+sum);
			System.out.println("Number of integers in the interval [101,200]:"+sum1);
			System.out.println("Histogram");
			System.out.print("1-30    | ") ;
			for(int i =0 ;i<int1_30;i++){
				System.out.print("*");
			};
			System.out.println();
			
			
			System.out.print("31-60   | ") ;
			for(int i =0 ;i<int31_60;i++){
				System.out.print("*");
			};
			System.out.println();
			
			
			System.out.print("61-90   | ") ;
			for(int i =0 ;i<int61_90;i++){
				System.out.print("*");
			};
			System.out.println();
			
			
			System.out.print("91-100  | ") ;
			for(int i =0 ;i<int91_100;i++){
				System.out.print("*");
			};
			System.out.println();
			
			System.out.print("101-200 | ") ;
			for(int i =0 ;i<int101_200;i++){
				System.out.print("*");
			};
			System.out.println();	
		}
}
