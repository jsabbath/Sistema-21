
package br.com.latinsistemas.entidades.ouvintes;

import br.com.latinsistemas.entidades.Usuario;
import br.com.latinsistemas.framework.interfaces.SegurancaPersistenciaInterceptador;
import br.com.latinsistemas.framework.seguranca.servicos.UsuarioServico;
import br.com.latinsistemas.framework.utils.BuscaInfo;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class SerUsuarioLogadoFilter implements SegurancaPersistenciaInterceptador<Usuario>{
  
  @Inject
  private UsuarioServico uServ;
  
  @Override
  public void filter(BuscaInfo busca) {
    //System.out.printf("---  Seguranca:SerUsuarioLogadoFilter:filter(BuscaInfo) \n");
    Usuario u = (Usuario)uServ.getUsuario();
    busca.where.add( new String[]{"registroUsuario.usuario.id","=", ""+u.getId() ,"&"} );
    
  }

  @Override
  public List<Usuario> filter(List<Usuario> objs) {
    //System.out.printf("---  Seguranca:SerUsuarioLogadoFilter:filter(List<Usuario>) \n");
    return objs;
  }
  
  
  
}
