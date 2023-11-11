import java.util.*;
class sumDemo{
	static int fun(int n){
		if(n==1){
			return n;
		}
		return fun(n-1)+n;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*int sum=0;
		for(int i=0;i<=n;i++){
			sum +=i;
		}
		System.out.println(sum);*/
		System.out.println(fun(n));
	}
}
