package Lab_Hafta_8_sinavOncesi.Loglama;

public class Ramo {
    public static void main(String[] args) {
        Hayvan hayvan = new Kedi();
        Kedi kedi = new Kedi();
        
        
        ((Kedi) hayvan).kedkonus();
        


        

    }
}


class Hayvan {

    public void konus() {
        System.out.println("ben hayvanım");
    }
}

class Kedi extends Hayvan {
    public void kedkonus() {
        System.out.println("ben kediyim");
    }
}
