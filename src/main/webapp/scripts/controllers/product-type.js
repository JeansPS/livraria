app.controller('ProductTypesController', ['$scope', '$stateParams', '$location', 'ProductTypes',
    function($scope, $stateParams, $location, ProductTypes) {

        $scope.select = function(productType) {
          $scope.productType = angular.copy(productType);
          $scope.updateToggle = true;
        };

        $scope.cancelEdit = function() {
          $scope.productType = {};
          $scope.updateToggle = false;
        };

        $scope.create = function(isValid) {
            if ( isValid ) {
                $scope.productType.createdAt = new Date();
                var productTypes = new ProductTypes($scope.productType);
                productTypes.$save(function(response){
                   $scope.find();
                   $scope.productType = {};
                });
            }
        };

        $scope.update = function(isValid) {
            if ( isValid ) {
                var productTypes = new ProductTypes($scope.productType);
                productTypes.$update(function(response){
                    $scope.find();
                    $scope.productType = {};
                });
            }
        };

        $scope.findOne = function() {
            ProductTypes.get({
                productTypeId: $stateParams.productTypeId
            }, function(productType) {
               $scope.productType = productType;
            });
        };

        $scope.find = function() {
            ProductTypes.query(function(productTypes){
                $scope.productTypes = productTypes.content;
            });
            $scope.updateToggle = false;
        };

        $scope.remove = function() {
            $scope.productType.$remove(
                function() {
                    $location.path('productTypes');
                }
            )
        }
    }
]);
