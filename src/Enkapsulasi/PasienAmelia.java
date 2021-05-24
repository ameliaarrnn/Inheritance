package Enkapsulasi;

public class PasienAmelia extends UserAmelia implements IdaruratAmelia{

    String bangsal;
    String nama;
    String noHP;
    String nomorID;
    private String getRiwayatSakit;
    
    
    @Override
    public void panggilDokter() {
        System.out.println("Pasien dengan Nama  : " +this.nama);
        System.out.println("ID Pasien  : " +this.nomorID);
        System.out.println("Nomor HP Pasien  : " +this.noHP);
        System.out.println("Riwayat Sakit  : " +this.getRiwayatSakit);
        System.out.println("Memanggil Dokter Untuk Segera Masuk ke Bangsal  : " +this.bangsal);
    }

}
    

