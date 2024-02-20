import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String processedInput = input.replaceAll("\\s", "").toLowerCase();

        boolean Palindrome = true;
        for (int i = 0; i < processedInput.length() / 2; i++) {
            if (processedInput.charAt(i) != processedInput.charAt(processedInput.length() - 1 - i)) {
                Palindrome = false;
                break;
            }
        }

        if (Palindrome) {
            System.out.println("Введенная строка является палиндромом!");
        } else {
            System.out.println("Введенная строка не является палиндромом.");
        }
    }
}
