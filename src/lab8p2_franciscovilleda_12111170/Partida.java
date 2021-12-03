
package lab8p2_franciscovilleda_12111170;
import java.util.*;
import java.io.Serializable;

public class Partida implements Serializable{
    
    private String nombre;
    private Date fecha;
    private ArrayList<Estrella> estrellas = new ArrayList();
    private ArrayList<Jugador> jugadores = new ArrayList();
    
    private static final long SerialVersionUID = 1170L;

    public Partida(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Partida() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Estrella> getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(ArrayList<Estrella> estrellas) {
        this.estrellas = estrellas;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
}
