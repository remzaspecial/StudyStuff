package company.pompany;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//to read an expression entered from the keyboard
        Stack<Integer> integerStack = new Stack<Integer>();//For storing Arabic numbers
        String operation = new String();//For storing operation symbol

        Map<String, Integer> IntegerMap = new HashMap<String, Integer>();//to work with Roman numbers, we use a HashMap, which we sequentially fill with keys and values
        IntegerMap.put("I", 1);//each cell of our HashMap contains an identifier in the form of a Roman number and its value in the form of an Arabic number
        IntegerMap.put("II", 2);
        IntegerMap.put("III", 3);
        IntegerMap.put("IV", 4);
        IntegerMap.put("V", 5);
        IntegerMap.put("VI", 6);
        IntegerMap.put("VII", 7);
        IntegerMap.put("VIII", 8);
        IntegerMap.put("IX", 9);
        IntegerMap.put("X", 10);

        System.out.println("Enter an expression: ");//output to the console a message that says to enter an expression
        String line = scanner.nextLine();//the string entered by the user is stored here
        String[] string = line.split(" ");//splits the string at whitespace and stores in the array

        if (isArabian.isArabianNumber(string[0])) {//check for an incoming number, if it is Arabic, then we enter the cycle
            for (int i = 0; i < string.length; i++) {
                if (isArabian.isArabianNumber(string[i])) {
                    if (Integer.parseInt(string[i]) <= 10) {//a prerequisite for the assignment - incoming numbers must be no more than 10
                        integerStack.push(Integer.parseInt(string[i]));
                    }
                } else if (isOperation.isOperation(string[i])) {
                    operation = string[i];
                }
            }
            int tmp1 = integerStack.pop();//after receiving two numbers and an operation sign, we create 2 variables and assign values to them
            int tmp2 = integerStack.pop();//since the values change their sequence when exiting the stack, we later swap them
            switch (operation) {//we use the switch operator to perform arithmetic operation
                case "+":
                    System.out.println("Your answer: ");
                    System.out.println(tmp2 + tmp1);
                    break;
                case "-":
                    System.out.println("Your answer: ");
                    System.out.println(tmp2 - tmp1);
                    break;
                case "*":
                    System.out.println("Your answer: ");
                    System.out.println(tmp2 * tmp1);
                    break;
                case "/":
                    System.out.println("Your answer: ");
                    System.out.println(tmp2 / tmp1);
                    break;
                default :
                    System.out.println("Wrong operation");
                    break;
            }
        }
        else if(isRoman.isRomanNumber(string[0])){//same with Roman numbers
            for (int i = 0; i < string.length; i++) {
                if(isRoman.isRomanNumber(string[i])){
                    integerStack.push(IntegerMap.get(string[i]));
                }
                else if (isOperation.isOperation(string[i])){
                    operation = string[i];
                }
            }
            int tmp1 = integerStack.pop();
            int tmp2 = integerStack.pop();

            switch (operation) {
                case "+":
                    System.out.println("Your answer: ");
                    int answer = tmp2 + tmp1;
                    System.out.println(ToRoman.toRoman(answer));
                    break;
                case "-":
                    System.out.println("Your answer: ");
                    int answer1 = tmp2 - tmp1;
                    System.out.println(ToRoman.toRoman(answer1));
                    break;
                case "*":
                    System.out.println("Your answer: ");
                    int answer2 = tmp2 * tmp1;
                    System.out.println(ToRoman.toRoman(answer2));
                    break;
                case "/":
                    System.out.println("Your answer: ");
                    int answer3 = tmp2 / tmp1;
                    System.out.println(ToRoman.toRoman(answer3));
                    break;
                default :
                    System.out.println("Wrong operation");
                    break;
            }
        }
    }
}
