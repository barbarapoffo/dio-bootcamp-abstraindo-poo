package model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Bootcamp {
    private String nome;
    private List<Curso> cursos = new ArrayList<>();
    private List<Mentoria> mentorias = new ArrayList<>();
    private List<Dev> devs = new ArrayList<>();

    public Bootcamp(String nome) {
        this.nome = nome;
    }

    public void adicionarCurso(String titulo, int cargaHoraria) {
        cursos.add(new Curso(titulo, cargaHoraria));
    }

    public void adicionarMentoria(String titulo, LocalDate data) {
        mentorias.add(new Mentoria(titulo, data));
    }

    public void inscreverDev(String nome) {
        devs.add(new Dev(nome, this));
    }

    public String getNome() {
        return nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public List<Dev> getDevs() {
        return devs;
    }
}