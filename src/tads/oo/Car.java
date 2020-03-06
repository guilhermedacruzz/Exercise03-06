package tads.oo;

public class Car {

    public String cor;
    public String marca;
    public String modelo;
    public int ano;
    public float potencia;
    public float velocidade;
    public float tanqueAtual;
    public float tanqueMax;

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
        float value = this.velocidade * 0.005f;

        if (this.tanqueAtual - value >= 0) {
            this.velocidade += (potencia * 0.01f);
            tanqueAtual -= value;
        }
    }

    public float abastecer(float value) {
        float add = this.tanqueAtual + value;


        if (add <= this.tanqueMax) {
            this.tanqueAtual = add;
        } else {
            this.tanqueAtual = this.tanqueMax;
        }

        return this.tanqueAtual;
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
}
