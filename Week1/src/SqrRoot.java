public class SqrRoot {
    public static void main(String[] args) {
        int num =100;
        int start =1, end=num;
        while((end/2 * end/2)>num){
            end /=2;
        }

        while((end/2 * end/2)<num){
            end = num/2;
        }

        System.out.println(start+"---"+end);

    }
}
