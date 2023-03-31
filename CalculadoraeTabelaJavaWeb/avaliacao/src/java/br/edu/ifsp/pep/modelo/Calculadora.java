package br.edu.ifsp.pep.modelo;

import java.util.Objects;

public class Calculadora {

    private float num1;
    private float num2;
    private float resultado;
    private String operador;

    //construtores:
    public Calculadora() {
    }

    public Calculadora(float num1, float num2, float resultado, String operador) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
        this.operador = operador;
    }

    //getters e setters:

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    //hashCode e equals:
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Float.floatToIntBits(this.num1);
        hash = 97 * hash + Float.floatToIntBits(this.num2);
        hash = 97 * hash + Float.floatToIntBits(this.resultado);
        hash = 97 * hash + Objects.hashCode(this.operador);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Calculadora other = (Calculadora) obj;
        if (Float.floatToIntBits(this.num1) != Float.floatToIntBits(other.num1)) {
            return false;
        }
        if (Float.floatToIntBits(this.num2) != Float.floatToIntBits(other.num2)) {
            return false;
        }
        if (Float.floatToIntBits(this.resultado) != Float.floatToIntBits(other.resultado)) {
            return false;
        }
        return Objects.equals(this.operador, other.operador);
    }

    //toString
    @Override
    public String toString() {
        return "Calculadora{" + "num1=" + num1 + ", num2=" + num2 + ", resultado=" + resultado + ", operador=" + operador + '}';
    }
    
    
}
