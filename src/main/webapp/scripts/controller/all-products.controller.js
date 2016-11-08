'use strict';

angular.module('demo')
    .controller('AllProductsController', function (ProductService, $scope) {
        var vm = {};

        vm.product = {
                    name: ''
                };



        vm.loadAllProducts = function () {
        console.debug('neco');
                    ProductService.loadAllProducts().then(function (data) {
                        vm.products = data;
                    });
                };


        vm.loadAllProducts();

        return vm;
    });