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
	   //������Ϊ�ջ�ȥ�����߿ո�Ϊ"" ����ֵΪ��������
	  if (s==null||s.trim()=="") {
	    return s;
	   }
	   //����ַ������ַ�����
	  char[] chs = s.toCharArray();
	   //����ַ����ĳ���
	  int length = s.length();

	  //ѭ�����������жԳ�λ�õ��ַ�
	  for (int i = 0; i < length/2; i++) {
	    char c = chs[i];
	    chs[i]=chs[length-1-i];//��ȥ1 ����Ϊ �ַ��������Ǵ�0��ʼ��
	    chs[length-1-i]=c;
	   }

	//�����ɽ����������鹹�ɵ����ַ���
	  return new String(chs);
	  }
}
