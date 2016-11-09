'use strict';

angular.module('demo')
    .factory('SubcategoryService', function ($http) {
        return {
            loadSubcategoriesByCategory: function(categoryName) {
                return $http.get('/subcategory/search/comb/' + categoryName).then(function(response) {
                    return response.data;
                  })
             },
            loadSubcategoriesById: function(id) {
                return $http.get('/subcategory/search/' + id).then(function(response) {
                    return response.data;
                  })
             }
            }
          });
