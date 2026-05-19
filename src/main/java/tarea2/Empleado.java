package tarea2;

class Empleado extends Invitado implements Invitable {
    private String id;

    public Empleado(String id, String apellidos, String nombre, String correo){
        this.id = id;
        super(apellidos, nombre, correo);
    }

    @Override
    public void invitar(Invitacion invitacion) {System.out.println("Empleado " + super.correo + " invitado.");}

    @Override
    public String toString(){
        return "Empleado: " + super.toString() + ". ID: " + this.id;
    }
}
