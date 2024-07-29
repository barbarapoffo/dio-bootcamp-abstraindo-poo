package main;

import model.Bootcamp;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    	Bootcamp bootcamp = new Bootcamp("Bootcamp Java Santander Dio");

        bootcamp.adicionarCurso("Curso de Java", 40);
        bootcamp.adicionarMentoria("Mentoria de Java", LocalDate.of(2024, 8, 1));
        bootcamp.inscreverDev("Barbara");

        System.out.println(bootcamp.getCursos().get(0).informacoes());
        System.out.println(bootcamp.getMentorias().get(0).informacoes());
        System.out.println(bootcamp.getDevs().get(0).informacoes());
    }
}