/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.PrognozaRegion;
import domen.Region;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Stefan
 */
public class ModelTabeleKlijent extends AbstractTableModel{

    ArrayList<PrognozaRegion> lista;
    String kolone[]={"Temperatura","Region", "Meteo alarm", "Pojava"};

    public ModelTabeleKlijent() {
        lista=new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PrognozaRegion pr=lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return pr.getTemperatura();
            case 1:
                return pr.getRegion();
            case 2:
                return pr.getMeteoAlarm();
            case 3:
                return pr.getPojava();
            default:
                return "default!";
        }
    }
    
    public ArrayList<PrognozaRegion> getLista() {
        return lista;
    }

    public void dodajPrognozuRegion(PrognozaRegion pr) {
        lista.add(pr);
        fireTableDataChanged();
    }

    public boolean postojiRegion(Region region) {
        for(PrognozaRegion pr : lista){
            if(pr.getRegion().getNaziv().equals(region.getNaziv())){
                return true;
            }
        }
        return false;
    }

    public void obrisiPrognozu(int row) {
        lista.remove(row);
        fireTableDataChanged();
    }
    
}
