app.factory('ProductTypes', ['$resource',
    function($resource) {
        return $resource('product-types/:productTypeId', {
            productTypeId: '@id'
        },
        {
            query: {

            },
            update: {
                method: 'PUT'
            }
        });
    }
]);
