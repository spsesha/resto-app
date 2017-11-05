
angular.module('REST', [])
.controller('Item', ['$scope', '$http', function($scope, $http) {
    $http.get('http://localhost:8080/item').
        then(function(response) {
            $scope.items = response.data;
        });
    $scope.showItems= function (){
        $scope.isItemShowing = !$scope.isItemShowing;
    };
    $scope.isItemShowing = false;

    $scope.addItemToCart=function (itemNumber){

      var data = {
        id: 1,
        tableID: 1,
        itemId: itemNumber,
        itemQuandity: 2
      };
      $http({
        method: "POST",
        url: "http://localhost:8080/orderdetails",
        data: data,
        headers : {
          'Content-Type' : 'application/json'
        }
      }).then(function(){
        console.log("Successfully created an order");
      }, function(){
        console.log("Cannot send request");
      });
      // $http({
      //   method : "POST",
      //   url : "employees",
      //   data : angular.toJson($scope.form),
      //   headers : {
      //       'Content-Type' : 'application/json'
      //   }
      // }).then( _success, _error );
      console.log(data);
    };


}]);
