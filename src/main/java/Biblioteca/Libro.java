package Biblioteca;

class Libro {
    private String titulo;
    private String autor;
    private Especialidad especialidad;

    public Libro(String titulo, String autor, Especialidad especialidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}


