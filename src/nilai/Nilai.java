/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilai;

/**
 *
 * @author Advan
 */
public class Nilai {

    /**
     * @param args the command line arguments
     */
     private double nilai1, nilai2, nilai3, nilai4, nilai5;

    public Nilai(double nilai1, double nilai2, double nilai3, double nilai4, double nilai5) {
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
    }

    public double hitungNilaiAkhir() {
        return (nilai1 * 0.10) + (nilai2 * 0.15) + (nilai3 * 0.25) + (nilai4 * 0.15) + (nilai5 * 0.35);
    }
    
}
