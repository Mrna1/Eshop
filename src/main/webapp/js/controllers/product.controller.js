'use strict';

// tu by som odporucal deklarovat controller nasledovne:
// angular.module('eshop').controller(function([injectors eg. $scope, $http]) {})

var ProductController = function($scope, $http) {
    $scope.fetchCarsList = function() {
        $http.get('product/search/all').success(function(productList){
            $scope.cars = productList;
        });
    };

    $scope.findProductById = function(id) {
        $http.get('/product/search/' + id).success(function() {
            $scope.fetchCar();
        });
    };

    };

