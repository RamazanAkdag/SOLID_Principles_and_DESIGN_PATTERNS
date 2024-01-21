package SinavSoruCozum.Kutuphane;

public class MSSQLMateryal implements IDatabase {

    @Override
    public void add(IDbModel dbModel) {
        if (dbModel instanceof DbMateryal) {

            System.out.println(
                    ((DbMateryal) dbModel).getMateryalName() + " adli " + ((DbMateryal) dbModel).getMateryalType()
                            + " tipindeki materyal bilgileri veritabanina kaydedilmistir... ");
        }
    }

    @Override
    public void remove(IDbModel dbModel) {
        if (dbModel instanceof DbMateryal) {

            System.out.println(
                    ((DbMateryal) dbModel).getMateryalName() + " adli " + ((DbMateryal) dbModel).getMateryalType()
                            + " tipindeki materyal bilgileri veritabanindan silinmistir... ");
        }
    }

    @Override
    public void search(String materyal) {

        System.out.println(
                materyal
                        + " adli materyal bilgileri veritabaninda araniyor... ");

    }

}
