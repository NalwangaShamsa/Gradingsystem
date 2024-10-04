package gradecalculator;
import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner=new Scanner(System.in);
   int numStudents=5;
   for(int i=0; i<=numStudents;i++) {
   System.out.print("Enter score (0-100):");
   int score=scanner.nextInt();
   if(score>=90) {
	   System.out.println("Student"+i+"Grade A");
   }else if(score>=80) {
	   System.out.println("Student"+i+"Grade B");
   }else if(score>=70) {
	   System.out.println("Student"+i+"Grade C");
	   }else if(score>=60) {
		   System.out.println("Student"+i+"Grade D");
		   }else  {
			   System.out.println("Student"+i+"Grade F");
			   }
   }
	}

}
