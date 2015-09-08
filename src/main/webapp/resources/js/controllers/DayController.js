'use strict';

angular.module('AngularJSSpringApp')
.controller('DayController',['$rootScope', '$scope', '$http', function($rootScope, $scope, $http) {
	
	$rootScope.pageClass = 'day';
	
	$scope.dayOfMonth = {
		day : '1',
		pattern : /^([1-9]|1[0-9]|2[0-9]|3[0-1])$/
	};

	$scope.monthOfYear = {
		month : '3',
		pattern : /^([1-9]|1[0-2])$/
	};

	$scope.getFactAboutDay = function() {
		$http
		.get('day/' + $scope.dayOfMonth.day + '/' + $scope.monthOfYear.month)
		.success(function(description) {
			$scope.description = description;
		});
	};
	
}]);