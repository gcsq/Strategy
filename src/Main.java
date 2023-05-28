public class Main {
    public static void main(String[] args) {
        Disciplina disciplinaAritmetica = new Disciplina(new Aritmetica(), "Disciplina A", 9.0, 10.0);
        System.out.println("Disciplina: " + disciplinaAritmetica.getNome());
        System.out.println("Média: " + disciplinaAritmetica.getMedia());
        System.out.println("Situação: " + disciplinaAritmetica.getSituacao());

        Disciplina disciplinaGeometrica = new Disciplina(new Geometrica(), "Disciplina B", 5.0, 5.5);
        System.out.println("Disciplina: " + disciplinaGeometrica.getNome());
        System.out.println("Média: " + disciplinaGeometrica.getMedia());
        System.out.println("Situação: " + disciplinaGeometrica.getSituacao());
    }
}