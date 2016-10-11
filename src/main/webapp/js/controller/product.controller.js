'use strict';

angular.module('eshop')
    .controller('ProductController', function ($scope, ProductService) {

        var vm = this;

        vm.someProperty = "Hello world";
        ProductService.getAll().success(function (data) {
            console.debug(data);
            vm.fetchCarsList = data;
        });


        return vm;
    });

