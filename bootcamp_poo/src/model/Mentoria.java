package model;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private LocalDate data;

    public Mentoria(String titulo, LocalDate data) {
        this.titulo = titulo;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getData() {
        return data;
    }

    public String informacoes() {
        return "Mentoria: " + titulo + ", Data: " + data;
    }
}