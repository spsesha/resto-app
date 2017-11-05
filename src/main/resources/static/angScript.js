(function(){
    var app = angular.module('resto',[ ]);
    app.controller('MenuController',['$http','$scope',function($http,$scope){
      // ITEMS
      $scope.toggleMenu = function(){
        $http.get('http://localhost:8080/item').
            then(function(response) {
                $scope.items = response.data;
            });
        $scope.itemsShowing = !$scope.itemsShowing;
      };
      $scope.itemsShowing = false;

      // OREDERS
      $http.get('http://localhost:8080/order').
          then(function(response) {
              $scope.orders = response.data;
          });
      $scope.toggleOrders = function(){
        $scope.ordersShowing = !$scope.ordersShowing;
      };
      $scope.ordersShowing = false;

      //OREDER DETAILS
      $http.get('http://localhost:8080/orderdetails').
          then(function(response) {
              $scope.orderDetails = response.data;
          });
      $scope.toggleOrderDetails = function(){
        $scope.orderDetailsShowing = !$scope.orderDetailsShowing;
      };
      $scope.orderDetailsShowing = false;

      //TABLE DETAILS
      $http.get('http://localhost:8080/table').
          then(function(response) {
              $scope.tables = response.data;
          });
      $scope.toggleTables = function(){
        $scope.tablesShowing = !$scope.tablesShowing;
      };
      $scope.tableShowing = false;
    }]);

    app.controller('ItemController',['$http','$scope',function($http,$scope){
      $scope.item ={};
      $scope.addItem = function(name,price,category){
        var newData = {
          "name": name,
          "price": price,
          "category": category };
          $http({
            method: "POST",
            url: "http://localhost:8080/item",
            data: newData,
            headers : {
              'Content-Type' : 'application/json'
            }
          }).then(function(){
            console.log("Successfully created an order");
          }, function(){
            console.log("Cannot send request");
          });
      };

    }]);

})();
