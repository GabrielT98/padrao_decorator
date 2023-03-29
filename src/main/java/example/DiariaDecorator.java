package example;

public abstract class DiariaDecorator implements Diaria {
    protected Diaria diariaDecorada;

    public DiariaDecorator(Diaria diariaDecorada) {
        this.diariaDecorada = diariaDecorada;
    }

    public double getCusto() {
        return diariaDecorada.getCusto();
    }

    public String getDescricao() {
        return diariaDecorada.getDescricao();
    }
}
