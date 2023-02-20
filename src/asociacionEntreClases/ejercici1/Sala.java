public class Sala {
    public int numeroDeTelevisions;
    public String tipusSala;


    public Sala() {
        numeroDeTelevisions=0;
        tipusSala="desconegut";
    }

    public int getNumeroDeTelevisions() {
        return numeroDeTelevisions;
    }

    public void setNumeroDeTelevisions(int numeroDeTelevisions) {
        this.numeroDeTelevisions = numeroDeTelevisions;
    }

    public String getTipusSala() {
        return tipusSala;
    }

    public void setTipusSala(String tipusSala) {
        this.tipusSala = tipusSala;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numeroDeTelevisions=" + numeroDeTelevisions +
                ", tipusSala='" + tipusSala + '\'' +
                '}';
    }
}
