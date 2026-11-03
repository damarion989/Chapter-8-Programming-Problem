import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      HashMap<String, Integer> registry = new HashMap<>();
      Scanner keyboard = new Scanner(System.in);


        registry.put("Deer", 12);
        registry.put("Fox", 5);
        registry.put("Owl", 8);
        registry.put("Rabbit", 20);
        registry.put("Bear", 3);

      System.out.print("Enter a species name (example: Deer): ");
      String species = keyboard.nextLine().trim();

      Integer count = registry.get(species);


      if (count == null) {
        System.out.println("That species is not currently in the registry.");
        } else {
             System.out.println(species + " population: " + count);
        }

        keyboard.close();
    }
}



    
