public class PrisonTest3 {
    public static void main(String[] args) {
        Prisoner twitch = new Prisoner("Bubba", 2.08, "4 anos");
        Prisoner bubba = new Prisoner("Bubba", 2.08, "4 anos");

        // Testando igualdade usando ==
        System.out.println("Usando == para testar igualdade de strings:");
        System.out.println("twitch.nome == bubba.nome: " + (twitch.nome == null ? bubba.nome == null : twitch.nome.equals(bubba.nome)));
    }
}

class Prisoner {
    String nome;
    double altura;
    String sentenca;

    public Prisoner(String nome, double altura, String sentenca) {
        this.nome = nome;
        this.altura = altura;
        this.sentenca = sentenca;
    }
}