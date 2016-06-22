
package br.com.latinsistemas.entidades.embutidos;

import br.com.latinsistemas.entidades.Usuario;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Embeddable
@Data
public class RegistroUsuario implements Serializable{
  
  @OneToOne
  protected Usuario usuario;
  
  @Temporal(TemporalType.DATE)
  protected Date atualizacao;
  
  
}
