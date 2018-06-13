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
public class Escolas {
    private String nome;
    private int id;
    private static int idcount = 0;
    
    public Escolas(String nome){
        this.nome = nome;
        this.id = idcount++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getId(){
        return id;
    }
    
}
