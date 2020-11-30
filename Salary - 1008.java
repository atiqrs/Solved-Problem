import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int employeeNumber,workedHours;
	float amountPerHour;

	employeeNumber= scan.nextInt();
	workedHours= scan.nextInt();
	amountPerHour= scan.nextFloat();


	System.out.println("NUMBER = "+employeeNumber);
	System.out.printf("SALARY = U$ %.2f\n",workedHours*amountPerHour);
  }
}
