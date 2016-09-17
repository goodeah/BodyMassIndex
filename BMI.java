//Aaron Goode
//Calculates Body Mass Index
//Exam1
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		//PART A
		int height, weight;
		double bmi;
		String answer, weightCategory;
		char x;
		
		do{
			//PART B
			System.out.print("Enter your weight in pounds: ");
			weight = console.nextInt();
			
			//PART C
			System.out.print("Enter your height in inches: ");
			height = console.nextInt();

			//PART D
			bmi = (weight/Math.pow(height, 2))*703;
			
			//PART E AND F
			System.out.printf("For a weight of %d pounds and a height of %d inches, your BMI is %.2f%n", weight, height, bmi);
			if (bmi<=15.99){
				System.out.println("Your weight category is Severe thinness.");
			}else if (bmi>=16&&bmi<=16.99){
				System.out.println("Your weight category is Moderate thinness.");
			}else if (bmi>=17&&bmi<=18.49){
				System.out.println("Your weight category is Mild thinness.");
			}else if (bmi>=18.5&&bmi<=24.99){
				System.out.println("Your weight category is Normal.");
			}else if (bmi>=25&&bmi<=29.99){
				System.out.println("Your weight category is Overweight.");
			}else if (bmi>=30&&bmi<=34.99){
				System.out.println("Your weight category is Obese - class I.");
			}else if (bmi>=35&&bmi<=39.99){
				System.out.println("Your weight category is Obese - class II.");
			}else{
				System.out.println("Your weight category is Obese - class III.");
			}
			//PARTG
			System.out.print("Run again? (Y/N) ");
			answer = console.next();
			x = answer.charAt(0);
			}while (x =='y'||x=='Y');	

	}

}
