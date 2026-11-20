package mid;

public static void decode(char[][] matrix){
    for(int i=0;i<matrix.length-1;i++){
        for(int j=0;j<matrix[0].length-1;j+=2){
            if(matrix[i][j]!='#'){
                System.out.println(matrix[i][j]);
                matrix[i][j]='#';
            }

            if(matrix[i+1][j+1]!='#'){
                System.out.println(matrix[i+1][j+1]);
                matrix[i+1][j+1]='#';
            }
            
            if(matrix[i][j+1]!='#'){
                System.out.println(matrix[i][j+1]);
                matrix[i][j+1]='#';
            }

            if(matrix[i+1][j]!='#'){
                System.out.println(matrix[i+1][j]);
                matrix[i+1][j]='#';
            }
        }
    }
}
