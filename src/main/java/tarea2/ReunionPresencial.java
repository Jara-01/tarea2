package tarea2;
import java.util.Date;
import java.time.*;

/** Clase para reuniones del tipo presencial */
class ReunionPresencial extends Reunion {
    private String sala;

    /** El constructor requiere todos los requisitos de una reunión, además de la habitación en la que se realizará
     * @param dia Día de la reunión
     * @param hora Hora de inicio prevista para la reunión
     * @param duracion Duración prevista de la reunión
     * @param room String con la sala en la que la reunión se va a llevar a cabo
     */
    public ReunionPresencial(Date dia, Instant hora, Duration duracion, String room){
        super(dia, hora, duracion);
        this.sala = room;
    }

    /** toString personalizado
     * @return Todos los datos conocidos de la reunión, además de la sala correspondiente
     */
    @Override
    public String toString(){
        return super.toString() + ". Sala de reunión: " + this.sala;
    }
}
