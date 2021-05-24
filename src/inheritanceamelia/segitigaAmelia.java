package inheritanceamelia;

public class segitigaAmelia extends bangunDatarAmelia {
   
    //overloading dengan parameter beda
    public void luas (int a, int t){
        int luas = (int) (a*t*0.5);
        System.out.println("Luas Segitiga Tersebut Adalah = " +luas);
    }
    
    public void luas (double a, double t){
        double luas = a*t*0.5;
        System.out.println("Luas Segitiga Tersebut Adalah = " +luas);
    }
    
    public void keliling (int sisi){
        int keliling = 3*sisi;
        System.out.println("Keliling Segitiga Tersebut Adalah = " +keliling);
    }
    
    public void keliling (double sisi){
        double keliling = 3*sisi;
        System.out.println("Keliling Segitiga Tersebut Adalah = " +keliling);
    }
   
}