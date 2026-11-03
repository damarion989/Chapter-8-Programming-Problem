import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> registry = new HashMap<>();

        try {
            Scanner fileScanner = new Scanner(new File("sightings.txt"));



            while (fileScanner.hasNextLine()) {
                String species = fileScanner.nextLine().trim();

                if (species.isEmpty()) {
                    continue;
                    }


                if (registry.containsKey(species)) {
                    registry.put(species, registry.get(species) + 1);
                } else {
                    registry.put(species, 1);
                }
            }


            fileScanner.close();
            } catch (FileNotFoundException e) {
            System.out.println("Could not find sightings.txt.");
            return;
        }

        System.out.println("Field Registry: " + registry);

        if (registry.isEmpty()) {
            System.out.println("No sightings were found.");
            return;
        }
        
        String mostFrequentSpecies = "";
        String mostFrequentSpecies = "";
        int maxCount = 0;
        int minCount = Integer.MAX_VALUE;

        for (String species : registry.keySet()) {
            int count = registry.get(species);

             if (count > maxCount) {
                maxCount = count;
                mostFrequentSpecies = species;
            }

            if (count < minCount) {
                minCount = count;
                leastFrequentSpecies = species;
            }
        }

            System.out.println("Most frequent: " + mostFrequentSpecies
                + " - " + maxCount);
            System.out.println("Least frequent: " + leastFrequentSpecies
                + " - " + minCount);

            Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a species name using the file's spelling: ");
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
        
        

    
