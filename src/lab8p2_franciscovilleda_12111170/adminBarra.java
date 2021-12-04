
package lab8p2_franciscovilleda_12111170;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class adminBarra extends Thread{
    
    private JProgressBar barra;
    private JTable tabla;
    private boolean avanzar;
    private boolean existe;
    private int size;
    private int velocidad;
    private int rows;
    private int fila = 0;

    public adminBarra(JProgressBar barra, JTable tabla) {
        this.barra = barra;
        this.tabla = tabla;
        this.avanzar = true;
        this.existe = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }   
    
    @Override
    public void run(){
        while(existe){
            rows = ((DefaultTableModel)tabla.getModel()).getRowCount();
            if(fila < rows){
                velocidad = (int)((DefaultTableModel)tabla.getModel()).getValueAt(fila, 1);
                size = (int)((DefaultTableModel)tabla.getModel()).getValueAt(fila, 3);
                if(avanzar){
                    tabla.setValueAt("Jugando", fila, 4);
                    barra.setValue(barra.getValue()+20);
                    if(barra.getValue() >= 100){
                        tabla.setValueAt("Completado", fila, 4);
                            fila++;
                            barra.setValue(0);
                    }                
                }
                else{
                    tabla.setValueAt("Pausa", fila, 4);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
            else{
                existe = false;
                JOptionPane.showMessageDialog(null,"Partidas Completadas");
            }
        }
    }
}
