class Animal {
    public void hacerSonido() { System.out.println("El animal hace un sonido."); }
}

class Perro extends Animal {
    public void correr() { System.out.println("El perro está corriendo."); }
}

public class Error1_MetodoNoExisteEnBase {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.correr(); // ERROR DE COMPILACIÓN: correr() no existe en Animal
    }
}
