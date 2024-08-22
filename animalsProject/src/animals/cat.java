/**
 * Roberto Andino
 * Version 1
 * Program is done in Java programming language
 * 
 * Abstract class cat that implements pet and comparable interface, it
 * also has 3 cat subclasses.
 */
package animals;


public abstract class cat implements pet, Comparable<cat> {
    
    //private instance variables for cat attributes
    private String name;
    private String species;
    private int weight;
    
    //constructor for cat object
    public cat(String name, String color, int weight)
    {
        this.name = name;
        this.species = color;
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
    public int compareTo(cat obj)
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
