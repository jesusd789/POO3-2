class Profesor extends Persona {
    private final String materia;
    public Profesor(String nombre, String materia) { super(nombre); this.materia = materia; }
    @Override
    public void presentarse() {
        System.out.println("Buen día, soy el profesor " + nombre + " y dicto " + materia + ".");
    }
}
