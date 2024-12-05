package com.dev.poo.View;

import com.dev.poo.Aux.ENivel;
import com.dev.poo.Entities.*;
import com.dev.poo.Repository.*;
import com.dev.poo.Service.ServiceResposta;

public class TelaAluno extends javax.swing.JFrame {

    private Aluno aluno;
    private String nomeAluno;
    private ENivel nivel;
    private ENivel proxNivel;
    private Integer pontsProxNivel;


    public TelaAluno(Usuario aluno) {
        setAluno(aluno);
        setNivel();
        this.nomeAluno = aluno.getNome().split(" ")[0].substring(0, 1).toUpperCase() +
                aluno.getNome().split(" ")[0].substring(1).toLowerCase();
        initComponents();
    }

    private void setPontsProxNivel() {
        RepositoryClassificacao rc = new RepositoryClassificacao(Classificacao.class);
        Integer pontuacaoMinimaProxNivel = rc.buscaUnicaPorCampo("nivel", this.proxNivel).getPontuacaoMinima();
        this.pontsProxNivel = pontuacaoMinimaProxNivel - this.aluno.getPontosAcumulados();
    }

    private Integer getPontsProxNivel() {
        return this.pontsProxNivel;
    }

    private void setNivel() {
        this.nivel = this.aluno.getClassificacao().getNivel();
        setProxNivel();
    }

    public ENivel getNivel() {
        return nivel;
    }

    public Usuario getAluno() {
        return aluno;
    }

    public void setAluno(Usuario aluno) {
        RepositoryAluno ra = new RepositoryAluno(Aluno.class);
        this.aluno = ra.buscarPorId(aluno.getId());

    }

    public ENivel getProxNivel() {
        return proxNivel;
    }

