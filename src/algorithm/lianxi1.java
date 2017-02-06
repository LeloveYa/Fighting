package algorithm;

import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

import javax.print.attribute.standard.RequestingUserName;
import javax.swing.DefaultFocusManager;

// 兔子算法 每个月兔子的对数而不是总数
public class lianxi1{
	/*public static void main(String[] args){
		System.out.println("First month: 1");
		System.out.println("Second month: 1");
		int f1=1, f2=1,f,M=24;
		for(int i=3;i<=M;i++){
			f=f2;
			f2=f1+f2;
			f1=f;
			System.out.println(i+":"+f2 );
		}
	}*/
	// 判断101-200有多少个素数，并输出所有素数 
	/*public static void main(String[]args){
		int count=0;
		for(int i=101;i<200;i+=2){// 也可以 i+=1; 
			boolean b=false;
			for(int j=2;j<Math.sqrt(i);j++){
				if(i%j==0){
					b=false;
					break;
				}
				else{
					b=true;
				}
		
			}
			if(b==true){
				count++;
				System.out.println(i);
			}
		}
		System .out.println(count);
	}*/
	//水仙花数
	/*public static void main(String[]args){
		int num1,num2,num3;
		for(int i=101;i<1000;i++){
			num3=i/100;
			num2=i%100/10;
			num1=i%10;
			if((num1*num1*num1+num2*num2*num2+num3*num3*num3)==i){
				System.out.println(i+"是一个水仙花数");
			}
		}
	}*/
	// 把一个正整数分解因素 90=2*3*3*5
/*	public static void main(String []args){
		Scanner scanner=new Scanner(System.in);
		int n= scanner.nextInt();
		int k=2;
		System.out.print(n+"=");
		while(k<=n){
			if(k==n){
				System.out.print(n);
				break;
			}else if(n%k==0){
				System.out.print(k+"*");
				n=n/k;
			}
			else {
				k++;
			}
		}
			
	}*/
	// 条件运算符号
	/*public static void main(String[]args){
		int x;
		char grade;
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入成绩");
		x=scanner.nextInt();
		grade=x>=90 ? 'A'
			:x>=60  ? 'B'
		    :'C';
			System.out.println("等级为"+grade);
	}*/
	
	// 最大公约数最小公倍数
	/*public static void main(String[]args){
		int a,b,m;
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入一个整数：   ");
		a=scanner.nextInt();
		System.out.println("输入一个整数：   ");
		b=scanner.nextInt();
		deff cd =new deff();
		m= cd.deff(a,b);
		int n= a*b/m;
		System.out.println("最大公约数：   "+m);
		System.out.println("最小公倍数：   "+n);
	}
	/*class deff{
	public int deff(int x,int y){
		int t;
		if(x<y){
			t=x;
			x=y;
			y=t;
		}
		while(y!=0){
			if(x==y)return x;
			else{
				int k=x%y;
				x=y;
				y=k;
			}
		}
		return x;
		
	}
}*/
	//统计一段话中数字 字母空格
	/*public static void main(String[] args){
		int digital=0;
		int character=0;
		int other=0;
		int space=0;
		char[]ch=null;
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		ch=string.toCharArray();
		for(int i=0;i<ch.length;i++){
			char c= ch[i];
			if(Character.isDigit(c)){
				digital++;
			}else if(Character.isLetter(c)){
				character++;
				
			}else if (Character.isSpace(c)){
				space++;
			}else{
				other++;
			}
		}
		System.out.println("数字个数"+digital);
		System.out.println("字母个数"+character);
		System.out.println("空格个数"+space);
		System.out.println("其他"+other);
	}*/
	
//S=a+aa+aaa+aaaa
	/*public static void main(String [] args){
		long a, b=0,sum=0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("输入数字a的值：  ");
		a=scanner.nextInt();
		System.out.println("请输入要相加的项数：");
		int n=scanner.nextInt();
		int i=0;
		while(i<n){
			b=b+a;
			sum=sum+b;
			a=a*10;
			++i;
			//i++;
		}
		System.out.println(sum);
		}*/
	//一个数恰好等于因子之和6=1+2+3
	/*public static void main(String []args){
		for(int i=1;i<1000;i++){
			int t=0;
			for (int j=1;j<=i/2;j++){
				if(i%j==0){
					t=t+j;
				}
			}
			if(t==i){
				System.out.println(i+" ");
			}
		}
	}*/
	
	//100米小球起跳问题
	/*public static void main(String[] args) { 
        /*float H=100f; 
        int count=1; 
        System.out.println(H*(3-1.0/Math.pow(2,count-2)));                 
        System.out.println(H/Math.pow(2,count)); 
		double h=100,s=100;
		for(int i=1;i<1;i++){
			s=s+h;
			h=h/2;
		}
		System.out.println(s);
		System.out.println(h/2);
} */
}
