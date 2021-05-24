package inheritanceamelia;


public class lingkaranAmelia extends bangunDatarAmelia{
    
    //overloading dengan parameter beda
    public void luas(int r){
        int luas = (int) (Math.PI*r*r);
        System.out.println("Luas Lingkaran Tersebut Adalah = " +luas);
    }
    
    public void luas (double r){
        double luas = Math.PI*r*r;
        System.out.println("Luas Lingkaran Tersebut Adalah = " +luas);
    }
    
    public void keliling(int r){
        int keliling = (int) (2*Math.PI*r);
        System.out.println("Keliling Lingkaran Tersebut Adalah = " +keliling);
    }
    
    public void keliling (double r){
        double keliling = 2*Math.PI*r;
        System.out.println("Keliling Lingkaran Tersebut Adalah = " +keliling);
    }
}
