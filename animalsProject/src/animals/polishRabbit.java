/**
 * Roberto Andino
 * Version 1
 * Program is done in Java programming language
 * 
 * Concrete class  that extends abstract class rabbit.
 */
package animals;

public class polishRabbit extends rabbit {

    //attributes of polish Rabbit
    private String gender;
    private int age;
    private String favFood;
    private String color;
    private int yearBorn;
    
    //polish Rabbit constructor
    public polishRabbit(String name, String species, int weight, String gender, 
                    int age, String favFood, String color, int yearBorn)
    {    
        super(name, species, weight);
        this.gender = gender;
        this.age = age;
        this.favFood = favFood;
        this.color = color;
        this.yearBorn = yearBorn;
        
    }

    //getter methods
    public String getGender()
    {
        return gender;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getFavFood()
    {
        return favFood;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public int getYearBorn()
    {
        return yearBorn;
    }

    
}
