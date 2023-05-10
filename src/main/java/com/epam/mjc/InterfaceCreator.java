package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> {
            List<Integer> list = new ArrayList<>();
            for(int i =0; i < arg.size(); i ++){
                list.add(arg.get(i)/divider);
            }
            return list;
        };
    }
}
