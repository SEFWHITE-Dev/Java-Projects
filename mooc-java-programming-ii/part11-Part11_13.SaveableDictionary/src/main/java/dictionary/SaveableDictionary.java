/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author shota
 */
public class SaveableDictionary {

    private ArrayList<Word> list = new ArrayList<>();
    private String file;
    
    public SaveableDictionary() {
    }
    
    public SaveableDictionary(String file) {
        this.file = file;
    }
    
    public boolean load() {
        try(Scanner fileReader = new Scanner(new File(this.file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   
                
                if (parts.length == 2) {
                    add(parts[0], parts[1]);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean save() {
        if (this.file == null) {
            return false;
        }
        
        try (PrintWriter writer = new PrintWriter(new FileWriter(this.file))) {
            ArrayList<String> savedWords = new ArrayList<>();
            
            for (Word word : this.list) {
                if (!savedWords.contains(word.getWord()) && !savedWords.contains(word.getTranslation())){
                    String temp = word.getWord() + ":" + word.getTranslation();
                    writer.println(temp);
                    savedWords.add(temp);
                }
            }
            
//            writer.println(this.list);
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void add(String words, String translation) {
        for (Word word : list) {
            if (word.getWord().equals(words)){
                return;
            } else if (word.getTranslation().equals(word)) {
                return;
            }
        }
        
        this.list.add(new Word(words, translation));
    }
    
    public String translate(String input) {
        for (Word word : list) {
            if (word.getWord().equals(input)){
                return word.getTranslation();
            } else if (word.getTranslation().equals(input)) {
                return word.getWord();
            }
        }
        return null;
    }
    
    public void delete(String input) {
        Iterator<Word> iter = list.iterator();
        while(iter.hasNext()) {
            Word word = iter.next();
            if (word.getWord().equals(input)) {
                iter.remove();
            } else if (word.getTranslation().equals(input)) {
                iter.remove();
            }
        }
    }
}
