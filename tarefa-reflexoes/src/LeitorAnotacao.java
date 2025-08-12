import java.lang.annotation.Annotation;

public class LeitorAnotacao {
    public static void main(String[] args) {
        // Usamos reflection para pegar a classe Produto
        Class<Produto> classeProduto = Produto.class;

        // Verificamos se a classe tem a annotation Tabela
        if (classeProduto.isAnnotationPresent(Tabela.class)) {
            // Pegamos a annotation
            Tabela tabela = classeProduto.getAnnotation(Tabela.class);

            // Imprimimos o nome da tabela no console
            System.out.println("Nome da tabela: " + tabela.nome());
        } else {
            System.out.println("A classe não possui a annotation Tabela.");
        }
    }
}
