package gpaproject;

import java.util.Scanner;  

public class GPAProject {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your First Semester CGP: ");
        float gpa1 = scanner.nextFloat();
        System.out.print("Enter your Second Semester CGP: ");
        float gpa2 = scanner.nextFloat();
        System.out.print("Enter your Third Semester CGP: ");
        float gpa3 = scanner.nextFloat();
        
        Sem3 id = new Sem3(gpa3,gpa2,gpa1);
        
        id.SGPA();
    }
    
}
