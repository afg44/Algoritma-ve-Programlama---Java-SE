package ders04.abstractClassOrnek2;

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
    		System.out.println("Veri getirildi : Oracle");
    	}
    	else if(type == 1)
    		System.out.println("Veri getirildi : MySQL");
    }
}
