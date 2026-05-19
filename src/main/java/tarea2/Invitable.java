package tarea2;

/** Interfaz para todas las clases que pueden ser invitadas (individuo empleado y externo, o un departamento de empleados) */
public interface Invitable {
    /**
     * Método de invitar para todas las clases en que sea posible invitarlas
     * @param invitacion Invitar a una clase necesita una invitación con una hora y reunión específicas.
     */
    public void invitar(Invitacion invitacion);
}
