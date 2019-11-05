/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan57.vehicle;

/**
 *
 * @author 
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bcy = new Bicycle();
        bcy.setMyBrand("Trek Bike");
        bcy.setMyModel("7.4FX");
        bcy.setMyGearCount(23);
        System.out.println("Brand : " + bcy.getMyBrand());
        System.out.println("Model : " + bcy.getMyModel());
        System.out.println("Jumlah Gear : " + bcy.getMyGearCount());
        System.out.println("");
        
        Skateboard sktbd = new Skateboard();
        sktbd.setMyBrand("Ally Skate");
        sktbd.setMyModel("Rocket");
        sktbd.setMyBoardLength(54.5);
        System.out.println("Brand : " + sktbd.getMyBrand());
        System.out.println("Model : " + sktbd.getMyModel());
        System.out.println("Panjangnya Board : " + sktbd.getMyBoardLength());
        System.out.println("");
    }
    
}
