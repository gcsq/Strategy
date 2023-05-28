class Geometrica implements lCalcMedia {
    @Override
    public double CalculaMedia(double p1, double p2) {
        return Math.sqrt(p1 * p2);
    }

    @Override
    public String Situacao() {
        return "Reprovado";
    }
}