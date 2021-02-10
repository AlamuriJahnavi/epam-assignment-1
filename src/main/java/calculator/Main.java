package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		Calculator c=new Calculator();
		//for taking choice of operation
		int choice;
		String [] f={"addition","subtraction","multiplication","division"};
		while(true)
		{
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Enter other numbers to Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			if(choice<1 || choice>4)
			{
				return;
			}
			else
			{
				System.out.println("Enter First Number");
				double a=sc.nextDouble();
				System.out.println("Enter Second Number");
				double b=sc.nextDouble();
				if(choice==1)
					c.addition(a,b);
				else if(choice==2)
					c.subtraction(a,b);
				else if(choice==3)
					c.multiplication(a,b);
				else if(choice==4)
					c.division(a,b);
				//divide by zero exception
				if(b==0 && choice==4)
				{
					System.out.println("Denominator cannot be zero");
				}
				else
				{
					System.out.println(f[choice-1]+" of "+a+" and "+b+" is "+c.display_result());
				}
			}
		}
	}

}
