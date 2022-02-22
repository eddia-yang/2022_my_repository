package com.project.auth.service.impl;

import com.mybatis.commom.base.impl.BaseServiceImpl;
import com.project.auth.entity.XcUser;
import com.project.auth.mapper.XcUserMapper;
import com.project.auth.service.IXcUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author auto
 * @since 2022-02-17
 */
@Service
public class XcUserServiceImpl extends BaseServiceImpl<XcUserMapper, XcUser> implements IXcUserService {

}
