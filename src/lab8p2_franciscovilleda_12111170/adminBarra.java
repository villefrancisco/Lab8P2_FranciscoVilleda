
package lab8p2_franciscovilleda_12111170;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class adminBarra extends Thread{
    
    private JProgressBar barra;
    private JTable tabla;
    private JLabel jug, star, total, recor;
    private boolean avanzar;
    private boolean existe;
    private int size;
    private int velocidad;
    private int rows;
    private int fila;

    public adminBarra(JProgressBar barra, JTable tabla, int fila,
            JLabel jug, JLabel star, JLabel total, JLabel recor) {
        this.barra = barra;
        this.tabla = tabla;
        this.avanzar = true;
        this.existe = true;
        this.fila = fila;
        this.jug = jug;
        this.star = star;
        this.total = total;
        this.recor = recor;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
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
                jug.setText(((DefaultTableModel)tabla.getModel()).getValueAt(fila, 0).toString());
                star.setText(((DefaultTableModel)tabla.getModel()).getValueAt(fila, 3).toString());
                velocidad = (int)((DefaultTableModel)tabla.getModel()).getValueAt(fila, 1);
                size = (int)((DefaultTableModel)tabla.getModel()).getValueAt(fila, 3);
                total.setText("" + size);
                barra.setMaximum(size);
                if(avanzar){
                    tabla.setValueAt("Jugando", fila, 4);
                    barra.setValue(barra.getValue()+ velocidad);
                    recor.setText("" + barra.getValue());
                    if(barra.getValue() >= size){
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
