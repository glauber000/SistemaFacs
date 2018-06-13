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
public class Professores extends Funcionario{
    private ArrayList<Escolas> escolas = new ArrayList<>();
    
    
    public ArrayList<Escolas> getEscolas() {
        return escolas;
    }

    public void setEscolas(Escolas es) {
        escolas.add(es);
    }

    public void setEscolas(ArrayList<Escolas> escolas) {
        this.escolas = escolas;
    }
    

    
}
