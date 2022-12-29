import java.io.Serializable;

public class Data implements Serializable {
  private  int urunNo, urunMiktar;
   private String urunAd;
   private float urunFiyat;

    public Data(int urunNo, int urunMiktar, String urunAd, float urunFiyat) {
        this.urunNo = urunNo;
        this.urunMiktar = urunMiktar;
        this.urunAd = urunAd;
        this.urunFiyat = urunFiyat;
    }
    private static final long serialVersionUID = 4801633306273802062L;
    @Override
    public String toString() {
        return "Data{" +
                "urunNo=" + urunNo +
                ", urunMiktar=" + urunMiktar +
                ", urunAd='" + urunAd + '\'' +
                ", urunFiyat=" + urunFiyat +
                '}';
    }

    public Data() {
    }

    public int getUrunNo() {
        return urunNo;
    }

    public void setUrunNo(int urunNo) {
        this.urunNo = urunNo;
    }

    public int getUrunMiktar() {
        return urunMiktar;
    }

    public void setUrunMiktar(int urunMiktar) {
        this.urunMiktar = urunMiktar;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public float getUrunFiyat() {
        return urunFiyat;
    }

    public void setUrunFiyat(float urunFiyat) {
        this.urunFiyat = urunFiyat;
    }
}
