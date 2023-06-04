import java.util.Scanner;

public class Main{
  public static void main(String[] args)
{

  Scanner scan = new Scanner(System.in);

  System.out.println("Welcome to Human Printer");

  System.out.println("Select a choice");

  System.out.println("1.] createHuman\n2.] exit");

  int choice = scan.nextInt();

  if(choice == 1){
    System.out.println("Choose identifier");

    System.out.println("1.] All\n2.] None\n3.] Standard");

    choice = scan.nextInt();

    if(choice == 1){
      System.out.println("Filler: ");
      String filler = scan.nextLine();
      System.out.println("Name: ");
      String name = scan.nextLine();
      System.out.println("Race ");
      String race = scan.nextLine();
      System.out.println("Gender: ");
      String gender = scan.nextLine();
      System.out.println("Ethnicity: ");
      String ethnicity = scan.nextLine();
      System.out.println("Height: ");
      double height = scan.nextDouble();
      System.out.println("Weight: ");
      double weight = scan.nextDouble();
      System.out.println("Age: ");
      int age = scan.nextInt();
      
      Human h = new Human(name, race, gender, ethnicity, height, weight, age);

      System.out.println("1.] toStandard");

      int decision = scan.nextInt();

      if(decision == 1){
        System.out.println(h.toString());
        
        scan.close();
      }
    }
    else if(choice == 2){
       Human h = new Human();

      System.out.println("1.] toStandard");

      int decision = scan.nextInt();

      if(decision == 1){
        System.out.println(h.toString());
        
        scan.close();
      }
    }
    else if(choice == 3){
      System.out.println("Let's Begin!");
      
      
      System.out.println("Filler: ");
      String filler = scan.nextLine();
      System.out.println("Name: ");
      String name = scan.nextLine();
      System.out.println("Gender: ");
      String gender = scan.nextLine();
      System.out.println("Ethnicity: ");
      String ethnicity = scan.nextLine();
      System.out.println("Age: ");
      int age = scan.nextInt();
      
      Human h = new Human(name, gender, ethnicity, age);

      System.out.println("1.] toStandard");

      choice = scan.nextInt();

      if(choice == 1){
        System.out.println(h.toStringStandard());
        scan.close();
      }
    }
  }
  else{
    System.out.println("Goodbye!");
  }
}
}

  
