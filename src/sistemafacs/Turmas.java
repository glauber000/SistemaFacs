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
public class Turmas {
    private int id;
    private static int idcount = 0;
    private Disciplinas disciplina;
    private Professores professor;
    private ArrayList<Alunos> aluno = new ArrayList<>();

    public Turmas(){
        id = idcount++;
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
        Turmas.idcount = idcount;
    }

    public Disciplinas getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplinas disciplina) {
        this.disciplina = disciplina;
    }

    public Professores getProfessor() {
        return professor;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }

    public ArrayList<Alunos> getAluno() {
        return aluno;
    }

    public void setAluno(Alunos al) {
        aluno.add(al);
    }
    
    
}
