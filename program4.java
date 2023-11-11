import java.util.*;
class lengthDemo{
	int count=0;
	 int fun(int n){
		if(n==0){
			return 0;
		}
		count++;
		fun(n/10);
		//System.out.println(count);
		return count;
	}
		
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*int count=0;
		while(n>0){
			count++;
			n=n/10;
		}
		System.out.println(count);*/
		lengthDemo obj=new lengthDemo();
		int ret=obj.fun(n);
		System.out.println(ret);
	}
}
