public class ForLoop {
    public static void main(String[] args) {
        //lets make pattern of numbers by using for loop 
        // syntax is for(initialization;condition;increment or decrement)
        int i,j;
        for(i=1;i<=4;i++)//four rows
        {
            for(j=1;j<=4;j++)//four column
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //lets make other pattern
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //lets try to make box using dollar symbol
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=4;j++)
            {
                if((i==2 && j==2)||(i==2 && j==3)||(i==3 && j==2)||(i==3 && j==3))
                {
                    System.out.print("  ");
                    continue;
                }
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
