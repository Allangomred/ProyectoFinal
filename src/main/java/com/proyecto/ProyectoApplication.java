package com.proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProyectoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProyectoApplication.class, args);
    }
    @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    public void run(String... args) throws Exception {
        Usuario usario1 = New Usuario("Alexander", "Soto", "alexsotov97@gmail.com");
        repositorio.save(usuario1);

        Usuario usario2 = New Usuario("Allan", "Gomez", "allangomez1914@gmail.com");
        repositorio.save(usuario2);
    }

}
