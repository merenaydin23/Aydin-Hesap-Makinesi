import java.util.Scanner;
public class Main {
    static void top() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen toplanacak sayıları giriniz");
        double a = klavye.nextDouble();
        double b = klavye.nextDouble();
        double sonuc = a + b;
        System.out.println("Toplam = " + sonuc);
    }

    static void cikarma() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen eksilen sayıyı giriniz");
        double a = klavye.nextDouble();
        System.out.println("Lütfen çıkan değeri giriniz");
        double b = klavye.nextDouble();
        double sonuc = a - b;
        System.out.println("Sonuc = " + sonuc);
        System.out.println("---------------------------------------");
    }

    static void carpma() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen çarpılacak sayıları giriniz");
        double a = klavye.nextDouble();
        double b = klavye.nextDouble();
        double sonuc = a * b;
        System.out.println("Çarpım = " + sonuc);
        System.out.println("---------------------------------------");
    }

    static void bolme() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bölünen sayıyı giriniz");
        double a = klavye.nextDouble();
        System.out.println("Lütfen bölen sayıyı giriniz");
        double b = klavye.nextDouble();
        double sonuc = a / b;
        System.out.println("Sonuc = " + sonuc);
        System.out.println("---------------------------------------");
    }

    static void us() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen taban değerini giriniz");
        double a = klavye.nextDouble();
        System.out.println("Lütfen üs değerini giriniz");
        double b = klavye.nextDouble();
        double sonuc = Math.pow(a, b);
        System.out.println("Sonuç = " + sonuc);
        System.out.println("---------------------------------------");
    }

    static void fak() {
        Scanner klavye = new Scanner(System.in);
        int a,fak=1;
     do {
         System.out.println("Faktoriyeli istenen sayıyı girin");
         a=klavye.nextInt();
     }while (a<0);
        if (a==1^a==0){
            System.out.println("Sonuc = 1");
        }
        else {
            for (int i=1;i<=a;i++){
                fak*=i;
            }
            System.out.println("Sonuc = "+fak);
        }
   System.out.println("---------------------------------------------------------------");
    }

    static void mod(){
        Scanner klavye=new Scanner(System.in);
        System.out.println("Modu alınacak sayıyı girin");
        double a=klavye.nextDouble();
        System.out.println("Modun hangi sayıya göre alınaçağını girin");
        double b=klavye.nextDouble();
        double sonuc=a%b;
        System.out.println("Sonuç= "+sonuc);
        System.out.println("----------------------------------------------------------");
    }
static void dikdortgen(){
    Scanner klavye=new Scanner(System.in);
    System.out.println("Dikdörtgenin 1.kenarını girin");
    double a=klavye.nextDouble();
    System.out.println("Dikdörtgenin 2.kenarını girin");
    double b= klavye.nextDouble();
    double cevre=2*(a+b);
    double alan=a*b;
    System.out.println("Dikdörtgenin çevresi = "+cevre);
    System.out.println("Dikdörtgenin alanı = "+alan);
    System.out.println("--------------------------------------------------------");
    }


    public static void main(String[] args) {
        System.out.println("Aydın Hesap Makinesi Mobil Uygulamasına Hoş Geldiniz");
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        Scanner klavye=new Scanner(System.in);
        int islem;
        do {
            System.out.println(menu);
            System.out.println("Lütfen yapaçağınız işlemi seçiniz");
            islem = klavye.nextInt();
            switch (islem) {
                case 1:
                    top();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    us();
                    break;
                case 6:
                    fak();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 0:
                    System.out.println("İsteğiniz üzerine Aydın Hesap Makinesi Uygulaması kapatılmıştır.");
                    System.out.println("Aydın Hesap Makinesi  Uygulaması iyi çalışmalar diler.");


            }
        }while (islem != 0) ;
}}