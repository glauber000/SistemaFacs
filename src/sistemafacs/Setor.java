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
public class Setor {
    private int id;
    private static int idcount = 0;
    private String nome;

    public Setor(){
        this.id = idcount++;
    }
    public Setor(String nome){
        this.nome = nome;
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
        Setor.idcount = idcount;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
