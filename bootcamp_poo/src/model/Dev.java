package model;

public class Dev {
    private String nome;
    private Bootcamp inscritoEmBootcamp;

    public Dev(String nome, Bootcamp bootcamp) {
        this.nome = nome;
        this.inscritoEmBootcamp = bootcamp;
    }

    public String getNome() {
        return nome;
    }

    public Bootcamp getInscritoEmBootcamp() {
        return inscritoEmBootcamp;
    }

    public String informacoes() {
        return "Dev: " + nome + ", Inscrito em Bootcamp: " + (inscritoEmBootcamp != null ? inscritoEmBootcamp.getNome() : "Nenhum");
    }
}