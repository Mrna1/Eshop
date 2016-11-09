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
                         controller: 'HomeController as homeContoller'
                     }
                 }
            })
        $stateProvider
            .state('subcategory', {
                url: '/subcategory/:id',
                views: {
                    'content': {
                        templateUrl: 'html/subcategory.html',
                        controller: 'SubcategoryController as subcategoryController'
                    }
                }
             });
    });