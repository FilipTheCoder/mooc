
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class RecipeUserInterface {
    private Scanner sc;
    private ArrayList<Recipe> recipes = new ArrayList();
    private boolean stop = false;

    public RecipeUserInterface(Scanner sc) {
        this.sc = sc;
        
    }
    
    public String getFilePath() {
        System.out.println("File to read: ");
        return sc.nextLine();
    }
    public void listCommands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
    }
    public void start() {
        String filePath = getFilePath();
        try(Scanner fileScanner = new Scanner(Paths.get(filePath))) {
            parseFile(fileScanner);
        } catch (Exception e) {
            System.out.println("Error openning file: " + e.getMessage());
            return;
        }
        listCommands();
        while(!stop) {
            executeCommand(getCommand());
        }
        
                
        
        
        
    }
    public String getCommand() {
        System.out.println("Enter command: ");
        return sc.nextLine();
    }
    
    public void executeCommand(String command) {
        switch (command) {
            case "list":
                listRecipes();
                break;
            case "stop":
                this.stop = true;
                break;
            case "find name":
                findByName();
                break;
            case "find cooking time":
                findByCookingTime();
                break;
            case "find ingredient":
                findByIngrediats();
                break;
            default:
                System.out.println("Command is not supported: " + command);
                break;
        }
        
    }
    
    public void parseFile(Scanner sc) {
        Recipe recipe = new Recipe();
        int numberOfLines = 0;
        while(sc.hasNextLine()) {
            
            String line = sc.nextLine();
            if(line.isEmpty()) {
                this.recipes.add(recipe);
                recipe = new Recipe();
                numberOfLines = 0;
                continue;
            }
            switch (numberOfLines) {
                case 0:
                    recipe.setName(line);
                    break;
                case 1:
                    int value = Integer.valueOf(line);
                    
                    recipe.setCookingTime(value);
                    break;
                default:
                    recipe.add(line);
                    break;
            }
            numberOfLines++;
        }
        this.recipes.add(recipe);
    }

    private void listRecipes() {
        for(Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

    private void findByName() {
        System.out.println("Searched word: ");
        String word = sc.nextLine();
        System.out.println("Recipes");
        for(Recipe recipe : this.recipes) {
            if(recipe.getName().contains(word)) {
                System.out.println(recipe);
            }
        }
    }

    private void findByCookingTime() {
        System.out.println("Max cooking time: ");
        int time = Integer.valueOf(sc.nextLine());
        System.out.println("Recipes");
        for(Recipe recipe : this.recipes) {
            if(recipe.getCookingTime() <= time) {
                System.out.println(recipe);
            }
        }
        
    }

    private void findByIngrediats() {
        System.out.println("Ingredient: ");
        String ingredient = sc.nextLine();
        System.out.println("Recipes");
        for(Recipe recipe : this.recipes) {
            if(recipe.consistsOf(ingredient)) {
                System.out.println(recipe);
            }
        }
        
    }
    
    
}
