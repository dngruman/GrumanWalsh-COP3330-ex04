 /*
  * UCF COP3330 Fall 2021 Assignment 1 Solution
  * Copyright 2021 Deirdre Gruman-Walsh
  */

 import java.util.Scanner;

 public class Mad_Lib {

     public static void main(String[] args) {
         var noun_input = new Scanner(System.in);
         var verb_input = new Scanner(System.in);
         var adj_input = new Scanner(System.in);
         var adverb_input = new Scanner(System.in);

         System.out.print("Enter a noun: ");
         var noun = noun_input.nextLine();

         System.out.printf("Enter a verb: ");
         var verb = verb_input.nextLine();

         System.out.printf("Enter an adjective: ");
         var adj = adj_input.nextLine();

         System.out.printf("Enter an adverb: ");
         var adverb = adverb_input.nextLine();

            System.out.println("Do you walk "+verb+" your "+adj+" "+noun+" "+adverb+"? That's hilarious!");
        }

}