    public void setProxNivel() {
        if (this.nivel.getValor() >= 0 && this.nivel.getValor() <= 5) {
            Integer nu = this.nivel.getValor() + 1;
            this.proxNivel = ENivel.encontrarPorValor(nu);
            setPontsProxNivel();
            return;
        }
        this.proxNivel = null;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanelTelaProfessor = new javax.swing.JPanel();
        jButtonVisualizarDesafio = new javax.swing.JButton();
        jButtonProgresso = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jLabelFoto = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelGetNome = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelGetEmail1 = new javax.swing.JLabel();
        jLabelAcum = new javax.swing.JLabel();
        jLabelGetPontosAcumulados = new javax.swing.JLabel();
        jLabelPtsProxNivel = new javax.swing.JLabel();
        jLabelGetPtsProNivel = new javax.swing.JLabel();
        jLabelNivelAtual = new javax.swing.JLabel();
        jLabelGetNivelAtu = new javax.swing.JLabel();
        jLabelProxNivel = new javax.swing.JLabel();
        jLabelGetProNivel = new javax.swing.JLabel();
        jLabelBoasVindas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jardim do Conhecimento - " + this.nomeAluno);
        setResizable(false);

        jPanelTelaProfessor.setToolTipText("");
        jPanelTelaProfessor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVisualizarDesafio.setText("Visualizar Desafios");
        jButtonVisualizarDesafio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarDesafioActionPerformed(evt);
            }
        });
        jPanelTelaProfessor.add(jButtonVisualizarDesafio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 210, 50));

        jButtonProgresso.setText("Visualizar Progresso");
        jButtonProgresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProgressoActionPerformed(evt);
            }
        });

        jButtonAtualizar = new javax.swing.JButton();

        jButtonAtualizar.setText("Atualizar");

        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });


        jButtonSair = new javax.swing.JButton();

        jButtonSair.setText("Sair");

        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jPanelTelaProfessor.add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 100, 30));


        jPanelTelaProfessor.add(jButtonAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 390, 100, 30));


        jPanelTelaProfessor.add(jButtonProgresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 210, 70));

        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/foto estudante.jpg"))); // NOI18N
        jPanelTelaProfessor.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 290, 200));

        jLabelNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNome.setText("Nome:");
        jPanelTelaProfessor.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabelGetNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelGetNome.setText(this.aluno.getNome());
        jPanelTelaProfessor.add(jLabelGetNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelEmail.setText("Email:");
        jPanelTelaProfessor.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabelGetEmail1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelGetEmail1.setText(this.aluno.getEmail());
        jPanelTelaProfessor.add(jLabelGetEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jLabelAcum.setText("Pontos Acumulados:");
        jPanelTelaProfessor.add(jLabelAcum, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        jLabelGetPontosAcumulados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelGetPontosAcumulados.setText(String.valueOf(this.aluno.getPontosAcumulados()));
        jPanelTelaProfessor.add(jLabelGetPontosAcumulados, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jLabelPtsProxNivel.setText("Pontos p/ Nivel:");
        jPanelTelaProfessor.add(jLabelPtsProxNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        jLabelGetPtsProNivel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelGetPtsProNivel.setText(String.valueOf(getPontsProxNivel()));
        jPanelTelaProfessor.add(jLabelGetPtsProNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        jLabelNivelAtual.setText("Nivel Atual:");
        jPanelTelaProfessor.add(jLabelNivelAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, -1, -1));

        jLabelGetNivelAtu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelGetNivelAtu.setText(getNivel().name());
        jPanelTelaProfessor.add(jLabelGetNivelAtu, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, -1, -1));

        jLabelProxNivel.setText("Próximo Nivel:");
        jPanelTelaProfessor.add(jLabelProxNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        jLabelGetProNivel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelGetProNivel.setText(getProxNivel().name());
        jPanelTelaProfessor.add(jLabelGetProNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, -1));

        jLabelBoasVindas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelBoasVindas.setText("Seja Bem Vindo " + this.nomeAluno + " !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelTelaProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelBoasVindas)
                                .addGap(317, 317, 317))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabelBoasVindas)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelTelaProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void jButtonProgressoActionPerformed(java.awt.event.ActionEvent evt) {
        TelaJardim progresso = new TelaJardim(this.aluno);
        progresso.setVisible(true);
        this.dispose();
    }

    private void jButtonVisualizarDesafioActionPerformed(java.awt.event.ActionEvent evt) {
//        ListaDesafios listaDesafios = new ListaDesafios();
//        listaDesafios.setVisible(true);
//        this.dispose();
        Desafio desafio;
        Aluno aluno;
        Professor professor;
        RepositoryDesafio rd = new RepositoryDesafio(Desafio.class);
        RepositoryAluno ra = new RepositoryAluno(Aluno.class);
        RepositoryProfessor rp = new RepositoryProfessor(Professor.class);
        desafio = rd.buscaUnicaPorCampo("id", 1L);
        aluno = ra.buscaUnicaPorCampo("email", this.getAluno().getEmail());
        professor = rp.buscaUnicaPorCampo("email", "sormany.ads@gmail.com");
        ServiceResposta sr = new ServiceResposta();
        Respostas r1 = new Respostas("A resposta para a soma é 55", desafio, aluno);
        sr.avaliarResposta(150,r1,professor);

    }

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {
        RepositoryUsuario ru = new RepositoryUsuario(Usuario.class);
        Usuario user = ru.buscaUnicaPorCampo("email", this.aluno.getEmail());
        TelaAluno TAluno = new TelaAluno(user);
        this.dispose();
        TAluno.setVisible(true);
    }

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new TelaAluno().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonProgresso;
    private javax.swing.JButton jButtonVisualizarDesafio;
    private javax.swing.JLabel jLabelAcum;
    private javax.swing.JLabel jLabelBoasVindas;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelGetEmail1;
    private javax.swing.JLabel jLabelGetNivelAtu;
    private javax.swing.JLabel jLabelGetNome;
    private javax.swing.JLabel jLabelGetPontosAcumulados;
    private javax.swing.JLabel jLabelGetProNivel;
    private javax.swing.JLabel jLabelGetPtsProNivel;
    private javax.swing.JLabel jLabelNivelAtual;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelProxNivel;
    private javax.swing.JLabel jLabelPtsProxNivel;
    private javax.swing.JPanel jPanelTelaProfessor;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonSair;
}
