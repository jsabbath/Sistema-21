
Module.config(['$stateProvider','$urlRouterProvider',
    function($stateProvider,$urlRouterProvider){
      
  $urlRouterProvider.otherwise('/index');
  
  $stateProvider.state('index',
    { url: '/index', views:{conteudo:{ templateUrl:'index.html' }}}
  );
  
}]);
