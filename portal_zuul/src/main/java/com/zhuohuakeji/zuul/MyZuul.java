package com.zhuohuakeji.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;

public class MyZuul extends ZuulFilter {
    @Override
    public String filterType() {
        //拦截策列
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        //先使用那个拦截
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String parameter = request.getParameter("");
        return null;
    }
}
