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
public class Alterar extends javax.swing.JFrame {

    /**
     * Creates new form Alterar
     */
    public Alterar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        caixa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        caixa2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        caixa3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        caixa4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        caixa5 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        caixa6 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        caixa7 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        caixa8 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Área de Alteração!");

        jLabel2.setText("Escolas:");

        caixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Funcionários:");

        jButton3.setText("Listar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Setor:");

        jButton4.setText("Listar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("OK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setText("Aluno:");

        jButton6.setText("Listar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("OK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel6.setText("Professores:");

        jButton8.setText("Listar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("OK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel7.setText("Entre com o código abaixo e pressiono OK para efetuar a alteração!");

        jLabel8.setText("Turmas:");

        jButton10.setText("Listar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("OK");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel9.setText("Disciplinas:");

        jButton12.setText("Listar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("OK");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel10.setText("Cursos:");

        jButton14.setText("Listar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("OK");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Listar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("OK");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jButton12)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caixa5)
                                    .addComponent(caixa3)
                                    .addComponent(caixa4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(caixa2))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(caixa6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton14)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(caixa7)
                                    .addComponent(caixa8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jButton16)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(caixa, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(caixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixa8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixa7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(caixa6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(caixa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(caixa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(caixa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(caixa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(65, 65, 65)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Banco bs = new Banco();
    Notific n = new Notific();
    private void caixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_caixaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AAdm f = new AAdm();
        int s = Integer.parseInt(caixa2.getText());
        if(bs.getAdministrativo(s)!= null){
            Administrativo d = bs.getAdministrativo(s);
            f.setG(s);
            f.setCx1(d.getNome());
            f.setCx2(Integer.toString(d.getMat()));
            f.setCx3(d.getEnd());
            f.setCx4(d.getTel());
            f.setCx5(d.getData_adm());
            f.setCx6(Double.toString(d.getSalario()));
            f.setCx7(d.getSetor().getNome());
            f.setVisible(true);
            dispose();
        } else{
            n.setTxt("Codigo invalido!");
            n.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    ArrayList<Administrativo> ad = bs.getAdministrativo();
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ListaEs frame = new ListaEs();
        String text = ad.get(0).getNome()+ " Matricula:" + ad.get(0).getMat()+"\n";
        for(int i = 1;i<ad.size();i++){
            text += "\n" + ad.get(i).getNome() + " Matricula:" + ad.get(i).getMat();
        }
        frame.setLbl("Lista de Funcionários!");
        frame.modificar(text);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Inicio frame = new Inicio();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    ArrayList<Setor> st = bs.getSetor();
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ListaEs frame = new ListaEs();
        String text = st.get(0).getNome()+ " Código:" + st.get(0).getId()+"\n";
        for(int i = 1;i<st.size();i++){
            text += "\n" + st.get(i).getNome() + " Código:" + st.get(i).getId();
        }
        frame.setLbl("Lista de Setores!");
        frame.modificar(text);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ASetor f = new ASetor();
        int s = Integer.parseInt(caixa3.getText());
        if(bs.getSetor(s)!= null){
            Setor ss = bs.getSetor(s);
            f.setG(s);
            f.setCx(ss.getNome());
            f.setVisible(true);
            dispose();
        } else{
            n.setTxt("Codigo invalido!");
            n.setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    ArrayList<Alunos> al = bs.getAlunos();
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ListaEs frame = new ListaEs();
        String text = al.get(0).getNome()+ " Matricula:" + al.get(0).getMat()+"\n";
        for(int i = 1;i<al.size();i++){
            text += "\n" + al.get(i).getNome() + " Matricula:" + al.get(i).getMat();
        }
        frame.setLbl("Lista de Alunos!");
        frame.modificar(text);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        AAluno f = new AAluno();
        int s = Integer.parseInt(caixa4.getText());
        if(bs.getAlunos(s)!= null){
            Alunos aa = bs.getAlunos(s);
            f.setG(s);
            f.setCx1(aa.getNome());
            f.setCx2(Integer.toString(aa.getMat()));
            f.setCx3(aa.getEnd());
            f.setCx4(aa.getTel());
            f.setCx5(aa.getCurso().getNome());
            f.setVisible(true);
            dispose();
        } else{
            n.setTxt("Codigo invalido!");
            n.setVisible(true);
        }
    }//GEN-LAST:event_jButton7ActionPerformed
    ArrayList<Professores> ps = bs.getProfessores();
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        ListaEs frame = new ListaEs();
        String text = ps.get(0).getNome()+ " Matricula:" + ps.get(0).getMat()+"\n";
        for(int i = 1;i<ps.size();i++){
            text += "\n" + ps.get(i).getNome() + " Matricula:" + ps.get(i).getMat();
        }
        frame.setLbl("Lista de Professores!");
        frame.modificar(text);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        AProfessor f = new AProfessor();
        int s = Integer.parseInt(caixa5.getText());
        if(bs.getProfessores(s)!= null){
            Professores p = bs.getProfessores(s);
            f.setG(s);
            f.setCx1(p.getNome());
            f.setCx2(Integer.toString(p.getMat()));
            f.setCx3(p.getEnd());
            f.setCx4(p.getTel());
            f.setCx5(p.getData_adm());
            f.setCx6(Double.toString(p.getSalario()));
            ArrayList<Escolas> ed = p.getEscolas();
            String txt = "";
            for(int i = 0;i<ed.size();i++){
                txt+= ed.get(i).getNome() +" ;";
            }
            f.setCx7(txt);
            f.setVisible(true);
            dispose();
        } else{
            n.setTxt("Codigo invalido!");
            n.setVisible(true);
        }
    }//GEN-LAST:event_jButton9ActionPerformed
    ArrayList<Turmas> ts = bs.getTurmas();
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        ListaEs frame = new ListaEs();
        String text = "Turma de:"+ts.get(0).getDisciplina().getNome()+ " Código:" + ts.get(0).getId()+"\n";
        for(int i = 1;i<ts.size();i++){
            text += "\n" +"Turma de:" +ts.get(i).getDisciplina().getNome() + " Código:" + ts.get(i).getId();
        }
        frame.setLbl("Lista de Turmas!");
        frame.modificar(text);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed
 
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        ATurma f = new ATurma();
        int s = Integer.parseInt(caixa6.getText());
        if(bs.getTurmas(s)!= null){
            Turmas ss = bs.getTurmas(s);
            f.setG(s);
            f.setCx1(ss.getDisciplina().getNome());
            f.setCx2(ss.getProfessor().getNome());
            ArrayList<Alunos> aa = ss.getAluno();
            String txt = "";
            for(int i = 0;i<aa.size();i++){
                txt+= aa.get(i).getNome() +" ;";
            }
            f.setCx3(txt);
            f.setVisible(true);
            dispose();
        } else{
            n.setTxt("Codigo invalido!");
            n.setVisible(true);
        }
    }//GEN-LAST:event_jButton11ActionPerformed
    ArrayList<Disciplinas> ds = bs.getDisciplinas();
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        ListaEs frame = new ListaEs();
        String text = ds.get(0).getNome()+ " Código:" + ds.get(0).getId()+"\n";
        for(int i = 1;i<ds.size();i++){
            text += "\n" + ds.get(i).getNome() + " Código:" + ds.get(i).getId();
        }
        frame.setLbl("Lista de Disiciplinas!");
        frame.modificar(text);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        ADisciplina f = new ADisciplina();
        int s = Integer.parseInt(caixa7.getText());
        if(bs.getDisciplinas(s)!= null){
            Disciplinas ss = bs.getDisciplinas(s);
            f.setG(s);
            f.setCx1(ss.getNome());
            ArrayList<Cursos> cc = ss.getCurso();
            String txt = "";
            for(int i = 0;i<cc.size();i++){
                txt+= cc.get(i).getNome() +" ;";
            }
            f.setCx2(txt);
            f.setVisible(true);
            dispose();
        } else{
            n.setTxt("Codigo invalido!");
            n.setVisible(true);
        }
    }//GEN-LAST:event_jButton13ActionPerformed
    ArrayList<Cursos> cs = bs.getCursos();
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        ListaEs frame = new ListaEs();
        String text = cs.get(0).getNome()+ " Código:" + cs.get(0).getId()+"\n";
        for(int i = 1;i<cs.size();i++){
            text += "\n" + cs.get(i).getNome() + " Código:" + cs.get(i).getId();
        }
        frame.setLbl("Lista de Cursos!");
        frame.modificar(text);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        ACurso f = new ACurso();
        int s = Integer.parseInt(caixa8.getText());
        if(bs.getCursos(s)!= null){
            Cursos ss = bs.getCursos(s);
            f.setG(s);
            f.setCx1(ss.getNome());
            f.setCx2(ss.getEscola().getNome());
            f.setVisible(true);
            dispose();
        } else{
            n.setTxt("Codigo invalido!");
            n.setVisible(true);
        }
    }//GEN-LAST:event_jButton15ActionPerformed
    ArrayList<Escolas> es = bs.getEscolas();
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        ListaEs frame = new ListaEs();
        String text = es.get(0).getNome()+ " Código:" + es.get(0).getId()+"\n";
        for(int i = 1;i<es.size();i++){
            text += "\n" + es.get(i).getNome() + " Código:" + es.get(i).getId();
        }
        frame.setLbl("Lista de Escolas!");
        frame.modificar(text);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        AEscola f = new AEscola();
        int s = Integer.parseInt(caixa.getText());
        if(bs.getEscolas(s)!= null){
            Escolas ss = bs.getEscolas(s);
            f.setG(s);
            f.setCx(ss.getNome());
            f.setVisible(true);
            dispose();
        } else{
            n.setTxt("Codigo invalido!");
            n.setVisible(true);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alterar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caixa;
    private javax.swing.JTextField caixa2;
    private javax.swing.JTextField caixa3;
    private javax.swing.JTextField caixa4;
    private javax.swing.JTextField caixa5;
    private javax.swing.JTextField caixa6;
    private javax.swing.JTextField caixa7;
    private javax.swing.JTextField caixa8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
