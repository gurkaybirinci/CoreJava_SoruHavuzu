package soruhavuzu.soru13;

/*
    Bir kullanıcının doğum yılını girdiğinde yaşını hesaplayacak ve yaşına göre hangi yaş kategorisine girdiğini
    ekrana yazdıracak bir program yazınız.
    Yaş Kategorileri:
    Ergen:	    (x < 13)
    Genç: 	    (13<= x < 20)
    Orta yaşlı: (20<= x < 40)
    Yaşlı: 		(x >= 40)
*/

import java.time.LocalDate;
import java.util.Scanner;

public class Soru13 {

    public static void main(String[] args) {


        // 1.Kullanicinin dogum yilini alalim
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen dogum yilinizi giriniz:");
        int dogumYili = scan.nextInt();


        // 2.Guncel yili alalim
        int guncelYil = LocalDate.now().getYear();


        // 3.Kullanicinin yasini hesaplayalim
        int yas = guncelYil - dogumYili;


        // 4.Kullaniciyi ilgili oldugu kategoriye yerlestirelim
        if(yas < 13){
            System.out.println("Ergen");
        } else if (yas < 20) {
            System.out.println("Genç");
        } else if (yas < 40) {
            System.out.println("Orta yaşlı");
        } else {
            System.out.println("Yaşlı");
        }
        
    }

}













