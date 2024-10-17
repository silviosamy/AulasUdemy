package TreinoMedia;

public class UtilClass {

    private double mediaNota;

    public double mediaNota(double n1, double n2, double n3, double n4) {
        double mediaNotas = n1 + n2 + n3 + n4 / 4;
        return mediaNotas;
    }

    public double getMediaNota() {
        return mediaNota;
    }

    public void setMediaNota(double mediaNota) {
        this.mediaNota = mediaNota;
    }
}
