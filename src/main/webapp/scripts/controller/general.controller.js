'use strict';

angular.module('demo')
    .controller('GeneralController', function (SubcategoryService, CategoryService) {
        var vm = {};

        vm.subcategories = [];

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
//need to be solve
        vm.loadSubcategoriesByCategory = function(categoryName) {
            SubcategoryService.loadSubcategoriesByCategory(categoryName).then(function (data) {
                vm.categoriesSorted = data;
            });
        };

        vm.loadCategories();
        vm.loadSubcategories();
        return vm;
    });