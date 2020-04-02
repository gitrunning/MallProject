package com.ldgroup.ldmall.ldmallproductservice.common.utils;

import java.time.LocalDateTime;
import java.util.Comparator;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2019/12/20 11:40
 **/
public class MapKeyComparator implements Comparator<LocalDateTime> {
    @Override
    public int compare(LocalDateTime o1, LocalDateTime o2) {
        //参数o1,小于、等于或者大于o2 ,返回负整数、0或者正整数
        //返回负数则o1在前，正数则o2在前
        if (o1.isBefore(o2)){
            return -1;
        }else if (o1.isAfter(o2)){
            return 1;
        }else {
            return 0;
        }

    }
}
