'use strict';

angular.module('demo')
    .factory('SubcategoryService', function ($http) {
        return {
            loadSubcategories: function () {
                return $http.get('/subcategory/search/all').then(function(response) {
                    return response.data;
                });
            },
            loadSubcategoriesByCategory: function(categoryName) {
                return $http.get('/subcategory/search/' + categoryName).then(function(response) {
                    return response.data;
                  })
             }
            }
          });
