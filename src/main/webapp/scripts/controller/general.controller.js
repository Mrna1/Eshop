'use strict';

angular.module('demo')
    .controller('GeneralController', function (SubcategoryService, CategoryService, $scope) {
        var vm = {};

        vm.subcategories = [];

        vm.category = {
                    name: ''
                };

        vm.loadSubcategories = function() {
            SubcategoryService.loadSubcategories().then(function (data) {
                vm.subcategories = data;
            });
        };

        vm.loadCategories = function() {
            CategoryService.loadCategories().then(function (data) {
                vm.categories = data;
            });
        };

        vm.loadCategories();
        vm.loadSubcategories();
        return vm;
    });