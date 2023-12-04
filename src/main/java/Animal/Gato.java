package Animal;

class Gato extends Animal {
    public Gato(String nombre, double peso, String sexo) {
        super(nombre, peso, sexo);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau Miau!");
    }
}
