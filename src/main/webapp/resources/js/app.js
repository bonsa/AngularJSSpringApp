'use strict';

var AngularJSSpringApp = {};

angular.module('AngularJSSpringApp', ['ui.router'])
.config(function ($stateProvider, $urlRouterProvider) {
   
	
	$stateProvider
	.state('day', {
		url:	'/day', 
        templateUrl: 'day/layout',
        controller: 'DayController'
    })
	.state('math', {
		url:	'/math', 
		templateUrl: 'math/layout',
        controller: 'MathController'
    });
    
	$urlRouterProvider.otherwise('day');
});

