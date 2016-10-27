'use strict';

angular.module('demo')
    .config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise("/");

        $stateProvider
            .state('home', {
                url: '/',
                views: {
                    'content': {
                        templateUrl: 'html/home.html',
                        controller: 'HomeController as homeController'
                    }
                }
            })
            .state('state1', {
                url: '/123',
                views: {
                    'content': {
                        templateUrl: 'html/new.product.html',
                        controller: 'NewProductController as newProductController'
                    }
                }
            });
    });