
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Points {
    private ArrayList<Integer> points;
    private int passingLine = 50;

    
    
    public Points(int passingLine){
        this.points = new ArrayList();
        this.passingLine = passingLine;
    }
    public void add(int p) {
        if(p < 0 || p > 100) {
            return;
        }

        this.points.add(p);
    }
    
    public double average() {
        return (double)total() / points.size();
    }
    public double averagePassing() {
        return (double) total(passingLine) / numberOfPassing();
    }
    public double passPercetage() {
        return ((double) numberOfPassing() / points.size()) * 100;
    }
    public int total(int from) {
        int sum = 0;
        for (int p : points) {
            if(p >= from) {
                sum += p;
            }
            
        }
        return sum;
    }
    public int total() {
        int sum = 0;
        for (int p : points) {
            sum += p;
        }
        return sum;
    }
    public long numberOfPassing() {
        return points.stream().filter((p) -> p >= passingLine).count();
    }

    public int[] gradeDistribution() {

        int[] grades = new int[] {0,0,0,0,0,0};
        for(int p : points) {
            
            for(int i = 0; i < grades.length; i++) {
                if(p < passingLine + (10 * i)) {
                    grades[i]++;
                    break;
                }
            }
            
        }
        return grades;

        
    }
    public String stringifyGradeDistribution() {
        int[] grades = gradeDistribution();
        StringBuilder builder = new StringBuilder();
        for(int i = grades.length - 1; i >= 0; i--) {
            builder.append(i).append(": ");
            for(int j = 0; j < grades[i]; j++) {
                builder.append('*');
                
            }
            builder.append('\n');
            
        }
        
        return builder.toString();
    }
    
    @Override
    public String toString() {
        String s = "Point average (all): " + this.average() + "\n";
        s += "Point average (passing): " + this.averagePassing() + "\n";
        s += "Pass percentage: " + this.passPercetage()+ "\n";
        s += "Grade distribution:\n" + this.stringifyGradeDistribution();
        
        
        
        return s;
    }
    
    
    
    
}
