var app = angular.module('MyApp', [
	'home',
	'ngRoute'
]);

app.config(['$httpProvider', function($httpProvider){
    $httpProvider.defaults.xsrfCookieName = '_csrf';
    $httpProvider.defaults.xsrfHeaderName = 'x-csrf-token';
}]);