// Importamos a annotation que criamos
// Colocamos @Tabela(nome = "tb_produtos") para dizer que esta classe representa essa tabela no banco
@Tabela(nome = "tb_produtos")
public class Produto {
    // Atributos de exemplo
    private int id;
    private String nome;

    // Construtor
    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}

