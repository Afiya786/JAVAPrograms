class HelloWorld {
    public static void main(String[] args) {
        int[][] arr={
             {7,2,3},
            {5,6,7},
            {9,10,11}
        };
        
        
        System.out.println(min(arr));
        
    }
    
    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int row=0; row<arr.length; row++){
            for(int col=0; col < arr[row].length; col++){
                if(arr[row][col]<min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}
    
    
    
