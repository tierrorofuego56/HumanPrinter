import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to Human Printer");
    
    System.out.println("Choose an option:\n 1.)createHuman\n 2.)exit");

    int instruction = scan.nextInt();

    
    
    if(instruction == 1)
    {
      System.out.println("Choose a modifier:\n 1.)All\n 2.)None \n 3.)Standard");

      int modi = scan.nextInt();

      if(modi == 1)
      {
        System.out.println("Filler. Ignore");
        String filler = scan.nextLine();
        System.out.println("Input a name: ");
        String name = scan.nextLine();
        System.out.println("Input a race: ");
        String race = scan.nextLine();
        System.out.println("Input a gender: ");
        String gender = scan.nextLine();
        System.out.println("Input an ethnicity: ");
        String ethnicity = scan.nextLine();
        System.out.println("Input a height: ");
        double height = scan.nextDouble();
        System.out.println("Input a weight: ");
        double weight = scan.nextDouble();
        System.out.println("Input an age: ");
        int age = scan.nextInt();

        Human h = new Human(filler, name, race, gender, ethnicity, height, weight, age);

        System.out.println("Choose an accessor:\n 1.)toString");
        System.out.println("Choose an mutator:\n 2.)setIdentifer");

        int method = scan.nextInt();

        if(method == 1)
        {
          System.out.println(h.toString());
        }
        else if(method == 2)
        {
          System.out.println("Filler. Ignore");

          String fillerString = scan.nextLine();

          System.out.println("Do you want to change the name? Choose Y/N");

          String change1 = scan.nextLine();

          if(change1.equalsIgnoreCase("y"))
          {
            System.out.println("Change the name: ");
            String n = scan.nextLine();
            h.setName(n);
          }
          else if(change1.equalsIgnoreCase("n"));
          {
            System.out.println("Noted");
          }
          
          System.out.println("Do you want to change the gender? Choose Y/N");

          String change2 = scan.nextLine();
          
          if(change2.equalsIgnoreCase("y"))
          {
            System.out.println("Change the gender: ");
            String n = scan.nextLine();
            h.setGender(n);
          } 

          System.out.println("Do you want to change the race? Choose Y/N");

          String change3 = scan.nextLine();
          
          if(change3.equalsIgnoreCase("y"))
          {
            System.out.println("Change the gender: ");
            String n = scan.nextLine();
            h.setRace(n);
          }

          System.out.println("Do you want to change the ethnicity? Choose Y/N");

          String change4 = scan.nextLine();
          
          if(change4.equalsIgnoreCase("y"))
          {
            System.out.println("Change the ethnicity: ");
            String n = scan.nextLine();
            h.setEthnicity(n);
          }

          System.out.println("Do you want to change the height? Choose Y/N");

          String change5 = scan.nextLine();
          
          if(change5.equalsIgnoreCase("y"))
          {
            System.out.println("Change the height: ");
            double n = scan.nextDouble();
            h.setHeight(n);
          } 

          System.out.println("Do you want to change the weight? Choose Y/N");

          String change6 = scan.nextLine();
          
          if(change6.equalsIgnoreCase("y"))
          {
            System.out.println("Change the weight: ");
            double n = scan.nextDouble();
            h.setWeight(n);
          } 

          System.out.println("Do you want to change the age? Choose Y/N");

          String change7 = scan.nextLine();
          
          if(change7.equalsIgnoreCase("y"))
          {
            System.out.println("Change the age: ");
            int a = scan.nextInt();
            h.setAge(a);
          }


          System.out.println(h.toString());
        }
      
  
      }
      else if(modi == 2)
      {
        Human h = new Human();

        System.out.println("Choose an accessor:\n 1.)toString\n 2.)exit");

        int accessor = scan.nextInt();
 
        if(accessor == 1)
        {
          System.out.println(h.toString());
        }
        else
        {
          System.out.println("Goodbye!");
        }
      
      }
      else if(modi == 3)
      {
        System.out.println("Filler. Ignore");
        String filler = scan.nextLine();
        System.out.println("Input a name: ");
        String name = scan.nextLine();
        System.out.println("Input a gender: ");
        String gender = scan.nextLine();
        System.out.println("Input an ethnicity");
        String ethnicity = scan.nextLine();
        System.out.println("Input an age");
        int age = scan.nextInt();

       Human h = new Human(filler, name, gender, ethnicity, age);

       System.out.println("Choose an accessor:\n 1.)toString");

       System.out.println("Choose an mutator:\n 2.)setIdentifier");

       String choice = scan.nextLine();

       if(choice.equals("1"))
       {
         System.out.println(h.toStringStandard());
       }
       else if(choice.equals("2"))
       {
        System.out.println("Filler. Ignore");

        String fillerString = scan.nextLine();

        System.out.println("Do you want to change the name? Choose Y/N");

        String change1 = scan.nextLine();

        if(change1.equalsIgnoreCase("y"))
        {
          System.out.println("Change the name: ");
          String n = scan.nextLine();
          h.setName(n);
        }
        else if(change1.equalsIgnoreCase("n"));
        {
          System.out.println("Noted");
        }
        
        System.out.println("Do you want to change the gender? Choose Y/N");

        String change2 = scan.nextLine();
        
        if(change2.equalsIgnoreCase("y"))
        {
          System.out.println("Change the gender: ");
          String n = scan.nextLine();
          h.setGender(n);
        }

        System.out.println("Do you want to change the ethnicity? Choose Y/N");

        String change4 = scan.nextLine();
        
        if(change4.equalsIgnoreCase("y"))
        {
          System.out.println("Change the ethnicity: ");
          String n = scan.nextLine();
          h.setEthnicity(n);
        }

        System.out.println("Do you want to change the age? Choose Y/N");

          String change7 = scan.nextLine();
          
          if(change7.equalsIgnoreCase("y"))
          {
            System.out.println("Change the age: ");
            int a = scan.nextInt();
            h.setAge(a);
          }

        System.out.println(h.toStandardString);
       }
      }
      scan.close();
    }

  }
}
    
