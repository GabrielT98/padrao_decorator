package example;

public class DiariaBasica implements Diaria {

    public double valor;

    public double getCusto() {
        return this.valor;
    }

    public String getDescricao() {
        return "Diária básica";
    }

    public DiariaBasica(double valor){
        this.valor = valor;

    }
}