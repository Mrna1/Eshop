'use strict';

angular.module('demo')
    .controller('SubcategoryController', function (SubcategoryService) {
        var vm = {};

        vm.subcategories = [];

        vm.loadSubcategories = function() {
            SubCategoryService.loadSubcategories().then(function (data) {
                vm.subcategories = data;
            });
        };

        return vm;
    });