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
                    }
                }
            })
        $stateProvider
            .state('eshop', {
                url: '/eshop',
                views: {
                    'content': {
                        templateUrl: 'html/eshop.html',
                        controller: 'GeneralController as generalController'
                    }
                }
            })
        $stateProvider
            .state('subcategory', {
                url: '/subcategory/:id',
                views: {
                    'content': {
                        templateUrl: 'html/subcategory.html',
                        controller: 'GeneralController as generalController'

                    }
                }
            });
    });