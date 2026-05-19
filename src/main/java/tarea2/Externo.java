package tarea2;

/** Clase invitable que hereda de invitado */
class Externo extends Invitado implements Invitable {
    /**
     * Constructor que usa el constructor de invitado
     *
     * @param apellidos Apellidos del individuo.
     * @param nombres Nombres del individuo.
     * @param correo Dirección de correo electrónico del individuo.
     */
    public Externo(String apellidos, String nombres, String correo){
        super(apellidos, nombres, correo);
    }

    /**
     * "Invitar" al individuo externo.
     * Como no se tiene una función especificada para la invitación de un sujeto, se imprime una línea representando
     * el envío de un correo electrónico.
     * @param invitacion Invitación correspondiente a una Reunión específica
     */
    @Override
    public void invitar(Invitacion invitacion) {System.out.println("No-empleado " + this.correo + " invitado.");}

    /**
     * toString personalizado
     * @return Datos de invitado.
     */
    @Override
    public String toString(){
        return "No-empleado: " + super.toString();
    }
}
