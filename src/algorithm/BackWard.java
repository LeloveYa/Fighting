package algorithm;

import java.util.Scanner;

/*
 * Exercise 1: Backwards 
Write a program Backwards.java that reads a line of text from the keyboard and then prints the sentence in reverse order on the screen. An execution might look like this:
Type a line of text: Hello! My name is Jonas Lundberg.
Backwards: .grebdnuL sanoJ si eman yM !olleH
 */
class BackWard{
public static void main(String[]args){
	Scanner scanner=new Scanner(System.in);
	String line= scanner.nextLine();
	//System.out.println(new StringBuffer(line).reverse().toString());
System.out.println(reverse(line));
	scanner.close();
}
public static String reverse(String s){
	   //若参数为空或去掉两边空格为"" 返回值为参数自身
	  if (s==null||s.trim()=="") {
	    return s;
	   }
	   //获得字符串的字符数组
	  char[] chs = s.toCharArray();
	   //获得字符串的长度
	  int length = s.length();

	  //循环交换数组中对称位置的字符
	  for (int i = 0; i < length/2; i++) {
	    char c = chs[i];
	    chs[i]=chs[length-1-i];//减去1 是因为 字符串数组是从0开始的
	    chs[length-1-i]=c;
	   }

	//返回由交换过的数组构成的新字符串
	  return new String(chs);
	  }
}
