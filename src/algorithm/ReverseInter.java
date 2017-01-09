/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
 */
package algorithm;
public class ReverseInter{
	public int reverse(int x){
	int result=0;
	while(x!=0){
		int tail=x % 10;     //
		int newresult=result*10+tail;
		// ÅĞ¶ÏXÊÇ·ñÎªÁã
		if((newresult-tail)/10!=result){
			return 0;
		}
		result=newresult;
		x=x/10;
	}
	return result;
	}
}