var homeModule = angular.module('home', ['ngRoute']);

homeModule.controller('HomeCtrl',['$rootScope', '$scope',
	function($rootScope, $scope){
		$scope.greeting = 'Hello';
}]);

homeModule.config(['$routeProvider', '$locationProvider', 
	function($routeProvider, $locationProvider) {
		$locationProvider.html5Mode(true);
		$routeProvider.when('/home', { 
			// templateUrl: 'home/views/home3.tpl.html',
			templateUrl: 'home.tpl.html',
			controller: 'HomeCtrl'
		});	

	}
]);