package JavaUebung5;

import javax.swing.*;

/**
 * Created by reisma on 19.09.16.
 */
public class KreisTest {

    public static void main (String args[]){

        Kreis kreis1 = new Kreis();
        kreis1.setRadius(6);


        Kreis kreis2 = new Kreis();
        kreis2.setFlache(226.1946);


        Kreis kreis3 = new Kreis();
        kreis3.setUmfang(37.699);

        System.out.println(kreis1);
        System.out.println(kreis2);
        System.out.println(kreis3);

        makeKreistabelle();

    }


    static void makeKreistabelle(){

        double radius;
        int erhoehung;

        String radiusTxt
                = JOptionPane.showInputDialog( "Kreis Radius bitte: ");

        String erhoehungTxt
                = JOptionPane.showInputDialog( "Radius erhöhung: ");

        radius = Double.parseDouble(radiusTxt);
        erhoehung = Integer.parseInt(erhoehungTxt);

        System.out.println( "\nStarte Kreistabellenberechnung für Radius " +radius+" bei einer erhöhung von "+ erhoehung + "\n");

        for(int i = 1; i <= 30; i++){

            Kreis schleifenKreis = new Kreis();

            schleifenKreis.setRadius( radius * i );

            System.out.println( i + " " +schleifenKreis );


        }
    }

}
