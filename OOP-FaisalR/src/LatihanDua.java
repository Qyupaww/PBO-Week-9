/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import javax.swing.*;

  class luas_segitiga{
        String alas, tinggi;
        public void input(){
            alas = JOptionPane.showInputDialog("Masukan Alas:");
            tinggi = JOptionPane.showInputDialog("Masukan Tinggi:");   
        }
    public double hitung(){
        long a = Long.parseLong(alas);
        long t = Long.parseLong(tinggi);
        return (0.5*a*t);
    }
    public void hasil(){
        JOptionPane.showMessageDialog(null, "0.5" +alas+" * "+tinggi+"="+hitung());
    }
}

      public class LatihanDua {
public static void main(String[] args) {
    luas_segitiga m = new luas_segitiga();
    m.input();
    m.hasil();
}
}