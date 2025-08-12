// Importamos as classes necessárias para definir como essa annotation vai funcionar
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// @Retention(RetentionPolicy.RUNTIME) significa que essa annotation vai existir também em tempo de execução.
// Isso é obrigatório para podermos acessar ela usando Reflection.
@Retention(RetentionPolicy.RUNTIME)
public @interface Tabela {
    // Criamos um "atributo" da annotation chamado nome()
    // Esse atributo vai guardar o nome da tabela que queremos associar a uma classe
    String nome();
}
