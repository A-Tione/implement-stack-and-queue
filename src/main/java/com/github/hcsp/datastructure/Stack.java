package com.github.hcsp.datastructure;

import java.util.ArrayList;

public class Stack {
    ArrayList list = new ArrayList<>();
    // 将一个元素压入栈内
    public void push(int value) {
        list.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return (int) list.remove(list.size() - 1);

    }
}
