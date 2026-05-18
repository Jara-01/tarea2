package tarea2;
import java.util.Date;
import java.time.*;

class ReunionPresencial extends Reunion {
    private String sala;

    public ReunionPresencial(Date dia, Instant hora, Duration duracion, String room){
        super(dia, hora, duracion);
        this.sala = room;
    }
}
