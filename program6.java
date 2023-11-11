import java.util.*;
class sumdigitDemo{
	int sum=0;
	int fun(int n){
		if(n==0){
			return 0;
		}
		int rem=n%10;
		sum +=rem;
		fun(n/10);

		return sum;

	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*int sum=0;
		while(n>0){
			int rem=n%10;
			sum +=rem;
			n=n/10;
		}
		System.out.println(sum);*/

		sumdigitDemo obj=new sumdigitDemo();
		int ret=obj.fun(n);
		System.out.println(ret);
	}
}
	
