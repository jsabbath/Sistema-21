
package br.com.andinos.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Ensaio implements Serializable{
  
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @ManyToOne
  private OrdemServico ordemServico;
  
  @OneToMany(mappedBy = "ordemServico")
  private List<Experimento> experimentos;
  
}
