package com.baris;

public class Personel
{
    private String isim;
    private String soyisim;
    private int yas;
    public  Personel()
    {
        //Parametersiz constractir
        isim="Henüz girilmedi";
        soyisim="Henüz girilmedi";
        yas=0;
    }
    public Personel(String isim,String soyisim,int yas)
    {
        //Parameterli Constracter -Kalıtım
        this.yas=yas;
        this.soyisim=soyisim;
        this.isim=isim;

    }

    public String getIsim()
    {
        return isim;
    }

    public void setIsim(String isim)
    {
        this.isim = isim;
    }

    public String getSoyisim()
    {
        return soyisim;
    }

    public void setSoyisim(String soyisim)
    {
        this.soyisim = soyisim;
    }

    public int getYas()
    {
        return yas;
    }

    public void setYas(int yas)
    {
        if (yas<0)
        {
            this.yas=0;
        }else
            {
                this.yas = yas;
            }

    }
    public String getKimlikBilgileri()
    {
        return "Kimlik Bilgileri : Ismi : "+ isim + " Soyisim :"+ soyisim+" Yaş : "+ yas;

    }

    @Override
    public String toString()
    {
        return "Kimlik Bilgileri : Ismi : "+ isim + " Soyisim :"+ soyisim+" Yaş : "+ yas  + " ToString ";
    }
}
