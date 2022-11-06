package j25_Encapsulation.Task01;

import java.util.ArrayList;

public class Okul {
    private  String okulAd;
    private int maxOgrenciSayisi;
    private ArrayList<String> ogrenciler =new ArrayList<>();

    public Okul(String okulAd, int maxOgrenciSayisi) {
        this.okulAd = okulAd;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<String> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<String> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }
}
