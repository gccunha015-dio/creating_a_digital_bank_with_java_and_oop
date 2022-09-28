package digitalbank;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Setter(AccessLevel.NONE)
public class Cliente {
  private String nome;

  public Cliente(String nome) {
    this.nome = nome;
  }
}
