public class AlternatingTriangle{
    public static void main(String args[]){
        int rows = 6;
        
        for(int i=1;i<=rows;i++){
            int count=1;
            if(i%2==0) count = 0;
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count = (count==1)?0:1;
            }
        }
    }
}