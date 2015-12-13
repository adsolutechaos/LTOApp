var app = angular.module('MyApp', [
	'home',
	'login',
	
	'resources.login',
	
	'ngRoute'
]);

app.config(['$httpProvider', function($httpProvider){
}]);