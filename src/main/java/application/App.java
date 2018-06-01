package application;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    static String evenOrOdd(int n) {
        String str = "";
        if (n % 2 == 0) {
            str += "The number is even";
        } else str += "The number is not even";
        boolean flag = false;
        if (n == 1)
            str += ", not simple and not composite";
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
                str += " and simple.";
                break;

            }
        }
        if (!flag) {
            str += " and composite ";
        }
        return str;
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    static List<Integer> lcmAndGcd(int a, int b) {
        List<Integer> mass = new ArrayList<Integer>();
        mass.add(a + b);
        mass.add(a - b);
        mass.add(gcd(a, b));
        mass.add(a * b / mass.get(2));
        return mass;
    }

    static boolean checkPalindrome(String str) {
        StringBuilder s = new StringBuilder(str);
        if (str.equals(s.reverse().toString())) {
            return true;
        }
        return false;
    }

    static String[] numberWords(String str) {
        String[] s = str.replaceAll("[-.?!)(,:]", " ").split("\\s+");
        Arrays.sort(s);
        return s;
    }

    static int checkWord(String str, String word) {
        String[] words = str.toLowerCase().replaceAll("[-.?!)(,:]", " ").split("\\s+");
        int k = 0;
        for (String w : words) {
            if (w.equals(word))
                k++;
        }
        return k;
    }

    static boolean triangleCheck(int a, int b, int c) {
        if (a * a + b * b == c * c)
            return true;
        if (a * a + c * c == b * b)
            return true;
        if (b * b + c * c == a * a)
            return true;
        return false;
    }

    static int[] minMax(int N) {
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 89) + 9);
        }
        Arrays.sort(array);
        return array;
    }

    static List<String> polindromeNumbers(int N) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            String str = String.valueOf(i);
            StringBuilder s = new StringBuilder(str);
            if (str.contentEquals(s.reverse())) {
                list.add(str);
            }
        }
        return list;
    }

    static void evenSum(int K) {
        int sum = 0;
        for (int i = 0; i < K; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("Sum=" + sum);
    }

    private static void combination(String a, String b, String c) {

        char abc[] = new char[]{a.toCharArray()[0], b.toCharArray()[0], c.toCharArray()[0]};
        int size = 3;
        int arr[] = new int[size];
        outer:
        while (true) {

            for (int ndx : arr) {
                System.out.print(abc[ndx]);
            }
            System.out.println();

            int i = size - 1;
            while (arr[i] == abc.length - 1) {
                arr[i] = 0;
                i--;
                if (i < 0) break outer;
            }
            arr[i]++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*task 1____________*/

        /*System.out.println("Input number:");
        int n = 0;
        try {
            n = Integer.valueOf(scanner.next());
            System.out.println(evenOrOdd(n));
        } catch (NumberFormatException e) {
            System.out.println("Error input");
        }*/
        /*task 2_____________*/
        /*
        System.out.println("Input numbers:");
        int a = 0, b = 0;
        try {
            a = Integer.valueOf(scanner.next());
            b = Integer.valueOf(scanner.next());
            List<Integer> mass = lcmAndGcd(a, b);
            System.out.println("Sum=" + mass.get(0) + " |" + "dif=" + mass.get(1)
                    + " |" + "LCM=" + mass.get(3) + "| " + "GCD=" + mass.get(2) + " |");
        } catch (NumberFormatException e) {
            System.out.println("Error input");
        }*/
        /*task 3_____________*/

        /*System.out.println("Input the word:");
        if (checkPalindrome(scanner.next())) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");*/
        /*task 4_____________*/
        /*System.out.println("Input the sentence:");
        String[] str = numberWords(scanner.nextLine());
        for (int i = 0; i < str.length; i++) {
            System.out.println(i+1 + " " + str[i]);
        }*/
        /*task 5_____________*/
        /*System.out.println("Input the sentence:");
        String text = scanner.nextLine();
        String word = scanner.next();
        System.out.println(checkWord(text, word));*/
        /*task 6_____________*/
        /*int a = 0, b = 0, c = 0;
        try {
            System.out.println("Input a");
            a = Integer.valueOf(scanner.next());
            System.out.println("Input b");
            b = Integer.valueOf(scanner.next());
            System.out.println("Input c");
            c = Integer.valueOf(scanner.next());
            if (triangleCheck(a, b, c)) System.out.println("Yes");
            else System.out.println("No");
        } catch (NumberFormatException e) {
            System.out.println("Error input");
        }*/
        /*task 7_____________*/
        /*int N = 0;
        try {
            System.out.println("Input mass length:");
            N = Integer.valueOf(scanner.next());
            int[] arr = minMax(N);
            System.out.println("Min=" + arr[0] + " Max=" + arr[arr.length - 1]);
        } catch (NumberFormatException e) {
            System.out.println("Error input");
        }*/
        /*task 8_____________*/
        /*int M = 0;
        try {
            System.out.println("Input mass length:");
            M = Integer.valueOf(scanner.next());
            if (M <= 100) {
                List<String> list = polindromeNumbers(M);
                for (String s : list) {
                    System.out.print(s + ", ");
                }
            } else System.out.println("Error input");
        } catch (NumberFormatException e) {
            System.out.println("Error input");
        }/*
        /*task 9_____________*/
        /*int K = 0;
        try {
            System.out.println("Input N:");
            K = Integer.valueOf(scanner.next());
            evenSum(K);
        } catch (NumberFormatException e) {
            System.out.println("Error input");
        }*/
        /*task 10____________*/
        /*try {
            String h, o, p;
            System.out.println("Input a");
            h = scanner.next();
            System.out.println("Input b");
            o = scanner.next();
            System.out.println("Input c");
            p = scanner.next();
            combination(h, o, p);
        } catch (NumberFormatException e) {
            System.out.println("Error input");
        }*/
    }
}
