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
     public String getNome(){
        return super.getNome();
    }
    public void setNome(String nome){
        super.setNome(nome);
    }
    public int getMat(){
        return super.getMat();
    }
    public void setMat(int mat){
        super.setMat(mat);
    }
    public String getEnd(){
        return super.getEnd();
    }
    public void setEnd(String end){
        super.setEnd(end);
    }
    public float getTel(){
        return super.getTel();
    }
    public void setTel(float tel){
        super.setTel(tel);
    }
    public String getData_adm(){
        return super.getData_adm();
    }
    public void setData_adm(String data){
        super.setData_adm(data);
    }
    public double getSalario(){
        return super.getSalario();
    }
    public void setSalario(double salario){
        super.setSalario(salario);
    }
    
}
