package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.modelo.Calculadora;
import br.edu.ifsp.pep.util.Util;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class CalculadoraController implements Serializable {

    //instanciando a classe calculadora:
    private Calculadora calculadora;

    //constructores:
    public CalculadoraController() {
        this.calculadora = new Calculadora();
    }

    //getters e setters:
    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    //métodos:
    public void calcular() {
        if (this.calculadora.getNum2() == 0) {
            Util.warn("Não se divide por '0'");
        } else {
            if (this.calculadora.getOperador() == null) {
                Util.warn("Digite um Operador - Sugestões: '/', '+', '*', '-'");
            } else {

                if (this.calculadora.getOperador().equals("/")) {
                    this.calculadora.setResultado((calculadora.getNum1() / calculadora.getNum2()));
                } else if (this.calculadora.getOperador().equals("-")) {
                    this.calculadora.setResultado((calculadora.getNum1() - calculadora.getNum2()));
                } else if (this.calculadora.getOperador().equals("+")) {
                    this.calculadora.setResultado((calculadora.getNum1() + calculadora.getNum2()));
                } else if (this.calculadora.getOperador().equals("*")) {
                    this.calculadora.setResultado((calculadora.getNum1() * calculadora.getNum2()));
                }
            }
        }

    }
}
