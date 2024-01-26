/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testproject;

import java.util.Scanner;

/**
 *
 * @author USePObrero_User595
 */
public class TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Hello, Humans! Press yes to learn of our message.");
        String answer = in.next();
        
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Oops! You've just given us consent to take your rights, and you will all be captured in 3-4 business days. Thanks!");
        }else{
            System.out.println("Understandable, have a nice day!");
        }
    }
    
}
