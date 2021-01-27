package com.weichuang.ticket.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.weichuang.ticket.service.TicketService;
import org.springframework.stereotype.Component;

/**
 * 基本包下面的接口的实现类中标记dubbo下面的@Service注解的类
 * com.weichuang.ticket.service.impl.TicketServiceImpl 注册到zk中
 */
@Service
@Component
public class TicketServiceImpl implements TicketService{


    @Override
    public String getTicket() {
        return "《厉害了，我的国》";
    }
}
