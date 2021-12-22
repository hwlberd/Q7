import java.util.Scanner;

public class Q3 {

	public static void Addition(int number1,int number2) {
		int sum;
		sum=number1+number2;
		System.out.println("Result of your addition = "+sum);
		
	}
	
	public static void Subtraction(int number1,int number2) {
		int sub;
		sub=number1-number2;
		System.out.println("Result of your division = "+sub);
	}
	
	public static void Multiplication(int number1,int number2) {
		int mul;
		mul=number1*number2;
		System.out.println("Result of your multiplication = "+mul);
}
	
	public static void Division(int number1,int number2) {
		int div;
		div=number1/number2;
		System.out.println("Result of your division = "+div);
}
	
	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		char cntinue;
		
		do {
			
			
			int number1;
			int number2;
			int decide;
			
			
			
			System.out.println("Please enter first number :");
			number1=scanner.nextInt();
			
			System.out.println("Please enter second number :");
			number2=scanner.nextInt();
			
			
			System.out.println("Select operation :");
			System.out.println("1-Addition");
			System.out.println("2-Subtraction");
			System.out.println("3-Multiplication");
			System.out.println("4-Division");
			decide=scanner.nextInt();
			
				if(decide==1) {
					Addition(number1,number2);
				}
				
				else if(decide==2){
					Subtraction(number1,number2);
				}
				
				else if(decide==3){
					Multiplication(number1,number2);
				}
				
				else if(decide==4){
					Division(number1,number2);
				}
				
				else {
					System.out.println("Wrong input");
					break;
					
				}
			
			System.out.println("Do you wish to do another operation(Y/N)");
			cntinue=scanner.next().charAt(0);
			
			}
		while(cntinue=='y' || cntinue=='Y');
		
			System.out.println("Finished");
			scanner.close();
	}
}
