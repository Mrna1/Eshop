'use strict';

angular.module('demo')
    .controller('GeneralController', function (CategoryService, ProductService, $scope, $state) {
        var vm = {};

        vm.category = {

        };


        vm.loadCategories = function () {
            CategoryService.loadCategories().then(function (data) {
                vm.categories = data;
            });
        };


        vm.goToSubcategoryPage = function (id) {
                $state.go("subcategory", {id : id})
        };

        vm.goToAllProductsPage = function () {
                $state.go("home")
        };

        vm.loadCategories();
        vm.goToAllProductsPage();

        return vm;
    });