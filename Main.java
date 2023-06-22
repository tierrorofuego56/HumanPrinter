import java.util.Scanner;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("H U M A N - P R I N T E R");
    System.out.println("Choose identifier:\n[1. All parameters]\n[2. No parameters]\n[3.Standard parameters]");
    int choice = sc.nextInt();
    switch(choice){
      case 1:
      
      sc.nextLine();
      
      System.out.print("Name: ");
      
      String n = sc.nextLine();
      
      System.out.print("Race: ");
      
      String r = sc.nextLine();
      
      System.out.print("Gender: ");
      
      String g = sc.nextLine();
      
      System.out.print("Ethnicity: ");
      
      String e = sc.nextLine();
      
      System.out.print("Height: ");
      
      double he = sc.nextDouble();
      
      System.out.print("Weight: ");
      
      double w = sc.nextDouble();
      
      System.out.print("Age: ");
      
      int a = sc.nextInt();

      System.out.println("\n");
      
      Human h = new Human(n, r, g, e, he, w, a);

      String to = h.toString();
      
      System.out.println(to + "\n");
      
      System.out.println("Which personality would you want to grant the person?");
     
      System.out.println("[Gloomy], [Irritable], [Timid], [Upbeat]");
     
      sc.nextLine();
      
      String personality = sc.nextLine();
      
      System.out.println(h.personalityStatement(personality.toUpperCase()));
      
      break;
      case 2:
      
      Human h1 = new Human();

      System.out.println();

      System.out.println(h1.toString());
      break;
      
      case 3:
      sc.nextLine();
      System.out.print("Name: ");
      String n2 = sc.nextLine();
      System.out.print("Gender: ");
      String g2 = sc.nextLine();
      System.out.print("Ethnicity: ");
      String e2 = sc.nextLine();
      System.out.println("Age: ");
      int a2 = sc.nextInt();

      Human h2 = new Human(n2, g2, e2, a2);

      System.out.println();

      System.out.println(h2.toStringStandard());

      System.out.println("Which personality would you want to grant the person?");

      System.out.println("[Gloomy], [Irritable], [Timid], [Upbeat]");

      String personality2 = sc.nextLine();

      System.out.println(h2.personalityStatement(personality2));

      break;
      
      default:
      System.out.println("Invalid choice!");
    }

    sc.close();

  }
}

  }
}
}

  
