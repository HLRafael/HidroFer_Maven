/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;
import modelo.Contrato;
import visao.Abrir;
import visao.Estoque;
import visao.Historico;
import visao.Orcamento;

/**
 *
 * @author milson
 */
public class telaPrincipalControl {
    
    /**
     * abre uma nova janela de orcamento;
     */
    static public void diplayOrcamento(){
        java.awt.EventQueue.invokeLater(() -> {
            Orcamento orcamento = new Orcamento();
            orcamento.setVisible(true);
            orcamento.setExtendedState(MAXIMIZED_BOTH);
            orcamento.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        });
    }
    
    static public void displayOrcamentoAbrir(Contrato contrato){
        /** 
         * TODO: terminar metodo para abir contrato carregado a partir da tela abrir
         * call displayOrcamentoContent(); para setar os campos com os valores do contrato escolhido
         */
        
    }
    
    /**
     * abre uma nova janela de orcamento;
     */
    static public void displayHistorico(){
        java.awt.EventQueue.invokeLater(() -> {
            Historico historico = new Historico();
            historico.setVisible(true);
            historico.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            /* historico.setExtendedState(MAXIMIZED_BOTH); nao precisa disto */
        });
        
        /** ciar um jpanel contento informacoes relevantes do contrato para com o
         * historico e listalos baseados na data
         * criar historico controle
         */
    }
    
    static public Contrato displayAbrir(){
        java.awt.EventQueue.invokeLater(() -> {
            Abrir abrir = new Abrir();
            abrir.setVisible(true);
            abrir.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        });
        
        
        return null;
        /**
         * tudo esta dentro de um hash map, falta fazer uma tela que
         * lista todos os contratos do listaContrato e abre o que foi escolhido
         * -> displayOrcamenetoAbrir(displayAbrir());
         */
    }
    
    static public void displayEstoque(){
        java.awt.EventQueue.invokeLater(() -> {
            Estoque estoque = new Estoque();
            estoque.setVisible(true);
            estoque.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        });
        
    }
}
