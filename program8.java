import java.util.*;
class digitDemo{
	int count=0;
	int fun(int n,int a){
		if(n==0){
			return 0;
		}
		if(n%10==a){
			count++;
		}
		fun(n/10,a);
		return count;
		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		/*int count=0;
		while(n>0){
			if(n%10 ==a){
				count++;
			}
			n=n/10;
		}
		System.out.println(count);*/
		digitDemo obj=new digitDemo();
		int ret=obj.fun(n,a);
		System.out.println(ret);

	}
}
