import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year) == 1) {
            System.out.println("12.09."+year);
        }else {
            System.out.println("13.09."+year);
        }
    }

    public static int isLeapYear(int year) {
        int programYear = 0;
        if(year % 400 == 0 && year % 100 == 0) {
            programYear = 1;
        }else if(year % 4 == 0 && year % 100 > 0){
            programYear = 1;
        }
        return programYear;
    }

}