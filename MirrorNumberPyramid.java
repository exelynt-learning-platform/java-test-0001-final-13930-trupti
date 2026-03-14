public class MirrorNumberPyramid{
    public static void main(String args[]){
        int rows = 5;
        for(int i=1;i<=rows;i++){
            //print the ascending part (1 to i)
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            //print the descending part (i-1 to 1)
            for(int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
        }
    }
}