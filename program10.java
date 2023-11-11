import java.util.*;
class palindromeDemo{
	int ret=0;
	boolean isfun(int n){
		int temp=n;
		if(n==0){
			return false;
		}
		ret=ret*10+(n%10);
		isfun(n/10);

		return temp==ret;

	}
	/*static boolean isfun(int n){
		int temp=n;
		int ret=0;
		while(n>0){
			ret=ret*10+(n%10);
			n =n/10;
		}

		return temp==ret;
	}*/

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		palindromeDemo obj=new palindromeDemo();
		if(obj.isfun(n)){
			System.out.println("is palindrome");
		}else{
			System.out.println("not a palindrome");
		}
	}
}

