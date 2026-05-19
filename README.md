# Tarea2 - Desarrollo Orientado a Objetos 2026-1
Benjamín Antonio Rivas Sepúlveda<br/>
Ignacio Moises Lama Méndez <br/>
Joaquín Enrique Jara Troncoso<br/>

### Cambios en UML
A la clase "Reunion" se le añadió el método "producirInforme", ya que el informe debe contener información que ya esta en Reunión, el método tan solo compilaría los datos y los escribirá en un archivo de texto. Además se agregó la clase InvitadoExterno que funciona similar a Empleado pero no esta asociado a ningún departamento.<br/>
La clase "Departamento" se le agregó una lista para almacenar los empleados que pertenecen a él, además de 2 métodos para agregar y eliminar elementos de esta lista.<br/>
Tanto como los empleados como los invitados externos pertenecen a una clase abstracta "Invitado" ya que deben compartir la mayoría de atributos y relaciones.