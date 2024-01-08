package com.example.javaproject.entity;

public class News {
    public  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String HaberBasligi;
    public String HaberAyrintilari;
    public String HaberGorsel;
    public String HaberTarihi;

    public String getHaberBasligi() {
        return HaberBasligi;
    }

    public void setHaberBasligi(String haberBasligi) {
        HaberBasligi = haberBasligi;
    }

    public String getHaberAyrintilari() {
        return HaberAyrintilari;
    }

    public void setHaberAyrintilari(String haberAyrintilari) {
        HaberAyrintilari = haberAyrintilari;
    }

    public String getHaberGorsel() {
        return HaberGorsel;
    }

    public void setHaberGorsel(String haberGorsel) {
        HaberGorsel = haberGorsel;
    }

    public String getHaberTarihi() {
        return HaberTarihi;
    }

    public void setHaberTarihi(String haberTarihi) {
        HaberTarihi = haberTarihi;
    }
}
