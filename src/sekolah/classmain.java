/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sekolah;

import java.util.Scanner;

/**
 *
 * @author Irsyad
 */
public class classmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih;
        hewann1 b1 = new hewann1();
        hewan2 b2 = new hewan2();
        Scanner masukan = new Scanner(System.in);
        System.out.println("hewan yang akan  di pilih ");
        System.out.println("1.Kelinci");
        System.out.println("2.Singa");
        System.out.print("Pilih satu : ");
        pilih = masukan.nextInt();
        switch (pilih) {
            case 1:
                b1.hewan1();
                break;
            case 2:
                b2.hewan2();
                break;
            case 3:
                System.out.println("maaf tidak tersedia hewan");
                break;
                
            

        }

    }

}
