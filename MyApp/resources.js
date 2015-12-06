angular.module('resources.login', ['ngResource']).factory('LoginUser', ['$resource', function($resource){
	var resource = $resource('/LTOApp/rest/UserService/:action',
		{action:'@action'},
		{retrieve: {method: 'GET', params: {action:'users'}}}
	);
	
	return {
		retrieve: function(object){
			return resource.retrieve(object);
		}
	};
}]);