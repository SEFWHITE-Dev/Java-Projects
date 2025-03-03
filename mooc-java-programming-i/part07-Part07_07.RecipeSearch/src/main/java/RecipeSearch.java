
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.NoSuchFileException;
import java.io.FileNotFoundException; 

public class RecipeSearch {

    public static void main(String[] args) {

        test();
        //ArrayList<Recipe> list = initializeArrayList();
//        ArrayList<Recipe> list = init2();
//        for (Recipe item: list) {
////           / System.out.println(item.getName());    
//        }
        
        
    }
    
    public static void test() {
        
        ArrayList<Recipe> list = init2();
        
        try (Scanner scannerText = new Scanner(Paths.get("recipes.txt"))) {
            Scanner input = new Scanner(System.in);
            System.out.println("File to read: ");
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            
            
            while (true) {
                System.out.println("Enter command: ");
                String inputText = input.nextLine();
            
            
                if (inputText.equals("stop")) {
                    break;
                }
                
                listRecipes(inputText, scannerText, list);
                
                findByName(inputText, input, list);
                        
                findByTime(inputText, input, list);
                
                findByIngredient(inputText, input, list);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void listRecipes(String inputText, Scanner scannerText, ArrayList<Recipe> list) {
        if (inputText.equals("list")) {
            System.out.println("Recipes:");
            while (scannerText.hasNextLine()) {
                String row = scannerText.nextLine();

                // skip empty lines
                if (row.isEmpty()) {
                    continue;
                }

                // if the string starts with a capital letter
                if (Character.isUpperCase(row.charAt(0))) {
                    System.out.print(row + ", cooking time: ");
                }

                // if the string starts with a number
                if (Character.isDigit(row.charAt(0))) {
                    System.out.print(row);
                    System.out.println("");
                }
            }
        }
    }
    
    public static void findByIngredient(String inputText, Scanner input, ArrayList<Recipe> list) {
        if (inputText.equals("find ingredient")) {
//                if (inputText.equals("f")) {
            System.out.println("Searched word: ");
            inputText = input.nextLine();


            // if recipe contains the word, return recipe name
            String recipeText = "";
            for (Recipe recipe: list) {
                recipeText = recipe.getRecipeByIngredient(inputText);
                //System.out.println(recipeText);
                if (recipeText.equals("-1")) {
                    System.out.println("Recipes:");
                    break;
                } else {
                    System.out.println(recipeText);
                }
            }
        }
    }
    
    public static void findByTime(String inputText, Scanner input, ArrayList<Recipe> list) {
        if (inputText.equals("find cooking time")) {
            System.out.println("Max cooking time: ");
            inputText = input.nextLine();
            
            String recipeText = "";
            for (Recipe recipe: list) {
                recipeText = recipe.getRecipeByTime(inputText);
                if (recipeText.equals("-1")) {
                    System.out.println("Recipes:");
                    break;
                } else {
                    System.out.println(recipeText);
                }
            }
        }
    }
    
    public static void findByName(String inputText, Scanner input, ArrayList<Recipe> list) {
        if (inputText.equals("find name")) {
            System.out.println("Searched word: ");
            inputText = input.nextLine();
            
            String recipeText = "";
            for (Recipe recipe: list) {
                recipeText = recipe.getRecipeByName(inputText);
                if (recipeText.equals("-1")) {
                    System.out.println("Recipes:");
                    break;
                } else {
                    System.out.println(recipeText);
                }
            }
        }
    }
    
    public static ArrayList<Recipe> init2() {
        
  
        ArrayList<Recipe> list = new ArrayList<>();
        Recipe recipe = null; // Start with no recipe

        try {
           // System.out.println("Looking for file at: " + Paths.get("recipes.txt").toAbsolutePath());

            // Read file
            Scanner scannerText = new Scanner(Paths.get("recipes.txt"));

            while (scannerText.hasNextLine()) {
                String row = scannerText.nextLine().trim(); // Trim leading/trailing whitespace

                // If we encounter an empty line, add the current recipe to the list
                if (row.isEmpty()) {
                    if (recipe != null) { // If a recipe exists, add it to the list
                        list.add(recipe);
                        recipe = null; // Reset the recipe object for the next recipe
                    }
                    continue;
                }

                // If the row starts with an uppercase letter, it's a new recipe's name
                if (Character.isUpperCase(row.charAt(0))) {
                    if (recipe != null) { // Add the previous recipe before starting a new one
                        list.add(recipe);
                    }
                    recipe = new Recipe(); // Create a new recipe object
                    recipe.setName(row);   // Set the name of the recipe
                    
                }
                // If the row starts with a digit, it's the cooking time
                if (Character.isDigit(row.charAt(0))) {
                    if (recipe != null) { // Set the cooking time for the current recipe
                        recipe.setTime(Integer.valueOf(row));
                        
                    }
                }
                // If the row starts with a lowercase letter, it's an ingredient
                if (Character.isLowerCase(row.charAt(0))) {
                    if (recipe != null) { // Add the ingredient to the current recipe
                        recipe.addIngredient(row);
                    }
                }
            }

            // After reading all lines, add the last recipe (if it exists)
            if (recipe != null) {
                list.add(recipe);
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return list;
    
    }
    
    
    public static ArrayList<Recipe> initializeArrayList() {
        // get the file
        // every first capitol letter, create a new recipe obj
        // init recipe obj, add it to list
        
        ArrayList<Recipe> list = new ArrayList<>();
        Recipe recipe = new Recipe();
        //Scanner scannerText = new Scanner(Paths.get("/full/path/to/recipes.txt"));
        
        try (Scanner scannerText = new Scanner(Paths.get("recipes.txt"))) {
        //try (Scanner scannerText = new Scanner(Paths.get("C:/Users/shota/OneDrive/Documents/NetBeansProjects/mooc-java-programming-i/part07-Part07_07.RecipeSearch/recipes.txt"))) {
        //try (Scanner scannerText = new Scanner(Monitoring.class.getResourceAsStream("recipes.txt"))){
            while (scannerText.hasNextLine()) {
                String row = scannerText.nextLine().trim();
                
                // skip empty lines
                if (row.isEmpty()) {
//                    if (recipe != null) {
//                        list.add(recipe);
//                        System.out.println("added1");
//                        recipe = new Recipe();
//                    }
                    continue;
                }

                // if the string starts with a capital letter
                if (Character.isUpperCase(row.charAt(0))) {
                    if (recipe != null) { // Add the previous recipe to the list before starting a new one
                        list.add(recipe);
                        System.out.println("added2");
                    }
                    System.out.println("new");
                    recipe = new Recipe();
                    recipe.setName(row);
                }

                // if the string starts with a number
                else if (Character.isDigit(row.charAt(0))) {
                    if (recipe != null) {
                        recipe.setTime(Integer.valueOf(row));
                    }
                }
                
                // lower case letter
                else if (Character.isLowerCase(row.charAt(0))) {
                    if (recipe != null) {
                        recipe.addIngredient(row);
                    }
                }
            }
            // Add the last recipe (if not already added)
            if (!list.contains(recipe)) {
                list.add(recipe);
                System.out.println("added3");
            }
            
        } catch (Exception e) {
            System.out.println("Looking for file at: " + Paths.get("recipes.txt").toAbsolutePath());
            System.out.println("cant read file");
            System.out.println("Error: " + e.getMessage());
        }
        
        return list;
    }

}
