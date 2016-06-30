/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int[] getdigits(int n){
		String s = String.valueOf(n);
		int res[] = new int[s.length()];
		int i = 0;
		while(n>0){
			int m = n%10;
			res[i++] = m;
			n = n/10;
		}
		return res;
	}
	static int sum(int arr[]){
		int sum = 0;
		for(int i:arr){
			sum = sum + i*i;
		}
		return sum;
	}
	static int isHappy(int n){
		HashSet<Integer> set = new HashSet<Integer>();
		int count = 0;
		while(!set.contains(n)){
			set.add(n);
			n = sum(getdigits(n));
			count++;
			if(n==1) return  count;
		}
		return -1;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.println(isHappy(n));
	}
}
