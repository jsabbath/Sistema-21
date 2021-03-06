
package br.com.latinsistemas.framework.interfaces;

public interface IUsuario {
  
  static final String USUARIO_KEY = "usuario";
  
  boolean hasPermissao(String chave);
  boolean hasGrupo(String chave);
  
  IUsuario clone();
  
}
