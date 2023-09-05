import java.util.Scanner;
class logicalAnd{
   public static void main(String[] args){
      double salary, yearsOnJob;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter your salary: ");
      salary = keyboard.nextDouble();
      System.out.println("Enter years on job: ");
      yearsOnJob = keyboard.nextDouble();
      
      System.out.println("salary : " + salary +" years on job is " + yearsOnJob);
      if(salary >= 100000 && yearsOnJob >= 2)
         System.out.println("You are qualifed for the load");
      else 
         System.out.println("You are disqualified");
   }
}