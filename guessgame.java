package String;

import java.util.Random;
import java.util.Scanner;

public class guessgame {
   public static void main(String[] args) {
       System.out.println("Welcome to the game");
       System.out.println("your name please");

       Scanner sc=new Scanner(System.in);
       String name =sc.next();
       System.out.println("hello r"+name);

       System.out.println("shall we start");
       System.out.println("\t1. yes");
       System.out.println("\t2. no");

       int beginanswer =sc.nextInt();

       while(beginanswer !=1){
           System.out.println("shall we start");
           System.out.println("\t1. yes");
           System.out.println("\t2. no");

           beginanswer=sc.nextInt();
       }

       Random random=new Random();
       int x= random.nextInt( 20);
       System.out.println("Please guess a number");

       int userInput=sc.nextInt();

       int timesTried=0;
       boolean haswon=false;
       boolean shouldFinish=false;
    
       while(!shouldFinish){
           timesTried++;
           if(timesTried<5){
               if(userInput==x){
                   haswon=true;
                   shouldFinish=true;
                 }
                 else if(userInput>x){
                System.out.println("guess lower");
                userInput=sc.nextInt();

                 }
                 else{
                System.out.println("guess higher");
                userInput=sc.nextInt();
                 }
           }
           else{
               shouldFinish=true;
           }
       }
      if(haswon){
          System.out.println("congratulations you have guessed in your "+timesTried+" guess");
      }
      else{
          System.out.println("game over");
          System.out.println("the number was "+x);
      }
   } 
}
