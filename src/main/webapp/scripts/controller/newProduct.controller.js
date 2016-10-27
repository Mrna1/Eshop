'use strict';

angular.module('demo')
    .controller('NewProductController', function (ProductService, $state) {
        var vm = {};

        vm.error = null;
        vm.product = {
            name: ''
        };

        vm.createProduct = function () {
            if (vm.product.name != null && vm.product.name.length > 0) {
                ProductService.saveProduct(vm.product).then(function() {
                    $state.go("home");
                });
            } else {
                vm.error = 'Product must have name.';
            }
        };

        return vm;
    });