package tads.oo;

import java.util.Scanner;

public class Car {

    private String cor;
    private String marca;
    private String modelo;
    private int ano;
    private float potencia;
    private float velocidade;
    private float tanqueAtual;
    private float tanqueMax;

    public Car(String cor, String marca, String modelo, int ano, float potencia, float velocidade, float tanqueAtual, float tanqueMax) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.velocidade = velocidade;
        this.tanqueAtual = tanqueAtual;
        this.tanqueMax = tanqueMax;
    }


    public void acelerar() {
        this.setVelocidade(this.getVelocidade() + (this.getVelocidade() * 0.01f));

        float value = this.getVelocidade() * 0.005f;

        if(this.getTanqueAtual() - value >= 0) {
            this.setTanqueAtual((this.getTanqueAtual() - value));
        }
    }

    public float abastecer(float value) {
        float add = this.getTanqueAtual() + value;


        if(add <= this.getTanqueMax()) {
            this.setTanqueAtual(add);
        }
        else{
            this.setTanqueAtual(this.getTanqueMax());
        }

        return this.getTanqueAtual();
    }

    @Override
    public String toString() {
        return "Car{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", potencia=" + potencia +
                ", velocidade=" + velocidade +
                ", tanqueAtual=" + tanqueAtual +
                ", tanqueMax=" + tanqueMax +
                '}';
    }

    public String getCor() { return cor; }

    public void setCor(String cor) { this.cor = cor; }

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }

    public void setAno(int ano) { this.ano = ano; }

    public float getPotencia() { return potencia; }

    public void setPotencia(float potencia) { this.potencia = potencia; }

    public float getVelocidade() { return velocidade; }

    public void setVelocidade(float velocidade) { this.velocidade = velocidade; }

    public float getTanqueAtual() { return tanqueAtual; }

    public void setTanqueAtual(float tanqueAtual) { this.tanqueAtual = tanqueAtual; }

    public float getTanqueMax() { return tanqueMax; }

    public void setTanqueMax(float tanqueMax) { this.tanqueMax = tanqueMax; }
}
