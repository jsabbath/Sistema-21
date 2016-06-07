
insert into seg_usuario( DTYPE, email, nome ) values( 1, 'rafael@someone.com','Rafael' );
insert into seg_usuario( DTYPE, email, nome ) values( 1, 'alguem@someone.com','Alguém' );
insert into seg_usuario( DTYPE, email, nome ) values( 1, 'rosana@someone.com','Rosana' );
insert into seg_usuario( DTYPE, email, nome ) values( 1, 'joao.bloqueado@someone.com','João Bloqueado' );

insert into seg_credencial( bloqueado, erros, login, renovarSenha, usuario_id, senha ) values( 0, 0, 'rafael', 0, 1, 'ok' );
insert into seg_credencial( bloqueado, erros, login, renovarSenha, usuario_id, senha ) values( 0, 0, 'alguem', 0, 2, 'ok' );
insert into seg_credencial( bloqueado, erros, login, renovarSenha, usuario_id, senha ) values( 0, 0, 'rosana', 0, 3, 'ok' );
insert into seg_credencial( bloqueado, erros, login, renovarSenha, usuario_id, senha ) values( 1, 0, 'joao',   0, 4, 'ok' );

insert into seg_grupo(chave,nome) values('admin','Admin');
insert into seg_grupo(chave,nome) values('usuario1','Usuários 1');
insert into seg_fk_credencial_grupo(credenciais_id, grupos_id) values(1,1), (2,2), (3,2), (4,2);

insert into seg_permissao( nome ) values( 'url_tipo' );
insert into seg_permissao( nome ) values( 'registro_usuario' );
insert into seg_permissao( nome ) values( 'ver_registroUsuario' );
insert into seg_fk_credencial_permissao( credenciais_id, permissoes_id ) values( 1, 1 );

insert into seg_fk_grupo_permissao(grupos_id, permissoes_id) values(1,2);
insert into seg_fk_grupo_permissao(grupos_id, permissoes_id) values(1,3);
insert into seg_fk_grupo_permissao(grupos_id, permissoes_id) values(3,2);







