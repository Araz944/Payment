import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emeliyyati secin: "
                + "\n 1.Topla"
                + "\n 2.Cixma"
                + "\n 3.Vurma"
                + "\n 4.Bolme"
        );

        String menu = sc.next();
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        if (menu.equals("Topla")) {
            int cem = a+b;
            System.out.println(cem);
        }
        else if (menu.equals("Cixma")) {
            int ferq = a-b;
            System.out.println(ferq);
        }
        else if (menu.equals("Vurma")) {
            int hasil = a*b;
            System.out.println(hasil);
        }
        else if (menu.equals("Bolme")) {
            int netice = a/b;
            System.out.println(netice);
        }
        else {
            System.out.println("Sehv input daxil edilmishdir");
        }
    }
}
