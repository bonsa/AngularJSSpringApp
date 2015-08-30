'use strict';

var DayController = function($scope, $http) {
	 $scope.dayInYear = {
		        day: '1',
		        pattern: /^([1-9]|1[0-9]|2[0-9]|3[0-1])$/
		      };
	 
	 $scope.monthInYear = {
		        month: '3',
		        pattern: /^([1-9]|1[0-2])$/
		      };

};