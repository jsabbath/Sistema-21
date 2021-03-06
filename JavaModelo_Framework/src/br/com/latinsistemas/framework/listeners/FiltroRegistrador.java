package br.com.latinsistemas.framework.listeners;

import br.com.latinsistemas.framework.filtros.CORSFiltro;
import br.com.latinsistemas.framework.filtros.ExceptionFiltro;
import br.com.latinsistemas.framework.filtros.RewriteFiltro;
import br.com.latinsistemas.framework.seguranca.filtros.SegurancaFiltro;
import java.util.EnumSet;
import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Essa classe será usada para configurar os filtros que deverão estar
 * disponípiveis nos servlets desse sistema.
 *
 * @author rcheruti
 */
@WebListener
public class FiltroRegistrador implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    System.out.printf("---  Registrando os filtros (servlet) do sistema. \n");
    
    ServletContext ctx = sce.getServletContext();
    ctx.addFilter(CORSFiltro.class.getName(), CORSFiltro.class)
            .addMappingForUrlPatterns(null, true, "/*");
    ctx.addFilter(ExceptionFiltro.class.getName(), ExceptionFiltro.class)
            .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST,
                    DispatcherType.FORWARD,
                    DispatcherType.INCLUDE), true, "/*");
    ctx.addFilter(RewriteFiltro.class.getName(), RewriteFiltro.class)
            .addMappingForUrlPatterns(null, true, "/*");
    ctx.addFilter(SegurancaFiltro.class.getName(), SegurancaFiltro.class)
            .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
    
    System.out.printf("---  Registro de filtros (servlet) finalizado. \n");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {

  }

}
