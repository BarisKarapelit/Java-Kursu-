package com.baris;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args)
    {
	 Personel personel = new Personel();
	 personel.setIsim("Barış");
	 personel.setSoyisim("Karapelit");
	 personel.setYas(24);

	 Personel personel1=new Personel("Ömürcan","Karapelit",17);
        System.out.println(personel1.getKimlikBilgileri());
		System.out.println(personel.toString());

	Ogrenci ogrenci1=new Ogrenci("Ömürcan","Karapelit",17,123123434);
		System.out.println(ogrenci1.getKimlikBilgileri());
		System.out.println(ogrenci1.toString());

    }
}
