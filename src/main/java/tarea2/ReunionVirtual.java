package tarea2;
import java.util.Date;
import java.time.*;

/** Clase para reuniones del tipo virtual */
class ReunionVirtual extends Reunion {
    private String enlace;

    /** El constructor requiere todos los requisitos de una reunión, además de la habitación en la que se realizará
     * @param dia Día de la reunión
     * @param hora Hora de inicio prevista para la reunión
     * @param duracion Duración prevista de la reunión
     * @param link String con el enlace en la que la reunión se va a llevar a cabo
     */
    public ReunionVirtual(Date dia, Instant hora, Duration duracion, String link){
        super(dia, hora, duracion);
        this.enlace = link;
    }

    /** toString personalizado
     * @return Todos los datos conocidos de la reunión, además del enlace correspondiente
     */
    @Override
    public String toString(){
        return super.toString() + ". Enlace de la reunión: " + this.enlace;
    }
}
