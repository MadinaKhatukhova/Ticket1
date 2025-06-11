import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку для проверки: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Строка \"" + input + "\" является палиндромом.");
        } else {
            System.out.println("Строка \"" + input + "\" не является палиндромом.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Удаляем пробелы и приводим к нижнему регистру
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();

        // Сравниваем строку с её обратной версией
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

