/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author filip
 */
public class SaveableDictionary {
    private HashMap<String,String> dict = new HashMap();
    private String fileName;
        public SaveableDictionary() {
        this.fileName = "";
    }

    public SaveableDictionary(String file) {
        this.fileName = file;
    }
    public void add(String words, String translation) {
        
        if(dict.containsKey(words)) {
            return;
        }
        
        dict.put(words, translation);
        dict.put(translation, words);
        
        
    }
    public boolean load() {
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while(fileScanner.hasNextLine()) {
                String[] lineTokens = fileScanner.nextLine().split(":");
                if(lineTokens.length < 2) {
                    fileScanner.close();
                    return false;
                }
                add(lineTokens[0], lineTokens[1]);
            }
                
            
        } catch(Exception e) {
            return false;
        }
        return true;
    }
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            ArrayList<String> written = new ArrayList();
            for (String key : dict.keySet()) {
                String value = dict.get(key);
                if(written.contains(value)) {
                    continue;
                }
                writer.append(key + ":" + value + "\n");
                written.add(key);
            }
           
        } catch(Exception e) {
            return false;
        }
        return true;
    }
    
    public String translate(String word) {
        return dict.get(word);

    }
    public void delete(String word) {
        String translation = translate(word);
        if(translation == null) {
            return;
        }
        dict.remove(word);
        dict.remove(translation);
    }
    
}
