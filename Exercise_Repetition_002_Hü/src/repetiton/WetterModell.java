/*
#ProProgrammer
*/
package repetiton;

import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class WetterModell extends AbstractListModel{
    private ArrayList<WetterWert> werte = new ArrayList();
    
    @Override
    public int getSize() {
        return werte.size();
    }

    @Override
    public Object getElementAt(int i) {
        return werte.get(i);
    }

    public void add(WetterWert w){
        werte.add(w);
        fireIntervalAdded(this, werte.size()-1, werte.size()-1);
    }
    
}
