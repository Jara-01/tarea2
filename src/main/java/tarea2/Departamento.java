package tarea2;

class Departamento implements Invitable {
    private String nombre;

    public Departamento(String nombre){
        this.nombre = nombre;
    }

    public int obtenerCantidadEmpleados(){return 0;}

    @Override
    public void invitar() {}

    @Override
    public String toString(){
        return "Departamento " + this.nombre + ": " + this.obtenerCantidadEmpleados() + " empleados.";
    }
}
