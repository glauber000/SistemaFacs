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
    protected String data_adm;
    protected double salario;
    
    
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
    
}
