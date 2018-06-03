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
public class Alunos extends Pessoa{
    private Cursos curso;

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
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
