package tarea2;
import java.util.Date;
import java.time.*;

class ReunionVirtual extends Reunion {
    private String enlace;

    public ReunionVirtual(Date dia, Instant hora, Duration duracion, String link){
        super(dia, hora, duracion);
        this.enlace = link;
    }

    @Override
    public String toString(){
        return super.toString() + "Enlace de la reunión: " + this.enlace;
    }
}
