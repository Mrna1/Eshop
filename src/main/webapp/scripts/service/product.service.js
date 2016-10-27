'use strict';

angular.module('demo')
    .factory('ProductService', function ($http) {
        return {
            loadProducts: function () {
                return $http.get('/api/loadProducts').then(function(response) {
                    return response.data;
                });
            },

            saveProduct: function(product) {
                return $http.post('/api/createProduct', product).then(function(response) {
                    return response;
                });
            },

            deleteProduct: function(productId) {
                return $http.delete('/api/deleteProduct/' + productId).then(function(response) {
                    return response;
                })
            }
        }
    });