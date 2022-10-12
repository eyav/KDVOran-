import java.util.Scanner;

public class kdvhesaplayici {
    public static void main(String[] args) {
        double tutar, kdvTutar, kdvliTutar, kdvOranı;
        Scanner input= new Scanner(System.in);
        System.out.println("Ucret tutarını giriniz:");
        tutar = input.nextDouble();
        kdvOranı = (tutar <= 1000)?  kdvOranı=0.18 : 0.08;


            kdvTutar = (tutar * kdvOranı);
            kdvliTutar = tutar + kdvTutar;

            System.out.println("KDV'siz Tutar: " + tutar);
            System.out.println("KDV Oranı: " + kdvOranı);
            System.out.println("KDV Tutarı: " + kdvTutar);
            System.out.println("KDV'li Tutar: " + kdvliTutar);





    }



}
