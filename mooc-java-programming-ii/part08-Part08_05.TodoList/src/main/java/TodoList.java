
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
public class TodoList {
    private ArrayList<String> todos;
    
    public TodoList() {
        todos = new ArrayList();
    }
    public void add(String todo) {
        todos.add(todo);
    }
    public void remove(int index) {
        index--;
        if(todos.isEmpty() || index < 0 || index >= todos.size()) {
            return;
        }
        todos.remove(index);
    }
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        
        StringBuilder builder = new StringBuilder();
        
        for(int i = 0; i < todos.size(); i++) {
            builder.append(i +1).append(": ").append(this.todos.get(i)).append('\n');
        }
        
        return builder.toString();
    }
    
    
}
