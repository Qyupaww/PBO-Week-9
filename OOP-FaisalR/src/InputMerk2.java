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

public class InputMerk2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String input;
       input = JOptionPane.showInputDialog("Masukan harga : ");
       long harga = Integer.valueOf(input).intValue();
       JOptionPane.showMessageDialog(null, harga);
    }
    
}
