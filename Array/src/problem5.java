public class problem5 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int l = arr.length;
        int temp;
        for(int i = 0;i<l/2;i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element:arr){
            System.out.println(element);
        }
        int max = Integer.MIN_VALUE;
        for(int e:arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println();
        System.out.println(max);
        int min = Integer.MAX_VALUE;
        for(int e:arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println();
        System.out.println(min);
    }
}
