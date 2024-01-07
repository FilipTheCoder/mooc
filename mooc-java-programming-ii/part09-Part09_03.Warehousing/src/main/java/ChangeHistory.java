
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
public class ChangeHistory {

    private ArrayList<Double> history = new ArrayList();

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double max = this.history.get(0);
        for (double n : this.history) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double min = this.history.get(0);
        for (double n : this.history) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        
        sum = this.history.stream().reduce(sum, (accumulator, _item) -> accumulator + _item);
        return sum / this.history.size();
        
    }
}
