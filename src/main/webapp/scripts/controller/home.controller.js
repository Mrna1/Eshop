'use strict';

angular.module('demo')
    .controller('HomeController', function (ProductService) {
        var vm = {};

        vm.products = [];

        vm.loadProducts = function() {
            ProductService.loadProducts().then(function (data) {
                vm.products = data;
            });
        };

        vm.deleteProduct = function(id) {
            ProductService.deleteProduct(id).then(function() {
                vm.loadProducts();
            });
        };

        vm.loadProducts();

        return vm;
    });