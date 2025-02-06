package sice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Activity1 {
    static final String FOLDER = "target/message";
    public static void main(String[] args) {
        int[] nums = new int[2];
        Scanner input = new Scanner(System.in);
        String[] numbers = {"First", "Second"};




//NAME
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Hello " + firstName + " " + lastName);

//REVERSE WORD
        System.out.print("\nEnter a word: ");
        String word = input.nextLine();
        StringBuilder revWord = new StringBuilder();
        revWord.append(word);
        revWord.reverse();
        System.out.println("The reverse word is: " + revWord);

//MESSAGE
        System.out.print("\nEnter a Message: ");
        String message = input.nextLine();
        System.out.println(message);

       saveToFile("Message", message);

        System.out.println("Message is saved!");

//NUMBERS
        for (int i = 0; i < nums.length; i++) {
            System.out.print("\nEnter " + numbers[i] + " Number: ");
            try {
                nums[i] = input.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input!");
                System.out.println("--------------");
                input.nextLine();
                i--;

            }


        }
        {
            System.out.print("Enter the operator (+,-,*,/): ");
            char op = input.next().charAt(0);
            int o = 0;

            switch (op) {
                case '+':
                    o = nums[0] + nums[1];
                    break;

                case '-':
                    o = nums[0] - nums[1];
                    break;

                case '*':
                    o = nums[0] * nums[1];
                    break;

                case '/':
                    o = nums[0] / nums[1
                            ];
                    break;


            }
            System.out.println("Result Is: " + o);
        }


            System.out.print("\nEnter a distance in km: ");
            int kiloMeters = input.nextInt();
            float miles = kiloMeters * 0.621371f;
            System.out.println((float) kiloMeters + " km is " + miles + " miles.");



        System.out.print("\nEnter a Number: ");
        int[] number = new int[input.nextInt()];
        for (int i = 1; i <= number.length; i++) {
            System.out.println(i);
        }



    }
    public static void saveToFile(String fileName, String data){
        File folder = new File(FOLDER);
        if (!folder.exists()){
            folder.mkdirs();
        }
        File gradeFile = new File(folder, fileName);
        try (FileWriter fr = new FileWriter(gradeFile)){
            fr.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }




}


