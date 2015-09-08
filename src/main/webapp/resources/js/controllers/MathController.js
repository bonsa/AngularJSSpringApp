'use strict';

angular.module('AngularJSSpringApp')
.controller('MathController',[ '$scope', '$http', function($scope, $http) {

	$scope.number = {
			value : '1000',
			pattern : /^[0-9]+$/
		};
	
	$scope.getFactAboutNumber = function() {
		$http
		.get('math/' + $scope.number.value)
		.success(function(description) {
			$scope.description = description;
		});
	};
	
}]);