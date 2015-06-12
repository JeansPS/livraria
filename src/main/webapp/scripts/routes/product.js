app.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){

    $urlRouterProvider.otherwise('/products');

    $stateProvider.state('products', {
        url: '/products',
        templateUrl: 'views/product/index.html'
    }).state('product-create',{
        url: '/products/create',
        templateUrl: 'views/product/create.html'
    }).state('products-view',{
        url: '/products/:productId',
        templateUrl: 'views/product/view.html'
    }).state('products-edit',{
        url: '/products/:productId/edit',
        templateUrl: 'views/product/edit.html'
    });
}]);