# Sistema

## Instalar:
- WildFly 9 (antigo JBoss) (o 10 tinha um bug, não sei se ja corrigiram isso)
- Netbeans
- NodeJs
- Grunt

## Projetos:
Tem 6 pastas que são projetos do Netbeans.
A pasta "libs" é onde estão as cópias das bibliotecas que serão necessárias
para a parte em Java.

###### JavaModelo_Framework
Esse é um projeto de biblioteca Java. 
Aqui está a parte que se comunica com o DB.

###### JavaModelo_Entities
Esse é um projeto de biblioteca Java. 
Esse é um complemento para o Framework. 
Aqui está a parte de segurança do DB.

###### JavaModelo_Export
Esse é um projeto de biblioteca Java. 
Esse é um complemento para o Framework. 
Aqui tem algumas formas de fazer relatórios pra Excel.

###### JavaModelo_Js
Esse é um projeto Javascript. 
Aqui está o código Javascript que fará a comunicação da tela com o servidor Java (código em Framework).

###### JavaModelo_Test_HTML
Esse é um projeto Javascript/HTML. 
Aqui estará o código que temos que escrever. Esse precisa do código em "JavaModelo_Js".

###### JavaModelo_Test
Esse é um projeto Web Java (war). A
qui estará o código que temos que escrever para o servidor (DB e segurança).


No fim temos que distribuir um arquivo ".war" que será criado quando juntamos todos os arquivos.
Esse arquivo é produzido pelo Netbeans pelo projeto "JavaModelo_Test". O Ant fará isso pra gente.

