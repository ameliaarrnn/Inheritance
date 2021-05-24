package Enkapsulasi;

public class enkapsulasiamelia {
    
    public static void main(String[] args) {
        PasienAmelia p = new PasienAmelia();
        p.bangsal = "Pavilium Mawar";
        p.nama = "Amelia";
        p.noHP = "085712999140";
        p.nomorID = "237";
        p.setRiwayatSakit("Diare");
        
        p.panggilDokter();
        System.out.println();
        
        PasienAmelia p2 = new PasienAmelia ();
        p2.bangsal = "Pavilium Mawar";
        p2.nama = "Fachmie";
        p2.noHP = "085712699457";
        p2.nomorID = "276";
        p2.setRiwayatSakit("Demam");
        
        p2.panggilDokter();
      
    }
    
}
