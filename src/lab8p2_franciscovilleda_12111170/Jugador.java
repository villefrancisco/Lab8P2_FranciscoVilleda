
package lab8p2_franciscovilleda_12111170;
import java.io.Serializable;

public class Jugador implements Serializable{
    
    private String nombre;
    private int velocidad;
    private static final long SerialVersionUID = 1172L;
    
    public Jugador() {
    }

    public Jugador(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
