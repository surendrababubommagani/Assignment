package assignment_1;

public class ArmstrongSample {

	public static void main(String[] args) {
		int n, b, sum = 0;
        System.out.print("Armstrong numbers Range from 100 to 999 is :");
        for(int i =100 ; i <= 999; i++)
        {
            n = i;
           while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
	}

}
