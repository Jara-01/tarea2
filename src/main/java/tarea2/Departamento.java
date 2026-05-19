package tarea2;
import java.util.ArrayList;

class Departamento implements Invitable {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre, ArrayList<Empleado> empleadosLista){
        this.nombre = nombre;
        this.empleados = empleadosLista;
    }

    public int obtenerCantidadEmpleados(){return empleados.size();}

    @Override
    public void invitar(Invitacion invitacion) {
        for (int i = 0; i < empleados.size(); i++){
            System.out.println("Empleado " + empleados.get(i).getNombre() + " invitado.");
        }
    }

    @Override
    public String toString(){
        return "Departamento " + this.nombre + ": " + empleados.size() + " empleados.";
    }
}
