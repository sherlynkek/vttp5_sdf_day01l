package myapp;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {

    public static void main (String[] args) {
        // Print Hello World
        System.out.println("Hello World");

        // Prompt for name
        Console console = System.console();
        String name = console.readLine("What is your name?");
        System.out.println("your name is " + name);

        // Prompt for favourite sport
        String sport = console.readLine("What is the sport that you like to do? ");

        if (sport.toUpperCase().equals("SWIMMING")) {
            System.out.println("That's a nice water sport");
        } else if (sport.toUpperCase().equals("SOCCER")) {
            System.out.println("It's a world accepted sport");
        } else {
            System.out.println("I'm not sure about the sports you like\n");
        }

    // Prompt for name and score
    String replacedName = name.replace('a', 'e');
    System.out.printf("your name %s \n", replacedName);
    String valueString = console.readLine("Enter your score between 0 to 100: ");
    Integer score = Integer.parseInt(valueString);
 
    switch (score) {
        case 100: 
        System.out.println("Perfect Score");
        break;
        case 99:
        case 98:
        case 97:
        System.out.println("You scored A");
        break;
        default:
        System.out.println("Not acceptable");
        break;
    }

    // while loop
    int i = 0;
    while (i < score) {
        if (score <= 99) {
            System.out.print(i + ",");
            i++; // i = i + 1
            // i = i + 2, i = i +3
        } else {
            System.out.print(i);
            i++;
        }
    }

    do {
        System.out.print(i + ",");
        i++; // i = i + 1;
    } while (i < score);

    Integer[] numbers = new Integer[5];

    for(int j = 0; j < numbers.length; j++) {
        Integer inputNumber = Integer.parseInt(console.readLine("\nEnter your %d number: ", j));
        numbers[j] = inputNumber;
    }
    for (Integer pI : numbers) {
        System.out.println(pI);
    } 

    if (args.length > 0){
        String[] names = new String[5];

        int x = 0;
        while (x < args.length){
            names[x] = args[x];
            x++;

            if (x > 4) {
                break;
            }
        }

        for(int y = 0; y < names.length; y++) { 
            System.out.printf("Name[%d]: %s\r\n", y, names[y]);
        }
    } else {
        System.out.println("No arguement passed");
    } 

    List<String> names = new ArrayList<>();

   String input = "";
   do{
    input = console.readLine("Enter a name: ");

    if (!input.equals("quit")) {
        names.add(input);
    }

   } while (!input.equals("quit"));

   //print out the names
   for (String name1: names) {
    System.out.println(name1);
   } 

   List<String> words = new ArrayList<>();

   String keyboardInput = "";
   keyboardInput = console.readLine("Enter a sentence: ");
   keyboardInput = keyboardInput.replace(',', ' ');

   Scanner scan= new Scanner(keyboardInput);
   while(scan.hasNext()) {
    words.add(scan.next());
   }
   scan.close();

   for (int z=0; z < words.size(); z++){
    System.out.printf("%d : %s \r\n", z+1, words.get(z));
   }
   
   Scanner scan2 = new Scanner(System.in);
   System.out.println("Enter a sentence: ");
   String item = scan2.next();
   String item2 = scan2.nextLine();
   System.out.println(item);
   System.out.println(item2);
    }
}