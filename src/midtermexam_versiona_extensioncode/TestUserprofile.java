/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.*;
/**
 *
 * @author Fallon Higgins
 */
public class TestUserprofile {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        String name = sc.next();
        
       System.out.println("Please choose a genre : ");

        int option = 0;
        String choice;
        switch (option){
            case 1: 
                choice = "Comedy";
                break;
            case 2: 
                choice = "Drama";
                break;
            case 3: 
                choice = "Action";
                break;
            case 4: 
                choice = "Mystery";
                break;
        }
        
    
        
        System.out.println("Thank your for creating a user profile");
    }
    
}
