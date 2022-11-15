/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Faisal Rahman
 */
public class LatihanTiga {
    private String KodeBarang, NamaBarang;
    private int HPP, HargaJual, Stok, JumlahJual, StokSekarang, TotalBayar, Laba;
    
    public void inputKodeBarang (String KodeBarang){
            this.KodeBarang = KodeBarang;
    }
    public void inputNamaBarang (String NamaBarang){
            this.NamaBarang = NamaBarang;
    }
    public void inputHPP (int HPP){
            this.HPP = HPP;
    }
    public void inputHargaJual (int HargaJual){
            this.HargaJual = HargaJual;
    }
    public void inputStok (int Stok){
            this.Stok = Stok;
    }
    public void inputJumlahJual (int JumlahJual){
            this.JumlahJual = JumlahJual;
    }
    public void inputStokSekarang (int StokSekarang){
            this.StokSekarang = Stok - JumlahJual;
    }
    public void inputTotalBayar (int TotalBayar){
            this.TotalBayar = (int) (HargaJual * JumlahJual);
    }
    public void inputLaba (int Laba){
            this.Laba = (int) ((this.JumlahJual * this.HargaJual) - (this.HPP * this.JumlahJual));
    }
    
    public String tampilKodeBarang(){
                return KodeBarang;
    }
    public String tampilNamaBarang(){
                return NamaBarang;
    }
    public int tampilHPP(){
        return HPP;
    }
    public int tampilHargaJual(){
        return HargaJual;
    }
    public int tampilStok(){
        return Stok;
    }
    public int tampilJumlahJual(){
        return JumlahJual;
    }
    public int tampilStokSekarang(){
        return StokSekarang;
    }
    public int tampilTotalBayar(){
        return TotalBayar;
    }
    public int tampilLaba(){
        return Laba;
    }
    
    public static void main(String[] args) {
        LatihanTiga brg = new LatihanTiga();
        brg.inputKodeBarang("B001");
        brg.inputNamaBarang("Buku Gambar");
        brg.inputHPP(2500);
        brg.inputHargaJual(3000);
        brg.inputStok(5);
        brg.inputJumlahJual(2);
        brg.inputStokSekarang(3);
        brg.inputTotalBayar(6000);
        brg.inputLaba(1000);
        
        System.out.println("Input :");
        System.out.println("Kode Barang   : " + brg.tampilKodeBarang());
        System.out.println("Nama Barang   : " + brg.tampilNamaBarang());
        System.out.println("HPP           : " + brg.tampilHPP());
        System.out.println("Harga Jual    : " + brg.tampilHargaJual());
        System.out.println("Stok          : " + brg.tampilStok());
        System.out.println("Jumlah Jual   : " + brg.tampilJumlahJual());
        
        System.out.println("Output        : ");
        System.out.println("Stok Sekarang : " + brg.tampilStokSekarang());
        System.out.println("TotalBayar    : " + brg.tampilTotalBayar());
        System.out.println("Laba          : " + brg.tampilLaba());
    }
}
    
