/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Item {
    public String id;
    public String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if(!(other instanceof Item)) {
            return false;
        }
        Item otherItem = (Item) other;
        return this.id.equals(otherItem.id);
    }
    
}
