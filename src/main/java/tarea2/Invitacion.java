package tarea2;
import java.time.Instant;

class Invitacion {
    private Instant hora;

    public Invitacion(Instant horaReunion) {
        this.hora = horaReunion;
    }

    @Override
    public String toString(){
        return "Invitación para reunión a las " + this.hora;
    }
}
