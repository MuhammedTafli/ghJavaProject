package asalSayiHesaplama;

public class asalSayi {
    public static void main(String[] args) {
        int number = 0;

        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı asal değildir.");
            return;
        }

        if (number < 1) {
            System.out.println("Geçersiz sayı girdiniz. Tekrar denemeye ne dersiniz ?");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {

                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Sayı asaldır.");
        } else {
            System.out.println("Sayı asal değildir.");
        }
    }

}