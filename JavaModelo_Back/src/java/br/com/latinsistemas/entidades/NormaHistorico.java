
package br.com.latinsistemas.entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class NormaHistorico extends Norma{
  
  @ManyToOne
  private OrdemServico ordemServico;
  
  
}
