package tarea2;
import java.time.*;
import java.util.Date;
import java.util.ArrayList;

abstract class Reunion {
    private Date fecha;
    private Instant horaPrevista;
    private Duration duracionPrevista;
    private Instant horaInicio;
    private Instant horaFin;

    public Reunion(Date dia, Instant hora, Duration duracion){
        this.fecha = dia;
        this.horaPrevista = hora;
        this.duracionPrevista = duracion;
    }

    public ArrayList<Asistencia> obtenerAsistencias(){return null;}
    public ArrayList<Asistencia> obtenerAusencias(){return null;}
    public ArrayList<Retraso> obtenerRetrasos(){return null;}
    public int obtenerTotalAsistencia(){return 0;}
    public int obtenerPorcentajeAsistencia(){return 0;}
    public float calcularTiempoReal(){return 0;}
    public void iniciar(){}
    public void finalizar(){}
    public void producirInforme(){}
}
