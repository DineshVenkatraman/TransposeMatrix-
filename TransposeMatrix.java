public class TransposeMatrix {
    public void trans()
    {
        int old[] []={{1,3,4},
                {2,4,3},
                {5,4,3}};
        int transpose[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                transpose[i][j]=old[j][i];
            }
        }
        System.out.println("The input old matrix ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(old[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("The output Transpose matrix ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
