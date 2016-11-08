'use strict';

angular.module('demo')
    .factory('SubcategoryService', function ($http) {
        return {
            loadSubcategoriesByCategory: function(categoryName) {
                return $http.get('/subcategory/search/' + categoryName).then(function(response) {
                    return response.data;
                  })
             }
            }
          });
