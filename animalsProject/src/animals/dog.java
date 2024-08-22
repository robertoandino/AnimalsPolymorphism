/**
 * Roberto Andino
 * Version 1
 * Program is done in Java programming language
 * 
 * Abstract class dog that implements pet and comparable interface, it
 * also has 3 dog subclasses.
 */
package animals;


public abstract class dog implements pet, Comparable<dog>{
    
    //private instance variables for dog attributes
    private String name;
    private String species;
    private int weight;
    
    //constructor for dog object
    public dog(String name, String species, int weight)
    {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }
    
    //getter methods
    public String getName()
    {
        return name;
    }
    
    public String getSpecies()
    {
        return species;
    }
    
    public int getWeight()
    {
        return weight;
    }
   
    //compare method to compare pets age
    public int compareTo(dog obj)
    {
        
        if(getAge() > obj.getAge())
        {
            return 1;
        
        }else if(getAge() < obj.getAge())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
}
