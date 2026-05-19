package tarea2;
import java.time.Instant;

class Retraso extends Asistencia {
    private Instant hora;

    public Retraso(Instant horaRetraso) {
        this.hora = horaRetraso;
    }

    @Override
    public String toString(){
        return "Asistencia con retraso a las " + this.hora;
    }
}
