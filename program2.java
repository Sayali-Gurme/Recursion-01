import java.util.*;
class DisplayDemo{
	static void fun(int n){
		if(n==0){
			return;
		}
		System.out.print(n+" ");
		fun(n-1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*for(int i=n;i>0;i--){
			System.out.print(i+" ");
		}*/
		fun(n);
	}
}
	
