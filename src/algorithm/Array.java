package algorithm;

/*
 Write a class Arrays.java with the following static methods.
Method int sum(int[] arr) that adds all elements in the array arr and returns the sum.
Method String toString(int[] arr) that returns a string which, if printed, provides a nice looking print out of the array content. Used as:
     int n = {3,4,5,6,7};
     String str = Arrays.toString(n);
     System.out.println("n = " + str);
     
Method int[] addN(int[] arr, int n) that returns, an array where we have added the number n to all elements in the array arr. For example, in the case addN({1,2,3,4,5}, 2) the result is an array {3,4,5,6,7}. The array gets changed.
Method int[] reverse(int[] arr) that creates, and returns, a new array with all the elements in array arr but in reverse order. The array arr should be left unchanged.
Method void replaceAll(int[] arr, int old, int nw) that replaces all occurences of the elemnt old with nw in arr.
Method int[] sort(int[] arr) that returns a new sorted array (least element first) with the same set of elements as in arr. The array arr should be left unchanged.
Method boolean hasSubsequence(int[] arr, int[] sub) that returns true if the subsequence sub is a part of the array arr, otherwise false. For example, in the case hasSubsequence({1,2,3,4,5}, {2,3,4}) the result is true since {3,4,5} is the final part of {1,2,3,4,5}, but in case hasSubsequence({1,2,3,4,5}, {2,3,5}) the result is false.
Method int[] absDif(int[] arr1, int[] arr2) returns a new array that is the absolute difference between array arr1 and array arr2. That is result array dist(i) = |arr1(i) - arr2(i)|. For example, in the case absDif({1,2,3,4,5}, {1,1,1,1,1}) the result is {0,1,2,3,4}. Notice, that the sizes of both arrays should be the same, in case they are different the method should throw an exception and be handled within the program
 */
public class Array{
	public static void main(String[] args){
		int arr[]={3,1,5,4};
		//int rev[]=reserve(arr);
		//for(int i=0;i<rev.length;i++){
		//	System.out.print(""+rev[i]);
		//}
		//Array.replaceAll(arr, 1, 5);
			//System.out.println(Array.tostring(arr));
			Array.sort(arr);
			System.out.println(Array.tostring(arr));
	}
	static int sum(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=arr[i]+sum;
		}
		return sum;
	}
	static String tostring(int[]arr){
		String str="";
		for(int i=0;i<arr.length;i++){
			 str=str+arr[i];
		}
		return str;
	}
	static int[] addN(int[] arr,int n){
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]+n;
		}
		return arr;
	}
	static int[] reserve(int[]arr){
		
		for(int i=0;i<(arr.length/2);i++){
			int temp = 0;
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		return arr;
	}
	static void replaceAll(int[] arr, int old, int nw){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==old){
				arr[i]=nw;
			}
		}
	}
	static int[] sort(int[] arr){
		int length=arr.length;
		int [] newArr=arr;
		for(int i=0;i<length;i++){
			for(int j=0;j<length-1;j++){
				int temp=0;
				if(newArr[i]>newArr[j]){
					temp=newArr[i];
					newArr[i]=newArr[j];
					newArr[j]=temp;
					
				}
			}
		}
		return newArr;
	}
	static boolean hasSubsequence(int[] arr, int[] sub){
		if(sub.length > arr.length){
			System.out.println("The sub-array is longer than the original array. Try a different sub-array!");
		}
		else{
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == sub[0]) {
					for(int j = 0; j < sub.length; j++) {
						if(arr[i+j] != sub[j]) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
}