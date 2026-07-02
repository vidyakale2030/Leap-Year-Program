import java.util.Scanner;

public class Q13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && 100 !=0)) {
            System.out.println(year +  " is a leap year");
        }else{
            System.out.println(year +  " is a Not leap year");
        }
        sc.close();
    }
}
