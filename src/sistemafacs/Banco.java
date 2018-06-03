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
public class Banco {
    private static ArrayList<Escolas> escolas = new ArrayList<>();
    private static ArrayList<Cursos> cursos = new ArrayList<>();
    private static ArrayList<Disciplinas> disciplinas = new ArrayList<>();
    private static ArrayList<Setor> setor = new ArrayList<>();
    private static ArrayList<Administrativo> administrativo = new ArrayList<>();
    private static ArrayList<Professores> professores = new ArrayList<>();
    private static ArrayList<Alunos> alunos = new ArrayList<>();
    private static ArrayList<Turmas> turmas = new ArrayList<>();

    public static ArrayList<Turmas> getTurmas() {
        return turmas;
    }

    public static void setTurmas(Turmas ts) {
        turmas.add(ts);
    }
    
    
    public static ArrayList<Alunos> getAlunos() {
        return alunos;
    }

    public static void setAlunos(Alunos al) {
        alunos.add(al);
    }
    
    
    public static ArrayList<Professores> getProfessores() {
        return professores;
    }

    public static void setProfessores(Professores ps) {
        professores.add(ps);
    }
    
    

    public static ArrayList<Administrativo> getAdministrativo() {
        return administrativo;
    }

    public static void setAdministrativo(Administrativo ad) {
        administrativo.add(ad);
    }
    
    
    public static ArrayList<Setor> getSetor() {
        return setor;
    }

    public static void setSetor(Setor st) {
        setor.add(st);
    }
    
    
    public static ArrayList<Disciplinas> getDisciplinas() {
        return disciplinas;
    }

    public static void setDisciplinas(Disciplinas ds) {
        disciplinas.add(ds);
    }
    
    
    public static ArrayList<Cursos> getCursos() {
        return cursos;
    }

    public static void setCursos(Cursos cs) {
        cursos.add(cs);
    }
    
    
    public static ArrayList<Escolas> getEscolas() {
        return escolas;
    }

    public static void setEscolas(Escolas es) {
        escolas.add(es);
    }

   
}
