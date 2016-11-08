'use strict';

angular.module('demo')
    .controller('HomeController', function (ProductService, $scope) {
        var vm = {};

        vm.product = {
                    name: ''
                };

        vm.loadAllProducts = function () {
                    ProductService.loadAllProducts().then(function (data) {
                        vm.products = data;
                    });
                };

        vm.loadAllProducts();

        return vm;
    });