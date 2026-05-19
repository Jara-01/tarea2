package tarea2;
import java.time.*;

class Nota implements Comparable<Nota> {
    private String contenido;
    private Instant hora;

    public Nota(String texto, Reunion reunion) {
        this.contenido = texto;
        this.hora = Instant.now();
    }

    @Override
    public int compareTo(Nota o) {
        return this.hora.compareTo(o.hora);
    }

    @Override
    public String toString() {
        return "("+ hora +")" + " Nota: " + this.contenido;
    }
}
