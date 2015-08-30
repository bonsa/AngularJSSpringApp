'use strict';

var DayController = function($scope, $http) {
	$scope.dayOfYear = {
		day : '1',
		pattern : /^([1-9]|1[0-9]|2[0-9]|3[0-1])$/
	};

	$scope.monthOfYear = {
		month : '3',
		pattern : /^([1-9]|1[0-2])$/
	};

	$scope.getDayDescription = function() {
		$http
		.get('day/' + $scope.dayOfYear.day + '/' + $scope.monthOfYear.month)
		.success(function(description) {
			$scope.description = description;
		});
	};

};