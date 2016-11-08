'use strict';

angular.module('demo')
    .config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise("/");

        $stateProvider
            .state('home', {
                 url: 'home',
                 views: {
                     'content': {
                         templateUrl: 'html/home.html',
                         controller: 'HomeController as homeContoller'
                     }
                 }
            })
        $stateProvider
            .state('subcategory', {
                url: 'home/subcategory/:id',
                views: {
                    'content': {
                        templateUrl: 'html/subcategory.html',
                    }
                }
             });
    });