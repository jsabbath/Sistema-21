
package br.com.andinos.entidades;

import br.com.andinos.entidades.embutidos.IRegistroUsuario;
import br.com.andinos.entidades.embutidos.RegistroUsuario;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class OrdemServico implements Serializable, IRegistroUsuario{
  
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Embedded
  private RegistroUsuario registroUsuario;
  
  @OneToMany(mappedBy = "ordemServico")
  private List<NormaHistorico> normas;
  
  @OneToMany(mappedBy = "ordemServico")
  private List<Ensaio> ensaios;
  
  @Temporal(TemporalType.TIMESTAMP)
  private Date data = Calendar.getInstance().getTime();
  
  
  
}
