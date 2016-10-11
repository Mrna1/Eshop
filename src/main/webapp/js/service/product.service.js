'use strict';

angular.module('eshop')
    .factory('ProductService', function ($http) {
        return {
            getAll: function() {
                return $http.get('product/search/all');
            },

            findById: function(id) {
                return $http.get('/product/search/' + id);
            }
        };
    });