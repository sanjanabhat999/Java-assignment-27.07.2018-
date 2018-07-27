package JavaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Arithmetic {
	public Arithmetic() {
		super();
	}

	public double num1;
	public double num2;
	public double num3;

	

	public void read(double a, double b) {
		this.num1 = a;
		this.num2 = b;

	}

	public abstract void calculate();

	public void display() {
		
		System.out.println("Result: " + num3);
	}

}

class Addition extends Arithmetic {

	Addition(double num1, double num2){
		this.num1=num1;
		this.num2=num2;
		
	}
	@Override
	public void calculate() {
		System.out.println(num1+num2);
	}
}

class Subtraction extends Arithmetic {
	Subtraction(double num1, double num2){
		this.num1=num1;
		this.num2=num2;
		
	}

	@Override
	public void calculate() {
		System.out.println(num1-num2);
		
	}
}

class Multiplication extends Arithmetic {
	Multiplication(double num1, double num2){
		this.num1=num1;
		this.num2=num2;
		
	}

	@Override
	public void calculate() {
		System.out.println(num1*num2);
		
	}
}

class Division extends Arithmetic {
	Division(double num1, double num2){
		this.num1=num1;
		this.num2=num2;
		
	}

	@Override
	public void calculate() {
		System.out.println(num1/num2);
	}

	

}

public class Problem1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		Arithmetic arr[]=new Arithmetic[4];
		int choice;
		double n1,n2;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first no: ");
		n1=Double.parseDouble(br.readLine());
		
		System.out.println("Enter second no: ");
		n2=Double.parseDouble(br.readLine());
		
		System.out.println("Enter choice:1.Addition 2.Subtraction 3.Multiplication 4.Division ");
		choice=Integer.parseInt(br.readLine());
		
		
		arr[0]= new Addition(n1, n2);
		
		arr[1]= new Subtraction(n1, n2);
		
		arr[2]= new Multiplication(n1, n2);
		
		arr[3]= new Division(n1, n2);
		arr[choice-1].calculate();

		

	}

}
