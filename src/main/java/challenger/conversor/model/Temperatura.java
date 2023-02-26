package challenger.conversor.model;

public class Temperatura {
    private double valor;
    private char escala;

    public Temperatura(double valor, char escala) {
        this.valor = valor;
        this.escala = escala;
    }

    public double getValor() {
        return valor;
    }

    public char getEscala() {
        return escala;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEscala(char escala) {
        this.escala = escala;
    }

    public double paraCelsius() {
        if (escala == 'F') {
            return (valor - 32) * 5 / 9;
        } else if (escala == 'K') {
            return valor - 273.15;
        } else {
            return valor;
        }
    }

    public double paraFahrenheit() {
        if (escala == 'C') {
            return valor * 9 / 5 + 32;
        } else if (escala == 'K') {
            return (valor - 273.15) * 9 / 5 + 32;
        } else {
            return valor;
        }
    }

    public double paraKelvin() {
        if (escala == 'C') {
            return valor + 273.15;
        } else if (escala == 'F') {
            return (valor - 32) * 5 / 9 + 273.15;
        } else {
            return valor;
        }
    }
}
