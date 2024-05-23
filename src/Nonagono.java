public class Nonagono extends Figurasgeometricas{
    Double lado;
    Double apotema;

    public Nonagono() {
        super("Nonagono", 9);
    }

    public Nonagono(Double lado, Double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public Nonagono(String nombre, int lados) {
        super(nombre, lados);
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getApotema() {
        return apotema;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }

    public double calcularArea() {
        return (9 * apotema * lado)/2;
    }

    public double calcularPerimetro() {
        return 9 * lado;
    }
}
