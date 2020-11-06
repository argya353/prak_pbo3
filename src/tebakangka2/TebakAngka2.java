/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ayaya
 */
public class TebakAngka2 {
    int angka;
    int tebak;
    int hp=100;
    int jumlah=5;
    
    void tebak(){
        Random rand=new Random();
        this.angka=rand.nextInt(100);
        
        do{
        Scanner n=new Scanner(System.in);
        System.out.println("Tebakan Anda : ");
        this.tebak=n.nextInt();
        
        if(tebak==angka){
            System.out.println("Yeeee... Bilangan tebakan anda BENAR :-)");
            System.out.println("Score anda : "+hp);
            if(tebak==angka && jumlah>0){
                hp=hp+50;
                System.out.println("Bonus : 50");
                System.out.println("Score anda : "+hp);
            }
        }
        if(tebak<angka){
            System.out.println("Hehehe... Bilangan tebakan anda terlalu kecil");
            hp=hp-2;
            jumlah=jumlah-1;
        }
        if(tebak>angka){
            System.out.println("Hehehe... Bilangan tebakan anda terlalu besar");
            hp=hp-2;
            jumlah=jumlah-1;
        }
        if(hp==0){
        System.out.println("Game Over");
        }
        }while(tebak != angka);
    }
}
