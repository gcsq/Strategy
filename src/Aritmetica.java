class Aritmetica implements lCalcMedia {
    @Override
    public double CalculaMedia(double p1, double p2) {
        return (p1 + p2) / 2;
    }

    @Override
    public String Situacao() {
        return "Aprovado";
    }
}