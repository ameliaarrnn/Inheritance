package Enkapsulasi;

public class UserAmelia {
    public String nama, nomorID;
    private String riwayatSakit;
    protected String noHP;
    String bangsal;
    
    public void methodPublic(){
        System.out.println("Ini Adalah Method Public");
    }
    
    private void methodPrivate(){
        System.out.println("Ini Adalah Method Private");
    }
    
    protected void methodProtected(){
        System.out.println("Ini Adalah Method Protected");
    }
    
    void methodDeafault(){
        System.out.println("Ini Adalah Method Default");
    }
 
    public void setRiwayatSakit (String sakit){
        this.riwayatSakit=sakit;
    }
    
    public String getRiwayatSakit(){
        return this.riwayatSakit;
    }
}
