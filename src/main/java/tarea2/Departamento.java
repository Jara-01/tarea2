package tarea2;
import java.util.ArrayList;

class Departamento implements Invitable {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre){
        this.nombre = nombre;
        empleados = new ArrayList<Empleado>();
    }

    public int obtenerCantidadEmpleados(){return empleados.size();}
    public void agregarEmpleado(Empleado empleado){this.empleados.add(empleado);}
    public void eliminarEmpleado(int i){this.empleados.remove(i);}

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
