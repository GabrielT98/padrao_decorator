package example;

public class DiariaComSeguro extends DiariaDecorator {
    public DiariaComSeguro(Diaria diariaDecorada) {
        super(diariaDecorada);
    }

    public double getCusto() {
        return diariaDecorada.getCusto() + 20.00;
    }

    public String getDescricao() {
        return diariaDecorada.getDescricao() + " + Seguro";
    }
}
