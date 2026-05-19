package tarea2;
import java.time.*;
import java.util.Date;
import java.util.ArrayList;
/**
 * Tarea 2 de Desarrollo Orientado a Objetos, 2026-1
 * @author Benjamín Antonio Rivas Sepulveda
 * @author Ignacio Moisés Lama Méndez
 * @author Joaquín Enrique Jara Troncoso
 */
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

    @Override
    public String toString(){
        return "Reunión planeada para las " + this.horaPrevista + " horas, el día " + this.fecha + " duración prevista de " + this.duracionPrevista
                + "\n Hora de inicio: " + this.horaInicio + ". Hora de finalización: " + this.horaFin;
    }

    public Instant getHoraPrevista(){return this.horaPrevista;}
}
