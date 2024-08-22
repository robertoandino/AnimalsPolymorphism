/**
 * Roberto Andino
 * Version 1
 * Program is done in Java programming language
 * 
 * animalTester.java has main method that conducts the program according to user
 * choices, it also has void methods to compare pets age, display menus, display
 * pet traits, display pets and it has an arrayList used as a polymorphic object
 * to store pets.
 */
package animals;

import java.util.ArrayList;
import java.util.Scanner;

public class animalsTester {

    public static void main(String[] args) 
    {
        //scanner and ints for user input
        Scanner input = new Scanner(System.in);
        int userInput = 0; //for user input
        int menuChoice = 0; //for menu choice
        int userChoice = 0; //for loops
        int pet1 = 0;  //for pet 1
        int pet2 = 0;  //for pet 2
        
        //Polymorphic object to store animals
        ArrayList<pet> animals = new ArrayList<pet>();
        
        animals.add(new persianCat("Balu", "cat", 22, "male", 6, "cherries",
                                    "white", 2003));
        animals.add(new bengalCat("Tuki", "cat", 24, "male", 6, "bacon",
                                    "white/black", 2011));
        animals.add(new siameseCat("Athena", "cat", 27, "female", 5, "greenies",
                                    "tan", 2015));
        animals.add(new huskyDog("Max", "dog", 60, "male", 9, "steak",
                                    "white/tan", 2013));
        animals.add(new poodleDog("Ty", "dog", 50, "male", 7, "apple slices",
                                    "black/white", 2013));
        animals.add(new dobermanDog("Dante", "dog", 89, "male", 4, "chicken strips",
                                    "white/tan", 2017));
        animals.add(new pygmyRabbit("Speedy", "rabbit", 12, "male", 3, "corn",
                                    "white/tan", 2003));
        animals.add(new rexRabbit("Mocha", "rabbit", 10, "male", 4, "carrots",
                                    "dark brown", 2004));
        animals.add(new polishRabbit("Arthur", "rabbit", 14, "male", 5, "nuts",
                                    "brown/white", 2006));
        
        System.out.println("------WELCOME TO OUR PET STORE------\n");
        
        
        //do while loop to run program until user decides to exit
        do{
            System.out.println("\nWhat would you like to do? ");
            //calling method menu to display menu
            menu();
            //asking for user choice
            menuChoice = input.nextInt();
            
            //displaying traits
            if(menuChoice == 1)
            {
                //do while loop to show pets traits until user decides to stop
                do{
        
                    System.out.print("Which pet would you like to see?" +
                                   "\nType number 0-8: ");
                    userInput = input.nextInt();
            
                    //to check if user input is incorrect
                    while(userChoice > 8 || userChoice < 0)
                    {
                        System.out.print("OOPS! Type in a number 0-8: ");
                        userChoice = input.nextInt();
                    }
            
                    //calling method animalTraits to display pet traits 
                    //and passing int and arrayList
                    petTraits(userInput, animals);
        
                    System.out.print("\nWould you like to see another pet?" +
                                    "\nType 1 (YES) or 2 (Main Menu): ");
                    userChoice = input.nextInt();
                    System.out.println();
            
                    //to check if user input is incorrect
                    while(userChoice > 2 || userChoice < 1)
                    {
                        System.out.print("OOPS! Type in 1(YES) or 2(Main Menu) : ");
                        userChoice = input.nextInt();
                    }
            
                }while(userChoice != 2);
        
            
            }else if(menuChoice == 2)//comparing age
            {
                //do while loop to compare age until user decides to stop
                do{
                    System.out.println("\nWhich species would you like to compare?");
                    
                    //calling method petSpecies to display species
                    petSpecies(); 
                    
                    System.out.print("Type 1-3: ");
                    userChoice = input.nextInt();
                    
                    //to check if user input is incorrect
                    while(userChoice > 3 || userChoice < 1)
                    {
                        System.out.print("OOPS! Type in 1-3: ");
                        userChoice = input.nextInt();
                    }
                    
                    //comparing cats age
                    if(userChoice == 1)
                    {
                        System.out.println("\nChoose two cats to compare ");
                        
                        //for loop to display cats names
                        for(int i = 0; i < 3; i++)
                        {
                            System.out.println("#" + i + ": " + animals.get(i).getName());
                        }
                        
                        System.out.print("Type Cat 1: ");
                        pet1 = input.nextInt();
                    
                        //to check if user input is incorrect
                        while(pet1 > 2 || pet1 < 0)
                        {
                            System.out.print("OOPS! Type in number 0-2: ");
                            pet1 = input.nextInt();
                        }
                    
                        System.out.print("Type Cat 2: ");
                        pet2 = input.nextInt();
                    
                        //to check if user input is incorrect
                        while(pet2 > 2 || pet2 < 0)
                        {
                            System.out.print("OOPS! Type in number 0-2: ");
                            pet2 = input.nextInt();
                        }
                    
                        //cat objects
                        cat cat1 = (cat)animals.get(pet1);
                        cat cat2 = (cat)animals.get(pet2);
                    
                        //calling compare methods to compare age and passing cat objects
                        compareCats(cat1, cat2);
                    
                    }else if(userChoice == 2) //comparing dogs age
                    {
                        System.out.println("\nChoose two dogs to compare ");
                        
                        //for loop to display dogs names
                        for(int i = 3; i < 6; i++)
                        {
                            System.out.println("#" + i + ": " + animals.get(i).getName());
                        }
                        
                        System.out.print("Type Dog 1: ");
                        pet1 = input.nextInt();
                    
                        //to check if user input is incorrect
                        while(pet1 > 5 || pet1 < 3)
                        {
                            System.out.print("OOPS! Type in number 3-5: ");
                            pet1 = input.nextInt();
                        }
                    
                        System.out.print("Type Dog 2: ");
                        pet2 = input.nextInt();
                    
                        //to check if user input is incorrect
                        while(pet2 > 5 || pet2 < 3)
                        {
                            System.out.print("OOPS! Type in number 3-5: ");
                            pet2 = input.nextInt();
                        }
                    
                        //dog objects
                        dog dog1 = (dog)animals.get(pet1);
                        dog dog2 = (dog)animals.get(pet2);
                    
                        //calling compare method to compare age and passing dog objects
                        compareDogs(dog1, dog2);
                        
                    }else if(userChoice == 3) //comparing rabbits age
                    {
                        System.out.println("\nChoose two rabbits to compare ");
                        
                        //for loop to display rabbits names
                        for(int i = 6; i < 9; i++)
                        {
                            System.out.println("#" + i + ": " + animals.get(i).getName());
                        }
                        
                        System.out.print("Type Rabbit 1: ");
                        pet1 = input.nextInt();
                    
                        //to check if user input is incorrect
                        while(pet1 > 8 || pet1 < 6)
                        {
                            System.out.print("OOPS! Type in number 6-8: ");
                            pet1 = input.nextInt();
                        }
                    
                        System.out.print("Type Rabbit 2: ");
                        pet2 = input.nextInt();
                    
                        //to check if user input is incorrect
                        while(pet2 > 8 || pet2 < 6)
                        {
                            System.out.print("OOPS! Type in number 6-8: ");
                            pet2 = input.nextInt();
                        }
                    
                        //rabbit objects
                        rabbit rabbit1 = (rabbit)animals.get(pet1);
                        rabbit rabbit2 = (rabbit)animals.get(pet2);
                    
                        //calling compare method to compare age and passing rabbit objects
                        compareRabbits(rabbit1, rabbit2);
                        
                    }
                    
                    System.out.print("\nWould you like to compare other pets age?"
                                    +  "\nType 1 (YES) or 2 (Main Menu): ");
                    userChoice = input.nextInt();
                    
                    //to check if user input is incorrect
                    while(userChoice > 2 || userChoice < 1)
                    {
                        System.out.print("OOPS! Type in 1(YES) or 2(Main Menu) : ");
                        userChoice = input.nextInt();
                    }
                
                }while(userChoice != 2);
                
            }else if(menuChoice == 3) //displaying pets
            {
                pets(animals);
            }
        
        }while(menuChoice > 0 && menuChoice < 4);
            
        System.out.println("\n----GOODBYE-----");

    }
    
