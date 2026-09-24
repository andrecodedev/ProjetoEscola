import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data // esse é o getter e setter da classe, que é usado para get e set os atributos da classe
@Builder // esse é o construtor da classe, que é usado para criar uma nova instância da classe
@AllArgsConstructor // esse é o construtor com todos os argumentos, que é usado para criar uma nova instância da classe com todos os argumentos
@NoArgsConstructor // esse é o construtor vazio, que é usado para criar uma nova instância da classe sem argumentos
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(mappedBy = "categoria")
    private List<Curso> cursos;
}
