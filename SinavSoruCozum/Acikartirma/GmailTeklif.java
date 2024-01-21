package SinavSoruCozum.Acikartirma;

public class GmailTeklif implements Gmail {

    @Override
    public void mailGonder(Mailable mailable) {
        if (mailable instanceof Teklif) {
            Teklif teklif = ((Teklif) mailable);
            System.out.println(teklif.getKullanici().getIsim() + " Kullanicisina " + teklif.getUrun().getIsim()
                    + " fiyat degisimi (" + teklif.getFiyat() + ") mail olarak bildirildi");
        } else {
            System.out.println("selam");
        }
    }

}
