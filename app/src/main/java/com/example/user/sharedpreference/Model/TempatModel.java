package com.example.user.sharedpreference.Model;

public class TempatModel {
    String namaTempat;
    int picTempat;
    String overview;

    public TempatModel(String namaTempat, int picTempat, String overview){
        this.namaTempat = namaTempat;
        this.picTempat = picTempat;
        this.overview = overview;
    }
    public String getNamaKampus() {
        return namaTempat;
    }

    public int getPicKampus() {
        return picTempat;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) { this.overview = overview; }

}
