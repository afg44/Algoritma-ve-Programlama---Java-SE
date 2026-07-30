package ders05.konu3.ornek2;

public class OracleDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData()
    {
        System.out.println("Veri getirildi : Oracle");
    }
    
    /*
     * Yanlis kullanim - spagetti kodlama
     */
    public void getData(int type) {
    	if(type == 0) {
    		System.out.println("Oracle ile veri getirildi");
    	} else if(type == 1) {
            System.out.println("MySQL ile Veri getirildi");
        } else if(type == 2){
            System.out.println("SQL Server ile veri getirildi");
        }
    }
}
