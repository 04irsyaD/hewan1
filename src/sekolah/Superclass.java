/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sekolah;

/**
 *
 * @author Irsyad
 */
public class Superclass {

    private String kelinci, singa;
    private String jinak, buas, makanan, makanan_a, jenis, jenis_a;
    private double berat, berat_a;

    void name() {
        kelinci = "Kelinci";
        System.out.println(kelinci);
    }

    void name_a() {
        singa = "singa";
        System.out.println(singa);
    }
    
    void karakteristic(){
        jinak = "Jinak";
        System.out.println(jinak);
                
    }
    void Karakteristic_a(){
        buas = "Buas";
        System.out.println(buas);
    }
    
    

    void weight() {
        berat = 3.5;
        System.out.println(berat);

    }

    void weight_a() {
        berat_a = 200.5;
        System.out.println(berat_a);

    }
    
    
    void type (){
        jenis = "herbifora";
        System.out.println(jenis);
        
    }
    
    
    void type_a(){
        jenis_a = "Karnifora";
        System.out.println(jenis_a);
    }

    void food() {
        makanan = "wortel,Selada,kangkung";
        System.out.println(makanan);

    }
    void food_a(){
        makanan_a = "daging";
        System.out.println(makanan_a);
    }
    
    void show(){
        
    }

}
