package JavaUebung6;

import java.awt.*;

/**
 * Created by reisma on 29.09.16.
 */

public class Dreieck extends GeoObject{

    private int anzahlEcken;

    public Dreieck(Color c, String b,int anzahlEcken){
        super(c,b);
        this.setAnzahlEcken(anzahlEcken);
    }

    public int getAnzahlEcken() {
        return anzahlEcken;
    }

    public void setAnzahlEcken(int anzahlEcken) {
        this.anzahlEcken = anzahlEcken;
    }

    @Override
    double getUmfang() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + getAnzahlEcken();

    }
}
