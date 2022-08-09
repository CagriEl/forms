package com.casestudy.demo.model;

public class Form {

    private int id;

    private String ad_soyad;
    private String mersis_no;

    private String adres;

    private String telefon;

    private String e_posta;

    private String dogum_tarihi;

    private String tercih_sebebi;

    private String perakende_ticareti;

    private String il_ilce_tercih;

    private String yatirim_miktari;

    private String eklemek_istenilenler;

    public Form(int id, String ad_soyad, String mersis_no, String adres, String telefon, String e_posta, String dogum_tarihi, String tercih_sebebi, String perakende_ticareti, String il_ilce_tercih, String yatirim_miktari, String eklemek_istenilenler) {
        this.id = id;
        this.ad_soyad = ad_soyad;
        this.mersis_no = mersis_no;
        this.adres = adres;
        this.telefon = telefon;
        this.e_posta = e_posta;
        this.dogum_tarihi = dogum_tarihi;
        this.tercih_sebebi = tercih_sebebi;
        this.perakende_ticareti = perakende_ticareti;
        this.il_ilce_tercih = il_ilce_tercih;
        this.yatirim_miktari = yatirim_miktari;
        this.eklemek_istenilenler = eklemek_istenilenler;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setDogum_tarihi(String dogum_tarihi) {
        this.dogum_tarihi = dogum_tarihi;
    }

    public void setE_posta(String e_posta) {
        this.e_posta = e_posta;
    }

    public void setTercih_sebebi(String tercih_sebebi) {
        this.tercih_sebebi = tercih_sebebi;
    }

    public void setEklemek_istenilenler(String eklemek_istenilenler) {
        this.eklemek_istenilenler = eklemek_istenilenler;
    }


    public void setIl_ilce_tercih(String il_ilce_tercih) {
        this.il_ilce_tercih = il_ilce_tercih;
    }

    public void setPerakende_ticareti(String perakende_ticareti) {
        this.perakende_ticareti = perakende_ticareti;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setYatirim_miktari(String yatirim_miktari) {
        this.yatirim_miktari = yatirim_miktari;
    }

    public void setMersis_no(String mersis_no) {
        this.mersis_no = mersis_no;
    }

    public String getAdres() {
        return adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getTercih_sebebi() {
        return tercih_sebebi;
    }

    public String getYatirim_miktari() {
        return yatirim_miktari;
    }

    public String getDogum_tarihi() {
        return dogum_tarihi;
    }

    public String getE_posta() {
        return e_posta;
    }


    public String getEklemek_istenilenler() {
        return eklemek_istenilenler;
    }

    public String getIl_ilce_tercih() {
        return il_ilce_tercih;
    }

    public String getPerakende_ticareti() {
        return perakende_ticareti;
    }


    public String getMersis_no() {
        return mersis_no;
    }

    public String getAd_soyad() {
        return ad_soyad;
    }

    public void setAd_soyad(String ad_soyad) {
        this.ad_soyad = ad_soyad;
    }

    public Form() {

    }



    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id ;
    }

}