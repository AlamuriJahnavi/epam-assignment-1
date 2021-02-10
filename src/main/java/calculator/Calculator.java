package calculator;

public class Calculator {

	//used to store result of given operation
		double result=0;
		//performs addition of 2 numbers
		void addition(double input1,double input2)
		{
			result=input1+input2;
		}
		//performs subtraction of 2 numbers
		void subtraction(double input1,double input2)
		{
			result=input1-input2;
		}
		//performs multiplication of 2 numbers
		void multiplication(double input1,double input2)
		{
			result=input1*input2;
		}
		//performs division of 2 numbers
		void division(double input1,double input2)
		{
			result=input1/input2;
		}
		//displays result
		double display_result()
		{
			return(result);
		}
}
