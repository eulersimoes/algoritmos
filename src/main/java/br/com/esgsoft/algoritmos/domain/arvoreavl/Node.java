/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esgsoft.algoritmos.domain.arvoreavl;

/**
 *
 * @author Euler
 */
public class Node {
    
    private Long valor;
    private Node esq;
    private Node dir;
    
    public Node(Node esq, Long valor, Node dir)
    {
        this.esq = esq;
        this.valor = valor;
        this.dir = dir;
    }

    /**
     * @return the valor
     */
    public Long getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Long valor) {
        this.valor = valor;
    }

    /**
     * @return the esq
     */
    public Node getEsq() {
        return esq;
    }

    /**
     * @param esq the esq to set
     */
    public void setEsq(Node esq) {
        this.esq = esq;
    }

    /**
     * @return the dir
     */
    public Node getDir() {
        return dir;
    }

    /**
     * @param dir the dir to set
     */
    public void setDir(Node dir) {
        this.dir = dir;
    }

}
