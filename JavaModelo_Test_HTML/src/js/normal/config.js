
window.Module = angular.module('Module',['ngAnimate','ngTouch','ngRoute','ui.router','JavaModelo']);

Module.config(['pathProvider','HostInterProvider',
    function(pathProvider, HostInterProvider ){
  
  //UsuarioProvider.carregarAoIniciar = false;
  
  HostInterProvider.url = '@@hostInter'; // trocado por "grunt:replace"
  HostInterProvider.ativo = HostInterProvider.url? true : false;
  
  pathProvider.servico = '/s';
  pathProvider.websocket = '/websocket';
  
}]);


Module.run(['Entidades','$window','Usuario','$q',
    function(Entidades,$window,Usuario, $q){
  
  
  Usuario.then(function(u){
    console.log('Usuario::: ', u);
  });
  
  
}]);
