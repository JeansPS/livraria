app.config(['$stateProvider', function($stateProvider){

    $stateProvider.state('product-types', {
        url: '/product-types',
        templateUrl: 'views/product-type/index.html'
    });
}]);