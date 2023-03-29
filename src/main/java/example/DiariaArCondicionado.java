package example;

public class DiariaArCondicionado extends DiariaDecorator {

        public DiariaArCondicionado(Diaria diariaDecorada) {
            super(diariaDecorada);
        }

        public double getCusto() {
            return diariaDecorada.getCusto() + 40.00;
        }

        public String getDescricao() {
            return diariaDecorada.getDescricao() + " + Ar-condicionado";
        }
    }

