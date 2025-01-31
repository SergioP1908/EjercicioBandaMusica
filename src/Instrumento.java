public class Instrumento {

    private String nombre;

    private String tipo;

    private double afinado;

    public Instrumento(String nombre, String tipo, double afinado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.afinado = afinado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAfinado() {
        return afinado;
    }

    public void setAfinado(double afinado) {
        this.afinado = afinado;
    }

    

    
}
