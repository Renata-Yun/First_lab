import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Простые числа от 2 до 100");
        Primes.primes();
        System.out.println("");
        System.out.print("Введите слово:");
        String kk = scanner.nextLine();
        Palindrome.isPalindrome(kk);
    }
}
