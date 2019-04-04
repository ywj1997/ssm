package cn.itcast.service.impl;

import cn.itcast.dao.OrderDao;
import cn.itcast.domain.Orders;
import cn.itcast.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrderDao orderDao;
    @Override
    public List<Orders> findAll() throws Exception {
        return orderDao.findAll();
    }
}
