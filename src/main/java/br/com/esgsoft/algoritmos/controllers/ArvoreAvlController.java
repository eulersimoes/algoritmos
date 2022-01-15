/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esgsoft.algoritmos.controllers;

import br.com.esgsoft.algoritmos.domain.arvoreavl.ArvoreAvl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Euler
 */
@RestController
public class ArvoreAvlController {

    @GetMapping("/arvoreavl/inserirArvoreAvl/{valor}")
    void addValorArvoreAvl(@PathVariable Long valor) {
        //ArvoreAvl.adicionarNO(null, valor);
        ArvoreAvl.adicionarNO(null, 10l);
        ArvoreAvl.adicionarNO(null, 5l);
        ArvoreAvl.adicionarNO(null, 6l);
        ArvoreAvl.adicionarNO(null, 1l);
        ArvoreAvl.adicionarNO(null, 15l);
        ArvoreAvl.adicionarNO(null, 50l);
        ArvoreAvl.adicionarNO(null, 14l);
    }

    @GetMapping("/arvoreavl/imprimirpreordem")
    void imprimirPreOrderm() {
        ArvoreAvl.printArvorePreOrdem(ArvoreAvl.raiz);
    }

    @GetMapping("/arvoreavl/imprimirposordem")
    void imprimirPosOrderm() {
        ArvoreAvl.printArvorePosOrdem(ArvoreAvl.raiz);
    }

    @GetMapping("/arvoreavl/imprimiremordem")
    void imprimirEmOrderm() {
        ArvoreAvl.printArvoreEmOrdem(ArvoreAvl.raiz);
    }
}
