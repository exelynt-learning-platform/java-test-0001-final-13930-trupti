public class ConcentricNumberSquarePattern{
    public static void main(String args[]){
        int n = 4;
        int size = 2*n -1; // 7X7 grid

        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                int top = i;
                int left = j;
                int bottom = size - i +1;
                int right = size - j + 1;
                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n-minDistance+1)+" ");
            }
            System.out.println();
        }
    }
}