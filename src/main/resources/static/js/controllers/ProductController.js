'use strict';

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

