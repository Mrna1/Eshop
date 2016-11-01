'use strict';

angular.module('demo')
    .controller('GeneralController', function (SubcategoryService, CategoryService, $scope) {
        var vm = {};

        vm.category = {
            name: ''
        };

        vm.loadCategories = function () {
            CategoryService.loadCategories().then(function (data) {
                vm.categories = data;
            });
        };

        vm.loadCategories();

        return vm;
    });