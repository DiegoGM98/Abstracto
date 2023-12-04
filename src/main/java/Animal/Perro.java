package Animal;

class Perro extends Animal {
    public Perro(String nombre, double peso, String sexo) {
        super(nombre, peso, sexo);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau!");
    }
}

