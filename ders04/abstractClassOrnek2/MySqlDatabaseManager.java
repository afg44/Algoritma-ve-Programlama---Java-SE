package ders04.abstractClassOrnek2;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Veri getirildi : MySQL");
    }
}
