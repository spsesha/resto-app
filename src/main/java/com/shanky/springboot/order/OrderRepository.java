package com.shanky.springboot.order;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderInfo,Integer> {

}
