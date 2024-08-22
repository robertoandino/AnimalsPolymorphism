/**
 * Roberto Andino
 * Version 1
 * Program is done in Java programming language
 * 
 * Concrete class  that extends concrete class persianCat.
 */
package animals;


public class siameseCat extends persianCat {
   
    //attributes of siamese cat
    private String gender;
    private int age;
    private String favFood;
    private String color;
    private int yearBorn;
    
    //siamese cat constructor
    public siameseCat(String name, String species, int weight, String gender, 
                    int age, String favFood, String color, int yearBorn)
    {    
        super(name, species, weight, gender, age, favFood, color, yearBorn);
        //this.gender = gender;
        //this.age = age;
        //this.favFood = favFood;
        //this.eyeColor = eyeColor;
        //this.yearBorn = yearBorn;
        
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
