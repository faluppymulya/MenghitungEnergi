import java.util.Scanner;
public class MenghitungEnergi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Menghitung energi potensial dan energi kinetik ");
        int massa, ketinggian, kecepatan;

        System.out.printf("%-17s = ", "Massa");
        massa = input.nextInt();
        System.out.printf("%-17s = ", "Ketinggian");
        ketinggian = input.nextInt();
        System.out.printf("%-17s = ", "Kecepatan");
        kecepatan = input.nextInt();
        
        double energiPotensial, energiKinetik, energiMekanik;
        energiPotensial = massa * ketinggian * 10;
        energiKinetik = 0.5 * massa * kecepatan * kecepatan;
        energiMekanik = energiPotensial + energiKinetik;

        System.out.printf("%-17s = %s\n", "Energi Potensial", energiPotensial);
        System.out.printf("%-17s = %s\n", "Energi Kinetik", energiKinetik);
        System.out.printf("%-17s = %s\n", "Energi Mekanik", energiMekanik);
        input.close();

    }
}
