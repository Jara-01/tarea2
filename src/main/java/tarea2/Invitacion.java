package tarea2;
import java.time.Instant;

/** Invitación a una reunión con su respectiva hora de inicio prevista */
class Invitacion {
    private Instant hora;

    /**
     * Una invitación solo puede crearse si existe una Reunión a la que invitar.
     * Esta clase sólo almacena la hora prevista en la que la reunion esta planeada iniciar.
     * @param reunion Reunión a la que se quiere invitar
     */
    public Invitacion(Reunion reunion) {
        this.hora = reunion.getHoraPrevista();
    }

    /**
     * toString personalizado
     * @return Hora de inicio prevista para la reunión a la que se esta invitando.
     */
    @Override
    public String toString(){
        return "Invitación para reunión a las " + this.hora;
    }
}
