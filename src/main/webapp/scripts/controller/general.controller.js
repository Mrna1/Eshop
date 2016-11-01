'use strict';

angular.module('demo')
    .controller('GeneralController', function (SubcategoryService, CategoryService, $scope, $state) {
        var vm = {};

        vm.category = {
            name: ''
        };

        vm.loadCategories = function () {
            CategoryService.loadCategories().then(function (data) {
                vm.categories = data;
            });
        };

        vm.goToSubcategoryPage = function (id) {
                $state.go("subcategory", {id : id})

        };

        vm.loadCategories();

        return vm;
    });