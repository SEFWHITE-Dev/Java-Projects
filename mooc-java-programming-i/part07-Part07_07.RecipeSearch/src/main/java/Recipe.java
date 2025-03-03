
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shota
 */
public class Recipe {
    
    private String name;
    private int time;
    private ArrayList<String> ingredients = new ArrayList<>();;
    
    public Recipe() {
        
    }
    
    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }
    

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
    
    public void addIngredient(String input) {
        this.ingredients.add(input);
    }
    
    public ArrayList<String> getIngredientList() {
        return this.ingredients;
    }
    
    public String getRecipeByName(String input) {
        String value ="-1";

        if (input.equals(this.name)) {
            value = this.name;
        }
        return value;
    }
    
    public String getRecipeByTime(String input) {
        String value ="-1";
        int comp = Integer.valueOf(input);
        
        if (comp <= (this.time)) {
            value = this.name;
        }
        return value;
    }
    
    public String getRecipeByIngredient(String input) {
        String value ="-1";
        
        for (String ingredient: ingredients) {
            if (ingredient.equals(input)) {
                value = this.name;
                break;
            }
        }
        return value;
    }
}
