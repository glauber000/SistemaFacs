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
public class Funcionario extends Pessoa{
    private String data_adm;
    private double salario;
    
    
    public String getData_adm() {
        return data_adm;
    }

    public void setData_adm(String data_adm) {
        this.data_adm = data_adm;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
    
    
}
