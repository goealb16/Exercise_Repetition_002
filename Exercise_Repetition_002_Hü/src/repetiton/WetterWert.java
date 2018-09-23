
package repetiton;

import java.text.SimpleDateFormat;
import java.util.Date;


public class WetterWert {
    private int temperatur;
    private int luftfeuchtigkeit;
    private Date zeitpunkt = new Date();

    public WetterWert(int temperatur, int luftfeuchtigkeit,long mil) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.zeitpunkt.setTime(mil);
    }

    @Override
    public String toString() {
        return String.format("%s - %d° - %d%s",new SimpleDateFormat("dd.MM - HH.mm.ss").format(zeitpunkt),temperatur,luftfeuchtigkeit,"%");
    }

    public int getTemperatur() {
        return temperatur;
    }

    public int getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public Date getZeitpunkt() {
        return zeitpunkt;
    }
    
}
