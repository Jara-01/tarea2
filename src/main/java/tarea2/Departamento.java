package tarea2;
import java.util.ArrayList;

/** Clase invitable, identificado por un nombre, que almacena una lista de empleados. */
class Departamento implements Invitable {
    private String nombre;
    private ArrayList<Empleado> empleados;

    /**
     * Constructor inicializa el nombre del Departamento y crea una lista de empleados vacía.
     * @param nombre Nombre del departamento.
     */
    public Departamento(String nombre){
        this.nombre = nombre;
        empleados = new ArrayList<Empleado>();
    }

    /**
     * Getter del tamaño de la lista de empleados.
     * @return Cantidad de elementos en la lista de empleados.
     */
    public int obtenerCantidadEmpleados(){return empleados.size();}
    /**
     * Añadir un nuevo empleado a la lista del departamento.
     * @param empleado Empleado a añadir.
     */
    public void agregarEmpleado(Empleado empleado){this.empleados.add(empleado);}
    /**
     * Eleminar un elemento específico de la lista de empleados.
     * @param i Posición del empleado a eliminar de la lista.
     */
    public void eliminarEmpleado(int i){this.empleados.remove(i);}

    /**
     * Invitar a un departamento implica invitar a todos los empleados que pertenecen a éste.
     * El método recorre todos los empleados de la lista e "invita" a cada uno.
     * @param invitacion Invitación correspondiente a una Reunión específica
     */
    @Override
    public void invitar(Invitacion invitacion) {
        for (int i = 0; i < empleados.size(); i++){
            empleados.get(i).invitar(invitacion);
        }
    }

    /** toString personalizado que entrega el nombre y la cantidad de empleados del departamento como string. */
    @Override
    public String toString(){
        return "Departamento " + this.nombre + ": " + empleados.size() + " empleados.";
    }
}
