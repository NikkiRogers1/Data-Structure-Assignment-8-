import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
    
    
        map.put("Elephant", 120);
        map.put("Tiger", 80);
        map.put("Lion", 90);
        map.put("Bear", 100);
        map.put("fox", 60);
    
        System.out.println("Enter the name of the animal:");
        String animalName = scanner.nextLine();
        Integer animalValue = map.get(animalName);
        if (animalValue != null) {
            System.out.println("The value of " + animalName + " is: " + animalValue);
        } else {
            System.out.println("Animal not found in the map.");
        }
        scanner.close();
    }
}
