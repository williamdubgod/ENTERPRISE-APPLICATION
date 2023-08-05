package br.com.fiap;

import br.com.fiap.domain.entity.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("maria-db");

        EntityManager manager = factory.createEntityManager();

//        Aluno william = new Aluno();
//        william.setNome("William Vulcano").setRm("RM 96939");
//
//        Aluno sergio = new Aluno();
//        william.setNome("Sergio Vulcano").setRm("RM 140857");
//
//        manager.getTransaction().begin();
//
//        manager.persist(william);
//        manager.persist(sergio);
//
//        manager.getTransaction().commit();

        Long id = Long.valueOf(JOptionPane.showInputDialog("Informe o ID do aluno: "));
        var encontrei = manager.find(Aluno.class, id);


        manager.close();
        factory.close();

        System.out.println(encontrei);
    }
}