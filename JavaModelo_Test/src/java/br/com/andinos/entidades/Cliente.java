
package br.com.andinos.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Cliente implements Serializable{
  
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  private String cnpj;
  private String cpf;
  
  private String endereco;
  private int numero;
  private String cep;
  
  
  @OneToMany(mappedBy = "cliente")
  private List<Produto> produtos;
  
}
