package org.example;

import java.util.Locale;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

        System.out.println(convertDecimalToBinary(5));
        System.out.println(convertDecimalToBinary(6));
        System.out.println(convertDecimalToBinary(13));

        WorkintechList numbers = new WorkintechList();

        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(2); // duplicate, eklenmemeli
        numbers.add(1);

        System.out.println("Numbers: " + numbers);

        numbers.sort();

        System.out.println("Sorted numbers: " + numbers);

        numbers.remove(3);

        System.out.println("3 silindikten sonra: " + numbers);


        // String listesi
        WorkintechList names = new WorkintechList();

        names.add("Veli");
        names.add("Ali");
        names.add("Ayşe");
        names.add("Ali"); // duplicate, eklenmemeli

        System.out.println("Names: " + names);

        names.sort();

        System.out.println("Sorted names: " + names);

        names.remove("Veli");

        System.out.println("Veli silindikten sonra: " + names);

    }
    public static boolean  checkForPalindrome(String  s){
        boolean palindrom = true;
        Stack<String> stack = new Stack<>();
        String[] sArray = s.toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z]", "").split("");
        for(int i = 0 ; i < sArray.length ; i++){
            stack.push(sArray[i]);
        }
        for(int i = 0 ; i < sArray.length ; i++){
            if(!stack.pop().equals(sArray[i])){
                palindrom = false;
                break;
            }
        }
        return palindrom;
    }
    public static String convertDecimalToBinary(int number){
        String binary = "";
        Stack<Integer> stack = new Stack<>();
        while(number > 0){
            int remainder = number % 2;
            stack.push(remainder);
            number = number / 2;
        }
        while(!stack.isEmpty()){
            binary = binary + stack.pop();
        }
        return binary;
    }
}