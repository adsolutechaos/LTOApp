angular.module('resources.login', ['ngResource']).factory('LoginUser', ['$resource', function($resource){
	var resource = $resource('/LTOApp/rest/registration/:action',
		{action:'@action'},
		{retrieve: {method: 'POST', params: {action:'insert'}}}
	);
	
	return {
		retrieve: function(object){
			return resource.retrieve(object);
		}
	};
}]);