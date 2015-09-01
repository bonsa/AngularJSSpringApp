'use strict';

angular.module('AngularJSSpringApp', [])
.config(['$routeProvider', function ($routeProvider) {
	
    $routeProvider.when('/day', {
        templateUrl: 'day/layout.html',
        controller: DayController
    });

    $routeProvider.when('/math', {
        templateUrl: 'math/layout.html',
        controller: MathController
    });
    
    $routeProvider.otherwise({redirectTo: '/day'});

}])
.run(function($rootScope) {
	$rootScope.pageClass = 'day';
});

