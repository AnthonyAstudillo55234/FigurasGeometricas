//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Figurasgeometricas miFiguras = new Figurasgeometricas();
        Circulos miFigura1 = new Circulos();
        Triangulos miFigura2 = new Triangulos();
        Cuadrilateros miFigura3 = new Cuadrilateros();

        Triangulos miFigura5 = new Triangulos(6.00, 8.00);
        Cuadrilateros miFigura6 = new Cuadrilateros(5.00, 5.00);
        Cuadrilateros miFigura7 = new Cuadrilateros(5.00, 10.00);
        Circulos miFigura8 = new Circulos(3.00);

        miFigura1.setNombre("Pileta del cec");
        System.out.println(miFigura1.getNombre());

        System.out.println("La nueva pileta tendra un radio de: ");
        miFigura1.setRadio(4.00);
        System.out.println(miFigura1.getRadio());

        System.out.println("Y su area sera: ");
        System.out.println(miFigura1.calcularArea() + "\n");

        miFigura1.setNombre("Casona esfot");
        System.out.println(miFigura1.getNombre());

        System.out.println("La nueva Casona tendra una base de: ");
        miFigura2.setBase(5.00);
        System.out.println(miFigura2.getBase());
        System.out.println("La nueva Casona tendra una altura de: ");
        miFigura2.setAltura(10.00);
        System.out.println(miFigura2.getAltura());
        System.out.println("Y su area sera: ");
        System.out.println(miFigura2.calcularArea() + "\n");

        miFigura1.setNombre("Estacionamiento cec");
        System.out.println(miFigura1.getNombre());

        System.out.println("El nuevo estacionamiento tendra un largo de: ");
        miFigura3.setLargo(6.00);
        System.out.println(miFigura3.getLargo());
        System.out.println("El nuevo estacionamiento tendra un ancho de: ");
        miFigura3.setAncho(7.00);
        System.out.println(miFigura3.getAncho());
        System.out.println("Y su area sera: ");
        System.out.println(miFigura3.calcularArea());

        miFigura1.setNombre("Redondel floresta");
        System.out.println(miFigura1.getNombre());
        System.out.println("El nuevo estacionamiento tendra un ancho de: ");
        miFigura8.setRadio(8.00);
        System.out.println(miFigura8.getRadio());

        //ESTE ES EL PRIMER CAMBIO
    }
}