/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import jdk.nashorn.internal.runtime.JSType;
import modelo.Contrato;
import modelo.listaContrato;
import visao.Orcamento;

/**
 *
 * @author milson
 */
public class orcamentoControl {
    public static void saveNewContractToFile(Orcamento orcamento, Contrato contrato){
        
        /* TODO: falta implementar o controlador de erro, para verificar se os dados dos campos estao corretos */
        /* ID do contrato consiste da data de criacao e é criado quando o objeto é instanciado */
        
        contrato.client.setEmail(orcamento.getEmail());
        contrato.client.setName(orcamento.getNome());
        contrato.client.setPhone(orcamento.getFone());
        
        contrato.client.addres.setCEP(orcamento.getCep());
        contrato.client.addres.setNumber(orcamento.getNumber());
        contrato.client.addres.setStreet(orcamento.getEndereco());
        
        contrato.setLocalP(orcamento.getLocalPerfuracao());
        contrato.setType(orcamento.getContractType());
        
        /* TODO: get e set de todas a variaveis da tabela, pra fazer isso precisa converter de hash map pra array */
        
        contrato.setHashMap(orcamento.getColunas());
        
        /* Debug line */
        System.out.println(contrato.toString());
        
        listaContrato ls = new listaContrato();
        
        ls.loadContrato("database");
        ls.addContrato(contrato);
        ls.writeContrato("database");
    }
    
    public static void displayOrcamentoContent(Orcamento orcamento, Contrato contrato){
        
        orcamento.setEmail(contrato.client.getEmail());
        orcamento.setName(contrato.client.getName());
        orcamento.setFone(contrato.client.getPhone());
        
        orcamento.setCep(contrato.client.addres.getCEP());
        orcamento.setEndereco(contrato.client.addres.getStreet());
        orcamento.setNumber(contrato.client.addres.getNumber());
        
        orcamento.setLocalPerfuracao(contrato.getLocalP());
        orcamento.setContractType(JSType.toInteger(contrato.getType()));
        
        /* setando referente as pecas */
        /* falta implementar o metodo que retorna cada campo baseado nas variaveis do hash map em formato de ArrayList */
        //orcamento.setColuna0();
        //orcamento.setColuna1();
        //orcamento.setColuna2();
        //orcamento.setColuna3();
        //orcamento.setColuna4();
        
        /* TODO: get e set de todas a variaveis da tabela, pra fazer isso precisa converter de hash map pra array */
    }
    
    public static void generatePdf(Orcamento orcamento){
        
    }
    
    public static ArrayList<String> getIDS(){
        listaContrato ls = new listaContrato();
        ls.loadContrato("database");
        return ls.getAllContractIDs();
    }
    
}
