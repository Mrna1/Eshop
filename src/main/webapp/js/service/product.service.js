'use strict';

angular.module('eshop')
    .factory('ProductService', function ($http) {
        return {
            getAll: function() {
                $http.get('product/search/all').success(function(data){
                    return data;
                });
            },

            findById: function(id) {
                $http.get('/product/search/' + id).success(function(data) {
                    return data;
                });
            }
        };
    });