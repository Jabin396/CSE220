package mid;

public static int[][] restoreImage(int[][] image){
    int R=image.length;
    int C=image[0].length;

    int[][] newImage=new int[R][C];
    for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            if(image[i][j]!=-1){
                newImage[i][j]=image[i][j];
            }

            else{
                int sum=0;
                int count=0;

                for(int x=i-1;x<=i+1;x++){
                    for(int y=j-1;x<=j+1;j++){
                        if(x>=0 && x<R && y>=0 && y<C && !(x==i && y==j)){
                        if(image[x][y]!=-1){
                            sum=sum+image[x][y];
                            count++;
                        }
                    }
                    }
                }
                if(count==0){
                    newImage[i][j]=0;
                }
                else{
                newImage[i][j]=sum/count;
                }
            }
        }
    }

    return newImage;
}
