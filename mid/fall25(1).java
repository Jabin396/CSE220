package mid;

static int[][] blockEnergySum( int[][] grid, String[][] directions ){
    int row=grid.length;
    int col=grid[0].length;

    int[][] engr=new int[row][col];
    for(int i=0;i<=row-1;i++){
        for(int j=0;j<=col-1;j++){
            int sum=0;
            int x=i;
            int y=j;

            while(x>=0 && x<row && y>=0 && col>y){
                if(directions[i][j].equals("NE")){
                    x--;
                    y++;
                }

                else if(directions[i][j].equals("NW")){
                    x--;
                    y--;
                }

                else if(directions[i][j].equals("SE")){
                    x++;
                    y++;
                }

                else if(directions[i][j].equals("SW")){
                    x++;
                    y--;
                }
            }

            engr[i][j]=sum;
        }
    }
    result engr;
}
