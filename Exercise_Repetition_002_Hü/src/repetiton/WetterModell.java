/*
#ProProgrammer
 */
package repetiton;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class WetterModell extends AbstractListModel {

    private ArrayList<WetterWert> werte = new ArrayList();

    @Override
    public int getSize() {
        return werte.size();
    }

    @Override
    public Object getElementAt(int i) {
        return werte.get(i);
    }

    public void add(WetterWert w) {
        werte.add(w);
        fireIntervalAdded(this, werte.size() - 1, werte.size() - 1);
    }

    public void speichern() throws IOException {
        JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
        File file = null;
        int result = chooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (WetterWert w : werte) {
                bw.write(w.getZeitpunkt().getTime() + ",");
                bw.write(w.getTemperatur() + ",");
                bw.write(w.getLuftfeuchtigkeit() + "");
                bw.newLine();
            }
        } catch (IOException ex) {
            throw ex;
        }

    }

    public void laden() throws IOException {
        werte.clear();
        JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
        File file = null;
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                werte.add(new WetterWert(Integer.parseInt(parts[1]),Integer.parseInt(parts[2]), Long.parseLong(parts[0])));
            }
            
        }
        catch (IOException ex) {
            throw ex;
        }
        fireContentsChanged(this, 0, werte.size()-1);
    }

}
