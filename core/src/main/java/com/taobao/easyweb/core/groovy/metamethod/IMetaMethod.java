package com.taobao.easyweb.core.groovy.metamethod;

/**
 * Created with IntelliJ IDEA.
 * User: jimmey
 * Date: 13-3-26
 * Time: ����11:30
 * To change this template use File | Settings | File Templates.
 */
public interface IMetaMethod {

    public Object invoke(final String methodName, final Object[] arguments);

}
