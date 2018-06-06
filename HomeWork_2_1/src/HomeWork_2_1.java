import java.util.Scanner;
public class HomeWork_2_1 {
		int nu = 0 ;
		int cir = ci ;
		{
			ci /= 10 ;
			nu++ ;
		}
		ci = cir ;
		int[] arr ;
		arr = new int[nu] ;
		for(int i=0;i<nu;i++)
		{
			arr[i] = ci%10 ;
			ci /= 10 ;
		}
		int sum=0,su=0;
		for(int j=0;j<nu;j++)
		{
			su+=arr[nu-1-j]*Math.pow(10,j);
		}
		return su;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt() ;
		int nu = Test(num);
		int i=1;
		while(i!=0)
		{
			if(nu==num)
			{
				System.out.println(num);
			    i=0;
		    }
		    else
		    {
			    System.out.println(i+":"+num+"+"+nu+"="+(nu+num));
			    num=nu+num;
			    nu=Test(num);
			    i++;
		    }
		}
	}
}
