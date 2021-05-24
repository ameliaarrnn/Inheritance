package inheritanceamelia;


public class persegiAmelia extends bangunDatarAmelia {
    
    //overloading dengan parameter beda
    public void luas (int sisi){
        int luas = sisi*sisi;
        System.out.println("Luas Persegi Tersebut Adalah = " +luas);
    }
    
    public void luas (double sisi){
       double luas = sisi*sisi;
       System.out.println("Luas Persegi Tersebut Adalah = " +luas); 
    }
    
    public void keliling (int sisi){
        int keliling = 4*sisi;
        System.out.println("Keliling Persegi Tersebut Adalah = " +keliling);
    }
    
    public void keliling (double sisi){
         double keliling = 4*sisi;
         System.out.println("Keliling Persegi Tersebut Adalah = " +keliling);
    }
    
}
