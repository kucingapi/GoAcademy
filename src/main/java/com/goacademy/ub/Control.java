package com.goacademy.ub;

import java.util.Scanner;

public class Control extends Calculator{
    Scanner inputStream;
    public  void run(){
        inputStream = new Scanner(System.in);
        while (true) {
            processInput(inputStream.nextLine());
        }
    }
    public void processInput(String input) {
        String[] splittedInput = input.split(" ");
        String command = splittedInput[0];
        int value = 0;

        if(splittedInput.length == 2) {
            value = Integer.parseInt(splittedInput[1]);
        }

        switch (command) {
            case "add":
                add(value);
                break;
            case "subtract":
                subtract(value);
                break;
            case "multiply":
                multiply(value);
                break;
            case "divide":
                if(value == 0) {
                    System.out.println("Cannot divide by 0");
                } else {
                    divide(value);
                }
                break;
            case "reset":
                reset();
                break;
            case "exit":
                System.exit(0);
                break;
            default:
                System.out.println();
        }
        System.out.println(result);
    }
}
