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
public class Administrativo extends Funcionario{
    private Setor setor;

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
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
