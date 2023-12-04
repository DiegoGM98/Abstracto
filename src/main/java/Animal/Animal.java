package Animal;

abstract class Animal {
    protected String nombre;
    protected double peso;
    protected String sexo;

    public Animal(String nombre, double peso, String sexo) {
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
    }

    public abstract void hacerSonido();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

