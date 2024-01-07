
import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList();
    }
    public Recipe() {
        this.name = "";
        this.cookingTime = 0;
        this.ingredients = new ArrayList();
    }
    
    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }
    public void add(String ingredient) {
        this.ingredients.add(ingredient);
    }
    public ArrayList<String> getIngredients() {
        return (ArrayList<String>)ingredients.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }

    boolean consistsOf(String ingredient) {
        return this.ingredients.contains(ingredient);
    }
    
    
    
    
    
    
    
    
    
}
