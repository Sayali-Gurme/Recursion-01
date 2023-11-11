import java.util.*;
class primeDemo{
	int count=0;
	int fun(int n,int temp){
		if(temp>n){
			return 0;
		}
		if(n%temp==0){
			count++;
		}
		fun(n,temp+1);

		return count;
	}
		
		
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("prime no.");
		}else{
			System.out.println("not prime no.");
		}*/
		primeDemo obj=new primeDemo();
		int ret=obj.fun(n,1);
		//System.out.println(ret);
		if(ret==2){
			System.out.println("prime no.");
		}else{
			System.out.println("not prime no.");
		}
	}
}
