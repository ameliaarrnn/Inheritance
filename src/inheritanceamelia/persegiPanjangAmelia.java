package inheritanceamelia;


public class persegiPanjangAmelia extends bangunDatarAmelia{
    
    //overloading dengan parameter beda
    public void luas(int p, int l ){
        int luas = p*l;
        System.out.println("Luas Persegi Panjang Tersebut Adalah = " +luas);
    }
  
    public void luas(double p, double l){
        double luas = p*l;
        System.out.println("Luas Persegi Panjang Tersebut Adalah = " +luas);
    }
    
    public void keliling (int p, int l){
        int keliling = 2*p + 2*l;
        System.out.println("Keliling Persegi Panjang Tersebut Adalah = " +keliling);
    }
    
    public void keliling (double p, double l){
        double keliling = 2*p + 2*l;
        System.out.println("Keliling Persegi Panjang Tersebut Adalah = " +keliling);
    }
    
}
