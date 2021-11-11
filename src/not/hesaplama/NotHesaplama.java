/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package not.hesaplama;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class NotHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp= new Scanner(System.in);
        
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();
        
        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        
        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        
        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();
        
        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();
        
        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();
        
        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6;
        System.out.println(sonuc);
        
        String status = sonuc>=60?"Geçtiniz!":"Kaldınız";
        System.out.println(status);
        
        
        
    }
    
}
