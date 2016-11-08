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
                        controller: 'GeneralController as generalController'
                    }
                }
            })
            .state('home.subcategory', {
                url: 'home/subcategory/:id',
                views: {
                    'content': {
                        templateUrl: 'html/subcategory.html',
                    }
                }
            })
            .state('home.all-products', {
                 url: 'home/all-products',
                 views: {
                     'content': {
                         templateUrl: 'html/all_products.html',
                         controller: 'AllProductsController as allProductsContoller'
                     }
                 }
             });
    });