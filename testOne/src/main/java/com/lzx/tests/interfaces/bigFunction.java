package com.lzx.tests.interfaces;

/**
 * @author liangzexu
 * @date 2018/6/24 下午9:16
 */
@FunctionalInterface
public interface bigFunction<T, U, V, S> {
    S apply(T t, U u, V v);
}
