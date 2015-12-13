var loginModule = angular.module('login', ['ngRoute']);

loginModule.controller('LoginCtrl',['$rootScope', '$scope', 'LoginUser',
	function($rootScope, $scope, LoginUser){
		$scope.username = null;
		$scope.password = null;
		
		$scope.submit = function(){
			var user = { firstName: $scope.username};
			LoginUser.retrieve(user);
		};
}]);

loginModule.config(['$routeProvider', '$locationProvider', 
	function($routeProvider, $locationProvider) {
		$locationProvider.html5Mode(true);
		$routeProvider.when('/login', { 
			templateUrl: 'login.tpl.html',
			controller: 'LoginCtrl'
		});	

	}
]);