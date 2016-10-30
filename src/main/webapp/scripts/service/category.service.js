'use strict';

angular.module('demo')
    .factory('CategoryService', function ($http) {
        return {
            loadCategories: function () {
                return $http.get('/category/search/all').then(function(response) {
                    return response.data;
                });
            }
        }
    });