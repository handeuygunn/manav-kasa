import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlıcan;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Kaç kg armut aldınız:");
        armut = girdi.nextDouble();

        System.out.print("Kaç kg elma aldınız:");
        elma = girdi.nextDouble();

        System.out.print("Kaç kg domates aldınız:");
        domates = girdi.nextDouble();

        System.out.print("Kaç kg muz aldınız:");
        muz = girdi.nextDouble();

        System.out.print("Kaç kg patlıcan aldınız:");
        patlıcan = girdi.nextDouble();

        double odenecek = (armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlıcan*5.0);

        System.out.print("odenecek tutar(tl cinsinden):");
        System.out.print(odenecek);
    }
}
