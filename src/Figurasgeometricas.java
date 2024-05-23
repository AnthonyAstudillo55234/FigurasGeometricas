public class Figurasgeometricas {
    String nombre;
    int lados;

    public Figurasgeometricas() {}

    public Figurasgeometricas(String nombre, int lados) {
        this.nombre = nombre;
        this.lados = lados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
}
