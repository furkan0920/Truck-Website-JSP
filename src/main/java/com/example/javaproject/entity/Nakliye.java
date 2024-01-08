package com.example.javaproject.entity;

public class Nakliye extends User {
    private  int id;
    private int SoforId;
    private String selectedDepartureCity;
    private String selectedDepartureDistrict;
    private String selectedDestinationCity;
    private String selectedDestinationDistrict;
    private String YukTuru;
    private String KalkisTarihi;
    private int Kapasite;


    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
    public String getSelectedDepartureCity() {
        return selectedDepartureCity;
    }
    public void setSelectedDepartureCity(String selectedDepartureCity) {
        this.selectedDepartureCity = selectedDepartureCity;
    }
    public String getSelectedDepartureDistrict() {
        return selectedDepartureDistrict;
    }
    public void setSelectedDepartureDistrict(String selectedDepartureDistrict) {
        this.selectedDepartureDistrict = selectedDepartureDistrict;
    }
    public String getSelectedDestinationCity() {
        return selectedDestinationCity;
    }
    public void setSelectedDestinationCity(String selectedDestinationCity) {
        this.selectedDestinationCity = selectedDestinationCity;
    }
    public String getSelectedDestinationDistrict() {
        return selectedDestinationDistrict;
    }
    public void setSelectedDestinationDistrict(String selectedDestinationDistrict) {
        this.selectedDestinationDistrict = selectedDestinationDistrict;
    }
    public String getYukTuru() {
        return YukTuru;
    }
    public void setYukTuru(String yukTuru) {
        YukTuru = yukTuru;
    }
    public String getKalkisTarihi() {
        return KalkisTarihi;
    }
    public void setKalkisTarihi(String kalkisTarihi) {
        KalkisTarihi = kalkisTarihi;
    }
    public int getKapasite() {
        return Kapasite;
    }
    public void setKapasite(int kapasite) {
        Kapasite = kapasite;
    }
    public int getSoforId() {
        return SoforId;
    }
    public void setSoforId(int soforId) {
        SoforId = soforId;
    }


}
