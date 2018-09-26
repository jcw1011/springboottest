package com.jcw.service.impl;

import com.jcw.entity.User;
import com.jcw.mapper.UserMapper;
import com.jcw.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jin Chenwu
 * @since 2018-09-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
