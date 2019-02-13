/* This class is where the java program begins. The main method is in this class.
 * Authors: Originally created by Anastasia Kurdia. Modified by Tanner Yilmaz.
 * Date modified: January 25, 2019
 * Lab Section: 02
 */

package octopus;

public class Lab0
{
    public static void main(String[] args)
    {
        // Variable dictionary:
        Octopus ocky;           // an octopus
        Octopus ocky2;			// another octopus
        Utensil spat;           // a kitchen utensil
        Utensil fork;			// another kitchen utensil

        spat = new Utensil("spatula"); // create a spatula
        spat.setColor("green");        // set spatula properties--color...
        spat.setCost(10.59);           // ... and price
        
        fork = new Utensil("fork"); // creating a fork
        fork.setColor("blue");      // setting new fork's color to blue
        fork.setCost(4.20);         // setting new fork's price

        ocky = new Octopus("Ocky", 17);    // create and name the octopus
        ocky2 = new Octopus("Ockster", 24); //create and name another octopus
        ocky.setWeight(100);           // ... weight,...
        ocky.setUtensil(spat);         // ... and favorite utensil.
        
        ocky2.setUtensil(fork); //setting ocky2's utensil field to fork object
        
        System.out.println("\nPrinting new octopus information"); //printing information about second octopus
        System.out.println(ocky2.getName() + "'s new age: " + ocky2.getAge());
        System.out.println(ocky2.getName() + "'s new weight: " + ocky2.getWeight());
        System.out.println(ocky2.getName() + "'s favorite utensil: " + ocky2.getUtensil());
        
      //printing information about new utensil
        System.out.println("\nNew utensil color and type: " + fork.toString());  
        System.out.println("New utensil cost: " + fork.getCost());

        System.out.println("\nTesting 'get' methods:");
        System.out.println(ocky.getName() + " weighs " +ocky.getWeight() 
            + " pounds\n" + "and is " + ocky.getAge() 
            + " years old. His favorite utensil is a "
            + ocky.getUtensil());

        System.out.println(ocky.getName() + "'s " + ocky.getUtensil() + " costs $"
            + ocky.getUtensil().getCost());
        System.out.println("Utensil's color: " + spat.getColor());

        // Use methods to change some values:

        ocky.setAge(20);
        ocky.setWeight(125);
        spat.setCost(15.99);
        spat.setColor("blue");

        System.out.println("\nTesting 'set' methods:");
        System.out.println(ocky.getName() + "'s new age: " + ocky.getAge());
        System.out.println(ocky.getName() + "'s new weight: " + ocky.getWeight());
        System.out.println("Utensil's new cost: $" + spat.getCost());
        System.out.println("Utensil's new color: " + spat.getColor());
        
    }
}
