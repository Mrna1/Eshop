'use strict';

angular.module('eshop')
    .controller('ProductController', function ($scope, ProductService) {

        var vm = this;

        vm.someProperty = "Hello world";
        vm.fetchCarsList = ProductService.getAll();
        // vm.findProductById = ProductService.findById(1);

        return vm;
    });

