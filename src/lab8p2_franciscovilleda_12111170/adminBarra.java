
package lab8p2_franciscovilleda_12111170;

import javax.swing.JProgressBar;

public class adminBarra extends Thread{
    
    private JProgressBar barra;
    private boolean avanzar;
    private boolean existe;
    private int size;
    private int velocidad;

    public adminBarra(JProgressBar barra, int size, int velocidad) {
        this.barra = barra;
        this.avanzar = true;
        this.existe = true;
        this.size = size;
        this.velocidad = velocidad;
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
            if(avanzar){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==100000000){
                    existe=false;
                }                
            } 
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }
}
