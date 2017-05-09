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

        $scope.loanBook = function(id, borrowed) {
            if(!borrowed) {
                $scope.newLoan.bookId = id;
                $scope.view = "loan";
            } else {
                $scope.removalId.id = id;
                $scope.view = "loan";
            }
        }

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