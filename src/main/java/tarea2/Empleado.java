package tarea2;

/** Clase invitable que hereda de invitado y además tiene un ID de trabajador */
class Empleado extends Invitado implements Invitable {
    private String id;

    /**
     * Constructor que usa el constructor de invitado, además de requerir un ID
     *
     * @param id Identificador de trabajador. Solo empleados tienen uno.
     * @param apellidos Apellidos del empleado.
     * @param nombres Nombres del empleado.
     * @param correo Dirección de correo electrónico del empleado.
     */
    public Empleado(String id, String apellidos, String nombres, String correo){
        this.id = id;
        super(apellidos, nombres, correo);
    }

    /**
     * "Invitar" al empleado.
     * Como no se tiene una función especificada para la invitación de un empleado, se imprime una línea representando
     * el envío de un correo electrónico.
     * @param invitacion Invitación correspondiente a una Reunión específica
     */
    @Override
    public void invitar(Invitacion invitacion) {System.out.println("Empleado " + super.correo + " invitado.");}

    /**
     * toString personalizado
     * @return Datos de invitado y el ID del empleado.
     */
    @Override
    public String toString(){
        return "Empleado: " + super.toString() + ". ID: " + this.id;
    }
}
