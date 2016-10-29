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
                        controller: 'SubcategoryController as subcategoryController'
                    }
                }
            })
        $stateProvider
            .state('category_1.1', {
                url: '/category_1.1',
                views: {
                    'content': {
                        templateUrl: 'html/category_1.1.html',
                    }
                }
            });
    });