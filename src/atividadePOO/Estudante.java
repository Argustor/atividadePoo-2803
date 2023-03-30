package atividadePOO;

public class Estudante {
    private double notaUm;
    private double notaDois;
    private double media;

    public Estudante(double notaUm, double notaDois) {
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        this.media = (notaUm + notaDois) / 2;
    }

    public double getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(double notaUm) {
        this.notaUm = notaUm;
    }

    public double getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(double notaDois) {
        this.notaDois = notaDois;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
