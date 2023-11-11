import java.util.*;
class factorialDemo{
	static int fun(int n){
		if(n==0){
			return 1;
		}
		return fun(n-1)*n;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println(fact);*/
		int ret=fun(n);
		System.out.println(ret);
	}
}
