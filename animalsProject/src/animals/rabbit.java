/**
 * Roberto Andino
 * Version 1
 * Program is done in Java programming language
 * 
 * Abstract class rabbit that implements pet and comparable interface, it
 * also has 3 rabbit subclasses.
 */
package animals;


public abstract class rabbit implements pet, Comparable<rabbit>{
    
    //private instance variables for weight attributes
    private String name;
    private String species;
    private int weight;
    
    //constructor for weight object
    public rabbit(String name, String species, int weight)
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
    public int compareTo(rabbit obj)
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
