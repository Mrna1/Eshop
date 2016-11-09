'use strict';

angular.module('demo')
    .controller('SubcategoryController', function (ProductService, SubcategoryService, $scope, $location) {
        var vm = {};


        vm.loadProductsBySubcategoryId = function () {
                    var url = $location.$$absUrl;
                    var id = url.slice(-1);
                    ProductService.loadProductsBySubcategoryId(id).then(function (data) {
                        vm.products = data;
                    });
                };
        vm.loadSubcategoryById = function () {
                    var url = $location.$$absUrl;
                    var id = url.slice(-1);
                    SubcategoryService.loadSubcategoriesById(id).then(function (data) {
                        vm.subcategory = data;
                        console.log('sub',vm.subcategory);
                    });
                };

        vm.loadSubcategoryById();
        vm.loadProductsBySubcategoryId();

        return vm;
    });