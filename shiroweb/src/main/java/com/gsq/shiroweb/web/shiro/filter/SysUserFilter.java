package com.gsq.shiroweb.web.shiro.filter;

import com.gsq.shiroweb.service.UserService;
import com.gsq.shiroweb.constants.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by Administrator on 2017/10/21.
 */
public class SysUserFilter extends PathMatchingFilter {

    @Autowired
    private UserService userService;

    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {

        String username = (String) SecurityUtils.getSubject().getPrincipal();
        request.setAttribute(Constants.CURRENT_USER, userService.findByUsername(username));
        return true;
    }

}
