
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lower = 9;
		int upper = 888;
		int sum = 0;
		while (lower <= upper){
			sum +=lower;
			lower++;
		}
		System.out.println("The total is: " + sum);
		lower = 1;
		upper = 1000;
		sum = 0;
		while (lower <= upper){
			sum +=lower;
			lower+=2;
		}
		System.out.println("The total of odd numbers is: " + sum);
		lower = 7;
		upper = 1000;
		sum = 0;
		while (lower <= upper){
			sum +=lower;
			lower+=7;
		}
		System.out.println("The total of numbers divisible by 7 is: " + sum);
		lower = 1;
		upper = 100;
		sum = 0;
		while (lower <= upper){
			sum = (sum + (lower*lower));
			lower++;
		}
		System.out.println("The total of square of numbers is: " + sum);
		
		lower = 1;
		upper = 1000;
		sum = 0;
		while (lower <= upper){
			if((lower%13==0 || lower%15==0 || lower%17==0) && lower%30!=0)
			sum +=lower;
			lower++;
		}
		System.out.println("The sum of numbers between 1 and 1000 that are divisible "
				+ "by 13, 15, or 17 but not by 30: " + sum);
	}

}
