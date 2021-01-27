package com.weichuang.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.weichuang.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //RPC远程调用技术，来获取售卖的票 @Reference 注解可以从zk的注册中心中读取服务
    @Reference
    TicketService ticketService;
    @RequestMapping("/buyTicket")
    public String buyTicket(String name){
        return name + "购买了" + ticketService.getTicket();
    }
}
