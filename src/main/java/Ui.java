/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anupam_pathak
 */
import java.util.Scanner;

public class Ui {
    private Scanner scanner;
    private Points points;
    
    public Ui(Scanner scanner,Points points){
        this.scanner = scanner;
        this.points = points;
    }
    
    public void start(){
         System.out.println("Enter point totals, -1 stops:");
        while (true){
            int point = Integer.valueOf(this.scanner.nextLine());
            if (point == -1){
                break;
            }
            if (point >= 0 && point <= 100){
                this.points.add(point);
            }
            if (point >= 50 && point <= 100){
                this.points.addPass(point);
            }
        }
        System.out.println("Point average (all): " + this.points.average());
        if(this.points.passingAvg() >= 50){
            System.out.println("Point average (passing): " + this.points.passingAvg());
    }
        else {
            System.out.println("Point average (passing): -" );
        }
        System.out.println("Pass percentage: " + this.points.percentage());
        System.out.println("Grade distribution:");
        this.points.printStars();
        
        }
        }
        
    

