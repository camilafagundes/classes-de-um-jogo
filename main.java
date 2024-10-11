class Hero {
    private String nome;
    private int idade;
    private String tipo;

    public Hero(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public String atacar() {
        String ataque;

        switch (tipo.toLowerCase()) {
            case "mago":
                ataque = "magia";
                break;
            case "guerreiro":
                ataque = "espada";
                break;
            case "monge":
                ataque = "artes marciais";
                break;
            case "ninja":
                ataque = "shuriken";
                break;
            default:
                ataque = "ataque desconhecido";
        }

        return "O " + tipo + " atacou usando " + ataque;
    }

    public static void main(String[] args) {
        Hero heroi1 = new Hero("Gandalf", 300, "Mago");
        String mensagem = heroi1.atacar();
        System.out.println(mensagem);
    }
}
