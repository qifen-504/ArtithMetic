package cn.xdl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,87,8,9,1,4,5,11111};
        GuluGulu.maopao(arr);
        System.out.print("排序完: ");
        for (int i:
             arr) {
            System.out.print(i+" ");
        }
    }
}
