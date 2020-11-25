
import java.util.Scanner;

public class UsePrintF {

    public static void main(String[] args) {
        // یک اسکنر برای گرفتن مقدار از کاربر تعریف میکنیم
        Scanner sc = new Scanner(System.in);

        // یک حلقه به اندازه 3 بار تکرار میزنیم
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next(); // رشته استرینگ را از کاربر میگیرد
            int x = sc.nextInt(); // مقدار عددی را از کاربر میگیرد
            // توسط پرینت اف به فرمت دلخواه خود درمیاوریم
            //%s => string ,, %d => digit ,,%f => float
            //-15 => stringLength + space = 15
            // 3d => digit with 3 ragham
            System.out.printf("%-15s%3d%n", s1, x);
        }

    }
}

