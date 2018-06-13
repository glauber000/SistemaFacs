/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafacs;

/**
 *
 * @author glaub
 */
public class Cursos {
    private int id;
    private String nome;
    private Escolas escola;
    private static int idcount = 0;
    
    
    public Cursos(String nome,Escolas escola){
        this.nome = nome;
        this.escola = escola;
        this.id = idcount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escolas getEscola() {
        return escola;
    }

    public void setEscola(Escolas escola) {
        this.escola = escola;
    }

    public static int getIdcount() {
        return idcount;
    }

    public static void setIdcount(int idcount) {
        Cursos.idcount = idcount;
    }
    
}
