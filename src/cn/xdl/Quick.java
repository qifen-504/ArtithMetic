package cn.xdl;

public class Quick {
    public static void  quick(int[] arr,int left,int right){
        //计算中间元素下标并使用变量记录
        int p =(left+right)/2;
        //选择中间元素作为基准值单独保存起来
        int pivot = arr[p];
        //分别使用左右两边的元素依次与基准值比较大小,将小于基准值的放在左边,大于基准值的放在右边
        int i = left;
        int j =right;
        while (i<j){
            //若左边有元素并且左边元素小于基准值 则使用下一个元素与基准值比较
            while (i< p && arr[i] <pivot){
                i++;
            }
            //直到左边有元素但左边的元素不再小于基准值时将左边的元素赋值给p指向的位置,
            //            //p指向该元素原来的位置
            if (i<p){
                arr[p]=arr[i];
                p=i;
            }
            //若右边有元素并且右边元素大于等于基准值 则使用下一个元素跟基准值比较
            while (p<j && arr[j]>=pivot){
                j--;
            }
            //知道右边有元素但右边的元素不再大于基准值时,则将右边的元素赋值给p指向的位置,
            //p指向该元素原来的位置
            if (p<j){
                arr[p]=arr[j];
                p=j;
            }
        }
        //当左右两边的元素下标重合时,将基准值放在重合的位置
        arr[p]=pivot;
        //分别对左右两边的分组进行再次分组.使用递归
        //当左右两边的分组分别有至少两个元素才需要递归
        if (p-left>1){
            quick(arr,left,p-1);
        }
        if (right-p>1){
            quick(arr,p+1,right);
        }

    }
}
