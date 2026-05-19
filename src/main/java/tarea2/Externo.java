package tarea2;

class Externo extends Invitado implements Invitable {
    public Externo(String apellidos, String nombre, String correo){
        super(apellidos, nombre, correo);
    }

    @Override
    public void invitar(Invitacion invitacion) {System.out.println("No-empleado " + this.correo + " invitado.");}

    @Override
    public String toString(){
        return "No-empleado: " + super.toString();
    }
}
