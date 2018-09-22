
package repetiton;

import java.text.SimpleDateFormat;
import java.util.Date;


public class WetterWert {
    private int temperatur;
    private int luftfeuchtigkeit;
    private Date zeitpunkt;

    public WetterWert(int temperatur, int luftfeuchtigkeit) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.zeitpunkt = new Date();
    }

    @Override
    public String toString() {
        return String.format("%s - %d° - %d%s",new SimpleDateFormat("dd.MM - hh.mm.ss").format(zeitpunkt),temperatur,luftfeuchtigkeit,"%");
    }
    
    
    
}
