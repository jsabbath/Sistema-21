
package br.com.latinsistemas.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Categoria implements Serializable{
  
  @Id 
  private int id;
  
  private String descricao;
  
  @ManyToMany
  private List<Produto> produtos;
  
}
