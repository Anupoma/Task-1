/*
Name: Anupoma Angasree Toma
ID: 201202060
Section: B
Email: cse_2012020060@lus.ac.bd
Date: 14/7/2021
*/

package toma;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your section: ");
        Scanner sc = new Scanner (System.in);
        String section = sc.nextLine();
        System.out.println("Section: " + section);
        Info Info = new Info();
        System.out.println("Name: " + Info.name);
        System.out.println("Id: "+ Info.id);
        Hobby Hobby = new Hobby();
        System.out.println("Hobby: " + Hobby.hobbyName);
        
    }
}
