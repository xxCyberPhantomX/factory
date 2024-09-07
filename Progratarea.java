    package proyect.progratarea;
    abstract class Celular {
    protected String marca;
    protected String modelo;

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void encender();
    }

    class CelularBasico extends Celular {
    public CelularBasico() {
        super("Marca Genérica", "Modelo Básico");
    }

    @Override
    public void encender() {
        System.out.println("El celular básico está encendido.");
    }
    }

    class CelularGamaMedia extends Celular {
    public CelularGamaMedia() {
        super("Marca Popular", "Modelo Gama Media");
    }

    @Override
    public void encender() {
        System.out.println("El celular de gama media está encendido.");
    }
    }

    class CelularGamaAlta extends Celular {
    public CelularGamaAlta() {
        super("Marca Premium", "Modelo Gama Alta");
    }

    @Override
    public void encender() {
        System.out.println("El celular de gama alta está encendido.");
    }
    }

    abstract class CelularFactory {
    public abstract Celular crearCelular();
    }

    class CelularBasicoFactory extends CelularFactory {
    @Override
    public Celular crearCelular() {
        return new CelularBasico();
    }
    }

     class CelularGamaMediaFactory extends CelularFactory {
    @Override
    public Celular crearCelular() {
        return new CelularGamaMedia();
    }
    }

    class CelularGamaAltaFactory extends CelularFactory {
    @Override
    public Celular crearCelular() {
        return new CelularGamaAlta();
    }
    }

public class Main {
    public static void main(String[] args) {
        CelularFactory basicoFactory = new CelularBasicoFactory();
        Celular celularBasico = basicoFactory.crearCelular();
        celularBasico.encender(); // Salida: El celular básico está encendido.

        CelularFactory gamaMediaFactory = new CelularGamaMediaFactory();
        Celular celularGamaMedia = gamaMediaFactory.crearCelular();
        celularGamaMedia.encender(); // Salida: El celular de gama media está encendido.

        CelularFactory gamaAltaFactory = new CelularGamaAltaFactory();
        Celular celularGamaAlta = gamaAltaFactory.crearCelular();
        celularGamaAlta.encender(); // Salida: El celular de gama alta está encendido.
    }
}
