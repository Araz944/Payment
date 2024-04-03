package bitwiseAND;

public class BitwiseAND {
    public static void main(String[] args) {
        Pass a = new Pass(20);

        if (a.age > 21 && a.name.equals("elgun")) {
            System.out.println("Access given");
        } else {
            System.out.println("Rejected");
        }
    }
}
