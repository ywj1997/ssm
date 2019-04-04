package cn.itcast.dao;

import cn.itcast.domain.Orders;

import java.util.List;

public interface OrderDao {
    List<Orders> findAll()throws Exception;
}