    //to display menu
    public static void menu()
    {
        System.out.print("1) Animal Traits " +
                           "\n2) Compare Age " + 
                           "\n3) Pets " +
                           "\nType in 1-3 or any other number to exit: ");
    }
    
    //to display species
    public static void petSpecies()
    {
        System.out.println("1) Cats " +
                           "\n2) Dogs " +
                           "\n3) Rabbits" );
    }
    
    //to display pets
    public static void pets(ArrayList<pet> animals)
    {
        //for loop to print animals name and species
        for(int i = 0; i < animals.size(); i++)
        {
            System.out.println("#" + i + ") Name: " + animals.get(i).getName() +
                               "\n    Species: " + animals.get(i).getSpecies()
                                + "\n" );
        }
    
    }
    
    //To display animal traits
    public static void petTraits(int userInput, ArrayList<pet> animals)
    {
        System.out.println("\nYou chose: " + animals.get(userInput).getName() 
                            + "\nSpecies: " + animals.get(userInput).getSpecies()
                            + "\nGender: " + animals.get(userInput).getGender()
                            + "\nAge: " + animals.get(userInput).getAge()
                            + "\nYear born: " + animals.get(userInput).getYearBorn()
                            + "\nColor: " + animals.get(userInput).getColor()
                            + "\nWeight: " + animals.get(userInput).getWeight() + "lb"
                            + "\nFavorite Food: " + animals.get(userInput).getFavFood());
    }
    
             
    //to compare cats age
    public static void compareCats(cat pet1, cat pet2)
    {
      if(pet1.compareTo(pet2) > 0)
      {
         System.out.println("\n" + pet1.getName() + " is older than " + pet2.getName());
      }
      else if(pet1.compareTo(pet2) < 0)
      {
         System.out.println("\n" + pet1.getName() + " is younger than " + pet2.getName());
      }
      else
      {
         System.out.println("\n" + pet1.getName()+ " is the same age as " + pet2.getName());
      }
    }
    
    //to compare dogs age
    public static void compareDogs(dog pet1, dog pet2)
    {
      if(pet1.compareTo(pet2) > 0)
      {
         System.out.println("\n" + pet1.getName() + " is older than " + pet2.getName());
      }
      else if(pet1.compareTo(pet2) < 0)
      {
         System.out.println("\n" + pet1.getName() + " is younger than " + pet2.getName());
      }
      else
      {
         System.out.println("\n" + pet1.getName()+ " is the same age as " + pet2.getName());
      }
    }
    
    //to compare rabbits age
    public static void compareRabbits(rabbit pet1, rabbit pet2)
    {
      if(pet1.compareTo(pet2) > 0)
      {
         System.out.println("\n" + pet1.getName() + " is older than " + pet2.getName());
      }
      else if(pet1.compareTo(pet2) < 0)
      {
         System.out.println("\n" + pet1.getName() + " is younger than " + pet2.getName());
      }
      else
      {
         System.out.println("\n" + pet1.getName()+ " is the same age as " + pet2.getName());
      }
    }
    
}
