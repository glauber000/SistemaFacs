/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafacs;

import java.util.ArrayList;

/**
 *
 * @author glaub
 */
public class Disciplinas {
    private int id;
    private static int idcount = 0;
    private String nome;
    private ArrayList<Cursos> curso = new ArrayList<>();
    
    public Disciplinas(String nome){
        this.nome = nome;
        this.id = idcount++;
    }
    public Disciplinas(){
        this.id = idcount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdcount() {
        return idcount;
    }

    public static void setIdcount(int idcount) {
        Disciplinas.idcount = idcount;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Cursos> getCurso() {
        return curso;
    }

    public void setCurso(Cursos cs) {
        curso.add(cs);
    }

    public void setCurso(ArrayList<Cursos> curso) {
        this.curso = curso;
    }
    
    
}
