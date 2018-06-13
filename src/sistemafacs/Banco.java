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
    public static void setTurmas(ArrayList<Turmas> turmas) {
        Banco.turmas = turmas;
    }
    public Turmas getTurmas(int idd){
        for(int i = 0;i<turmas.size();i++){
            if(idd == turmas.get(i).getId()){
                return turmas.get(i);
            }
        }
        return null;
    }
    public static void deletTur(Turmas ts){
        turmas.remove(ts);
    }
    
    
    public static ArrayList<Alunos> getAlunos() {
        return alunos;
    }

    public static void setAlunos(Alunos al) {
        alunos.add(al);
    }
    public static void setAlunos(ArrayList<Alunos> alunos) {
        Banco.alunos = alunos;
    }
    public Alunos getAlunos(int mat){
        for(int i = 0;i<alunos.size();i++){
            if(mat == alunos.get(i).getMat()){
                return alunos.get(i);
            }
        }
        return null;
    }
    public static void deletAlu(Alunos al){
        alunos.remove(al);
    }
    
    public static ArrayList<Professores> getProfessores() {
        return professores;
    }

    public static void setProfessores(Professores ps) {
        professores.add(ps);
    }
    public static void setProfessores(ArrayList<Professores> professores) {
        Banco.professores = professores;
    }
    
    public Professores getProfessores(int mat){
        for(int i = 0;i<professores.size();i++){
            if(mat == professores.get(i).getMat()){
                return professores.get(i);
            }
        }
        return null;
    }
    public static void deletPro(Professores ps){
        professores.remove(ps);
    }

    public static ArrayList<Administrativo> getAdministrativo() {
        return administrativo;
    }
    public Administrativo getAdministrativo(int mat){
        for(int i = 0;i<administrativo.size();i++){
            if(mat == administrativo.get(i).getMat()){
                return administrativo.get(i);
            }
        }
        return null;
    }
    public static void deletAdm(Administrativo ad){
        administrativo.remove(ad);
    }
    public static void setAdministrativo(Administrativo ad) {
        administrativo.add(ad);
    }
    public static void setAdministrativo(ArrayList<Administrativo> administrativo) {
        Banco.administrativo = administrativo;
    }
    
    
    public static ArrayList<Setor> getSetor() {
        return setor;
    }
    public Setor getSetor(int idd){
        for(int i = 0;i<setor.size();i++){
            if(idd == setor.get(i).getId()){
                return setor.get(i);
            }
        }
        return null;
    }
    public static void deletSet(Setor st){
        setor.remove(st);
    }
    public static void setSetor(Setor st) {
        setor.add(st);
    }
    public static void setSetor(ArrayList<Setor> setor) {
        Banco.setor = setor;
    }
    
    
    public static ArrayList<Disciplinas> getDisciplinas() {
        return disciplinas;
    }
    public Disciplinas getDisciplinas(int idd){
        for(int i = 0;i<disciplinas.size();i++){
            if(idd == disciplinas.get(i).getId()){
                return disciplinas.get(i);
            }
        }
        return null;
    }
    public static void deletDis(Disciplinas ds){
        disciplinas.remove(ds);
    }

    public static void setDisciplinas(Disciplinas ds) {
        disciplinas.add(ds);
    }
    public static void setDisciplinas(ArrayList<Disciplinas> disciplinas) {
        Banco.disciplinas = disciplinas;
    }
    
    
    public static ArrayList<Cursos> getCursos() {
        return cursos;
    }

    public static void setCursos(Cursos cs) {
        cursos.add(cs);
    }
    public static void setCursos(ArrayList<Cursos> cursos) {
        Banco.cursos = cursos;
    }
    public Cursos getCursos(int idd){
        for(int i = 0;i<cursos.size();i++){
            if(idd == cursos.get(i).getId()){
                return cursos.get(i);
            }
        }
        return null;
    }
    public static void deletCur(Cursos cs){
        cursos.remove(cs);
    }
    
    public static ArrayList<Escolas> getEscolas() {
        return escolas;
    }

    public static void setEscolas(Escolas es) {
        escolas.add(es);
    }
    public static void setEscolas(ArrayList<Escolas> escolas) {
        Banco.escolas = escolas;
    }
    public Escolas getEscolas(int idd){
        for(int i = 0;i<escolas.size();i++){
            if(idd == escolas.get(i).getId()){
                return escolas.get(i);
            }
        }
        return null;
    }
    public static void deletEsc(Escolas es){
        escolas.remove(es);
    }

   
}
