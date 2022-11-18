
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anupam_pathak
 */
public class Points {

    private ArrayList<Integer> points;
    private ArrayList<Integer> pass;
    private ArrayList<Integer> grades;

    public Points() {
        this.points = new ArrayList<>();
        this.pass = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void add(int point) {
        this.points.add(point);
        this.grades.add(pointToGrade(point));
    }

    public void addPass(int pass) {
        this.pass.add(pass);
    }
    
//    public void toGrade(int grade){
//        
//    }

    public double average() {
        int sum = 0;
        for (Integer num : this.points) {
            sum += num;
        }
        return (1.0 * sum / this.points.size());
    }

    public double passingAvg() {
        int sum = 0;
        for (Integer num : this.pass) {
            sum += num;
        }
        return (1.0 * sum / this.pass.size());
    }
    
    public double percentage(){
        return (1.0 * 100 * this.pass.size()/this.points.size());
    }
    
    public int pointToGrade(int point){
        int grade = 0;
        
        if (point < 50){
            grade = 0;
        }
        else if (point < 60){
            grade = 1;
        }
        else if (point < 70){
            grade = 2;
        }
        else if(point < 80){
            grade = 3;
        }
        else if (point < 90){
            grade = 4;
        }
        else {
            grade = 5;
        }
        return grade;
    }
    
    public void printStars(){
        int grade = 5;
        while(grade >= 0){
            System.out.print(grade + ": ");
            int stars = countStars(grade);
            for(int i =1;i<=stars;i++){
                System.out.print("*");
            }
            System.out.println("");
            grade -= 1;
        }
    }
    
    public int countStars(int grade){
        int count = 0;
        for(Integer grad:this.grades){
            if(grad == grade){
                count += 1;
            }
        }
        return count;
    }
}
