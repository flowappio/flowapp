'use strict';

/**
 * @ngdoc overview
 * @name wwwApp
 * @description
 * # wwwApp
 *
 * Main module of the application.
 */
var flowApp = angular.module('flowApp', ['ngAnimate','ngCookies','ngResource','ngRoute','ngSanitize','ngTouch']);

flowApp.config(function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'views/dashboard.html',
            controller: 'DashboardCtrl'
        })
        .otherwise({
            redirectTo: '/'
        });
});
