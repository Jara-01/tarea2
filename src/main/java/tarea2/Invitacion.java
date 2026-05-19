package tarea2;
import java.time.Instant;

class Invitacion {
    private Instant hora;

    public Invitacion(Reunion reunion) {
        this.hora = reunion.getHoraPrevista();
    }

    @Override
    public String toString(){
        return "Invitación para reunión a las " + this.hora;
    }
}
