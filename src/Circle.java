import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz : ");
        int R = input.nextInt();
        double pi =3.14159;
        double daireCevre = (2*pi*R);
        double daireAlan = (pi*R*R);
        int daireCap = (2*R);
        System.out.println("Dairenin Cevresi : " + daireCevre);
        System.out.println("Dairenin Alani : " + daireAlan);
        System.out.println("Dairenin Capi : " + daireCap);
        
   }
}