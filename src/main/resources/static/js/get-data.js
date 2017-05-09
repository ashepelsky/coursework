angular.module('general-data', [])
    .controller('home', function($scope, $http) {
        $http.get('/api/books').success(function(response) {
            $scope.booksModel = response;
            $scope.view = "books";
            $scope.newBook = {};
            $scope.removalId = {};
            $scope.newLoan = {};
        })

        $http.get('/api/loans').success(function(response) {
            $scope.loansModel = response;
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

        $scope.createBook =  function() {

            $http({
                  method: 'POST',
                  url: "/api/books",
                  data: $scope.newBook
            }).success(function(response) {
                 window.location.reload();
            });
        };

        $scope.deleteBook =  function() {
            $http({
                  method: 'DELETE',
                  url: "/api/books/" + $scope.removalId.id,
            }).success(function(response) {
                 window.location.reload();
            });
         };

        $scope.createLoan =  function() {
           $scope.newLoan.borrowed = true;
           $http({
                 method: 'POST',
                 url: "/api/loans",
                 data: $scope.newLoan
           }).success(function(response) {
                window.location.reload();
           });
        };

        $scope.unborrow =  function() {
           $http({
                 method: 'DELETE',
                 url: "/api/loans/" + $scope.removalId.id,
           }).success(function(response) {
                window.location.reload();
           });
        };

    })