/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esgsoft.algoritmos.domain.arvoreavl;

import java.io.Console;

/**
 *
 * @author Euler
 */
public class ArvoreAvl {

    public static Node raiz = null;

    //GABARITO:
    public void inserir(Node node, int valor) {
        //verifica se a árvore já foi criada
        if (node != null) {
            //Verifica se o valor a ser inserido é menor que o nodo corrente da árvore, se sim vai para subárvore esquerda
            if (valor < node.getValor()) {
                //Se tiver elemento no nodo esquerdo continua a busca
                if (node.getEsq() != null) {
                    inserir(node.getEsq(), valor);
                } else {
                    //Se nodo esquerdo vazio insere o novo nodo aqui
                    System.out.println("  Inserindo " + valor + " a esquerda de " + node.getValor());
                    node.setEsq(new Node(null, node.getValor(), null));
                }
                //Verifica se o valor a ser inserido é maior que o nodo corrente da árvore, se sim vai para subárvore direita
            } else if (valor > node.getValor()) {
                //Se tiver elemento no nodo direito continua a busca
                if (node.getDir() != null) {
                    inserir(node.getDir(), valor);
                } else {
                    //Se nodo direito vazio insere o novo nodo aqui
                    System.out.println("  Inserindo " + valor + " a direita de " + node.getValor());
                    node.setDir(new Node(null, node.getValor(), null));
                }
            }
        }
    }
    //GABARITO====================================

    public static void adicionarNO(Node no, Long valor) {
        no = no == null ? raiz : no;
        if (raiz == null) {
            raiz = new Node(null, valor, null);
            no = raiz;
            return;
        } else if (valor > no.getValor()) {
            if (no.getDir() != null) {
                adicionarNO(no.getDir(), valor);
            } else {
                no.setDir(new Node(null, valor, null));
            }
        } else {
            if (no.getEsq() != null) {
                adicionarNO(no.getEsq(), valor);
            } else {
                no.setEsq(new Node(null, valor, null));
            }
        }
    }

    public static void printArvorePreOrdem(Node no) {
        if (no != null) {
            System.out.println(no.getValor() + " ");
            printArvorePreOrdem(no.getEsq());
            printArvorePreOrdem(no.getDir());
        }
    }

    public static void printArvorePosOrdem(Node no) {
        if (no != null) {
            printArvorePosOrdem(no.getEsq());
            printArvorePosOrdem(no.getDir());
            System.out.println(no.getValor() + " ");
        }
    }

    public static void printArvoreEmOrdem(Node no) {
        if (no != null) {
            printArvoreEmOrdem(no.getEsq());
            System.out.print(no.getValor() + " ");
            printArvoreEmOrdem(no.getDir());
        }
    }
}
