package cn.xdl;

public class GuluGulu {
    public static void maopao(int[]arr){
        for (int i =1;i<arr.length;i++){
            //声明一个flag来作为本轮比较中是否发生交换的标志
            boolean flag =true;
            for (int j =0;j<arr.length-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if (flag) break;
        }
    }
}
