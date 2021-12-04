
package lab8p2_franciscovilleda_12111170;
import java.io.Serializable;

public class Estrella implements Serializable{
    
    private String nombre, descripcion;
    private int distancia;

    private static final long SerialVersionUID = 1171L;
    
    public Estrella() {
    }

    public Estrella(String nombre, String descripcion, int distancia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
