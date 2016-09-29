package JavaUebung6;

import java.awt.*;

/**
 * Created by reisma on 29.09.16.
 */
abstract public class GeoObject {

    private Color myColor ;
    private String beschreibung ; // "";

    public GeoObject(Color newColor, String beschreibung){

        this.setMyColor(newColor);
        this.setBeschreibung(beschreibung);

    }

    public GeoObject(){
        setMyColor(new Color(000,200,0));
        setBeschreibung(new String());
    }

    public Color getMyColor() {
        return myColor;
    }

    public void setMyColor(Color myColor) {
        this.myColor = myColor;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }


    abstract double getUmfang();


    @Override
    public String toString() {
        return getBeschreibung()
                +" "+ getMyColor();
    }
}
