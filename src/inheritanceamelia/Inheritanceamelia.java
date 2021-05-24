package inheritanceamelia;

public class Inheritanceamelia {

 
    public static void main(String[] args) {
      persegiPanjangAmelia panjang = new persegiPanjangAmelia();
      System.out.println("------HITUNG PERSEGI PANJANG-------");
      panjang.luas (8, 6);
      panjang.luas (2.5, 7.8);
      panjang.keliling(8, 6);
      panjang.keliling(2.5, 7.8);
      System.out.println("") ;
      
      persegiAmelia persegi = new persegiAmelia();
      System.out.println("-----HITUNG PERSEGI----"); 
      persegi.luas (4);
      persegi.luas(2);
      persegi.keliling(4);
      persegi.keliling(2);
      System.out.println("");  
      
      lingkaranAmelia lingkaran = new lingkaranAmelia();
      System.out.println("----HITUNG LINGKARAN-----"); 
      lingkaran.luas (7);
      lingkaran.luas(21.0);
      lingkaran.keliling(7);
      lingkaran.keliling(21.0);
      System.out.println("");  
      
      segitigaAmelia segitiga = new segitigaAmelia();
      System.out.println("-----HITUNG SEGITIGA-----"); 
      segitiga.luas (6, 6);
      segitiga.luas (4.5, 4.5);
      segitiga.keliling(6);
      segitiga.keliling(4.5);
      System.out.println("");
    }
    
}
