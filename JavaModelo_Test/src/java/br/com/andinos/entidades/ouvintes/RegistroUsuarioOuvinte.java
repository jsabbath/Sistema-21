
package br.com.andinos.entidades.ouvintes;

import br.com.andinos.entidades.Usuario;
import br.com.andinos.entidades.embutidos.IRegistroUsuario;
import br.com.andinos.entidades.embutidos.RegistroUsuario;
import br.eng.rcc.framework.seguranca.servicos.UsuarioServico;
import java.util.Calendar;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@ApplicationScoped
public class RegistroUsuarioOuvinte {
  
  @Inject
  private UsuarioServico uServ;
  
  @PrePersist
  @PreUpdate
  public void updateData(Object obj){
    if( obj instanceof IRegistroUsuario ){
      IRegistroUsuario ireg = (IRegistroUsuario)obj;
      RegistroUsuario reg = ireg.getRegistroUsuario();
      if( reg == null ) ireg.setRegistroUsuario( reg = new RegistroUsuario() );
      reg.setAtualizacao( Calendar.getInstance().getTime() );
      reg.setUsuario( (Usuario)uServ.getUsuario() );
    }
  }
  
}
