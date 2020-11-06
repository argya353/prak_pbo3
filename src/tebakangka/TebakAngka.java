/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ayaya
 */
public class TebakAngka {
    int angka;
    int tebak;
    
    void tebak(){
        Random rand=new Random();
        this.angka=rand.nextInt(100);
        
        do{
        Scanner n=new Scanner(System.in);
        System.out.println("Tebakan Anda : ");
        this.tebak=n.nextInt();
        
        if(tebak==angka){
            System.out.println("Yeeee... Bilangan tebakan anda BENAR :-)");
        }
        if(tebak<angka){
            System.out.println("Hehehe... Bilangan tebakan anda terlalu kecil");
        }
        if(tebak>angka){
            System.out.println("Hehehe... Bilangan tebakan anda terlalu besar");
        }
        }while(tebak != angka);
    }
    
}
