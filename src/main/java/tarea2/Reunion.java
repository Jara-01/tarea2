package tarea2;

import java.time.*;
import java.util.Date;

import java.util.Collections;
import java.util.ArrayList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

abstract class Reunion {
    private Date fecha;
    private Instant horaPrevista;
    private Duration duracionPrevista;

    private Instant horaInicio;
    private Instant horaFin;
    private Duration duracion;


    private ArrayList<Invitable> invitados;
    private ArrayList<Asistencia> asistencias;
    private ArrayList<Nota> notas;

    public Reunion(Date dia, Instant hora, Duration duracion){
        this.fecha = dia;
        this.horaPrevista = hora;
        this.duracionPrevista = duracion;

        asistencias = new ArrayList<>();
        invitados = new ArrayList<>();
        notas = new ArrayList<>();
    }

    public void addInvitado(Invitable invitado){
        invitados.add(invitado);
    }

    public void addAsistencia(Asistencia asistencia){
        asistencias.add(asistencia);
    }
    public ArrayList<Asistencia> obtenerAsistencias(){
        return asistencias;}

    /*public ArrayList<Invitable> obtenerAusencias(){

        ArrayList<Invitable> ausencias = new ArrayList<>();

        for(Invitable auxInvitado : invitados){

            boolean presente = false;

            for(Asistencia auxAsistencia : asistencias){
                //falta como comparar
            }
            if(!presente){
                ausencias.add(auxInvitado);
            }
        }
        return ausencias;
    }*/

    public ArrayList<Retraso> obtenerRetrasos(){
        ArrayList<Retraso> retrasos = new ArrayList<>();

        for(Asistencia auxRetraso : asistencias){
            if(auxRetraso instanceof Retraso retraso){
                retrasos.add(retraso);
            }
        }
        return retrasos;}

    public int obtenerTotalAsistencia(){
        return asistencias.size();}

    public float obtenerPorcentajeAsistencia(){
        if(invitados.size() == 0){
            return 0;
        }

        return ((float)asistencias.size() / invitados.size()) * 100;}

    public float calcularTiempoReal(){
        if(horaInicio == null || horaFin == null){
            return 0;
        }

        duracion = Duration.between(horaInicio,horaFin);
        return (float)duracion.toMinutes();}

    public void iniciar(){
        horaInicio = Instant.now();
    }

    public void finalizar(){
        horaFin = Instant.now();
    }
    public Instant getHoraPrevista(){
        return this.horaPrevista;}

    public void addNota(Nota nota){
        notas.add(nota);
    }
    public ArrayList<Nota> obtenerNotas(){
        Collections.sort(notas);
        return notas;
    }

    public void producirInforme(String nombre){

        try {
            BufferedWriter informe = new BufferedWriter(new FileWriter(nombre));

            informe.write("INFORME\n");
            informe.write(this + "\n");

            informe.write("PARTICIPANTES:\n");
            for(Asistencia aux : asistencias){
                informe.write("-" + aux + "\n");
            }

            informe.write("RETRASOS:\n");
            for(Retraso aux : obtenerRetrasos()){
                informe.write("-" + aux + "\n");
            }

            /*informe.write("AUSENTES:\n");
            for(Invitable aux : obtenerAusencias()){
                informe.write("-" + aux + "\n");
            }*/

            informe.write("NOTAS:\n");
            for(Nota aux : obtenerNotas()){
                informe.write("-" + aux + "\n");
            }

            informe.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public String toString(){
        return "Reunión planeada para las " + this.horaPrevista
                + " horas, el día " + this.fecha
                + " duración prevista de " + this.duracionPrevista
                + "\n Hora de inicio: " + this.horaInicio
                + ". Hora de finalización: " + this.horaFin;
    }

}
