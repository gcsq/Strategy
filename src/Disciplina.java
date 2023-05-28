class Disciplina {
    private lCalcMedia calculadoraMedia;
    private double media;
    private String nome;
    private double p1;
    private double p2;
    private String situacao;

    public lCalcMedia getCalculadoraMedia() {
        return calculadoraMedia;
    }

    public void setCalculadoraMedia(lCalcMedia calculadoraMedia) {
        this.calculadoraMedia = calculadoraMedia;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Disciplina(lCalcMedia calculadoraMedia, String nome, double p1, double p2) {
        this.calculadoraMedia = calculadoraMedia;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.CalcularMedia();
    }

    public void CalcularMedia() {
        this.media = calculadoraMedia.CalculaMedia(p1, p2);
        this.situacao = calculadoraMedia.Situacao();
    }
}