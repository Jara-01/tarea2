package tarea2;
import java.time.Instant;

/** Clase que se crea al llegar un invitado con cierto retraso de la hora de inicio */
class Retraso extends Asistencia {
    private Instant hora;

    /** El constructor recibe y almacena la hora en que llega el invitado
     * @param horaRetraso Hora de llegada del invitado
     */
    public Retraso(Instant horaRetraso) {
        this.hora = horaRetraso;
    }

    /** toString personalizado
     * @return Hora de llegada del invitado
     */
    @Override
    public String toString(){
        return "Asistencia con retraso a las " + this.hora;
    }
}
