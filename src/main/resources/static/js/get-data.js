angular.module('general-data', [])
    .controller('home', function($scope, $http) {
        $http.get('/api/books').success(function(response) {
            $scope.model = response;
        });

        $scope.getX =  function() {
            $http({
                method: 'GET',
                url: "/api/" + $scope.x
           }).success(function(response) {
               $scope.xData = response;

               $scope.xData.functionValue = Math.cos(-2*$scope.x)/4;
               $scope.xData.partialError = Math.abs($scope.xData.theoreticalError)

               //out errors


           });
        };
    })