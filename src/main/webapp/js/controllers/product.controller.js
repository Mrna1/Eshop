'use strict';

angular.module('eshop')
    .controller('ProductController', function ($scope, ProductService) {

        $scope.fetchCarsList = ProductService.getAll();

        $scope.findProductById = ProductService.findById(1);

    });
