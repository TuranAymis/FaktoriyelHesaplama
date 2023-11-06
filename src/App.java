import java.util.Scanner;

public class App {
    /*
        Proje Konusu 
    #Java ile kullanıcını girdiği değerinin faktöriyelini hesaplayan programı yazın.

    Örnek Çıktı
    Faktöriyel Sayısı : 3
    Sonuç : 6
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number;
        int result = 1;
        int i;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for (i = 1; i <= number; i++ ){
            result *= i;
        }
        System.out.println(result);
    }
}
