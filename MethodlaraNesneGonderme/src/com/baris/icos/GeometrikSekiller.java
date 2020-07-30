package com.baris.icos;

public class GeometrikSekiller
{
    private  static int en;
    private  static int boy;

    public static int getEn() {
        return en;
    }

    public  void setEn(int en) {
        GeometrikSekiller.en = en;
    }

    public  int getBoy() {
        return boy;
    }

    public static void setBoy(int boy) {
        GeometrikSekiller.boy = boy;
    }

    @Override
    public String toString() {
        return "En bilgisi : "+ this.en + "Boy Bilgisi :" + this.boy;
    }
}
