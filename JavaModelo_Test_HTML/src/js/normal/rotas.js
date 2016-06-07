
Module.config(['$stateProvider','$routeProvider',
    function($stateProvider,$routeProvider){
      
  $routeProvider.otherwise('/#/index');
  
  $stateProvider.state('index',
    { url: '/index', views:{login:{ templateUrl:'index.html' }}}
  ).state('login',
    { url: '/login', views:{login:{ templateUrl:'login.html' }}}
  );
  
}]);
