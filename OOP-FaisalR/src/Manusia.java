/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Faisal Rahman
 */
public class Manusia {
    public String nama, hobby, pekerjaan;
    public Manusia (String nm, String hobby, String kerja) {
        this.nama = nm;
        this.hobby = hobby;
        this.pekerjaan = kerja;
    }
    public String tampilManusia(){
        return("Nama\t\t: " + nama + "\n" + "Hbby\t\t: " + hobby + "\n" + "Pekerjaan\t: " + pekerjaan + "\n");
    }
    
}

class programmer extends Manusia {
    public programmer(String nm, String hobby, String kerja){
        super(nm, hobby, kerja);
    }
}

class polisi extends Manusia {
    public polisi(String nm, String hobby, String kerja){
        super(nm, hobby, kerja);
    }
}

class kegiatan {
    public static void main(String args[]){
        Manusia[] informasi = new Manusia[2];
        informasi[0] = new programmer("Programmer", "Futsal", "Mengetik Sintak");
        informasi[1] = new polisi ("Polisi", "Futsal", "Operasi Keliling");
        for (int i=0; i<2; i++){
        System.out.println("----------------");
        System.out.println(informasi[1].tampilManusia());
        
    }
    }
}

