package ontap_lan2.bai3;

public class Bai3_ArrayTwo {
    public static void main(String[] args) {
        int[][] arr={{1,2},{2,4},{3,5},{4,5}};
        average(arr);

    }
    public static void average(int[][] arr){
        int count=0,sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] %2==0 ){
                    sum+=arr[i][j];
                    count++;
                }
            }
        }
        System.out.println("Trung bình cộng số chẵn là :" +sum/count);
    }
}
