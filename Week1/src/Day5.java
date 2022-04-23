public class Day5 {

    void solve(){
        int i=1;
        int n=10;
        while(i<n){
            int x=i;
            while(x-->0){
                System.out.println(x);
            }
            i++;
        }
    }

    public static void main(String[] args) {
       Day5 d= new Day5();
       d.solve();
    }
}
