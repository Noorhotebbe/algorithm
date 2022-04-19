package com.algorithm.sort;

/**
 * @Version: 1.0
 * @Author: alice
 * @Date: 2022-04-19 14:33
 * @Description:
 */
public abstract class Sort<T extends Comparable<T>> {

    public abstract void sort(T[] nums);

    protected boolean compare(T v, T w){
        return v.compareTo(w) < 0;
    }

    public void swap(T[] a, int i, int j){
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
