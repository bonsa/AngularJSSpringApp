'use strict';

var AngularJSSpringApp = {};

var App = angular.module('AngularJSSpringApp', []);

App.config(['$routeProvider', function ($routeProvider) {
	
    $routeProvider.when('/day', {
        templateUrl: 'day/layout',
        controller: DayController
    });

    $routeProvider.when('/math', {
        templateUrl: 'math/layout',
        controller: MathController
    });
    
    $routeProvider.otherwise({redirectTo: '/day'});

}]);

