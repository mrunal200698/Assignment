
public class DiamondNumberPattern {

	public static void main(String[] args) {
	int i,j,k,l;
	for(i = 1; i <= 4; i++)
    {
        int n = 4;
        for(j = 1; j<= n - i; j++) 
        { 
        	System.out.print(" "); 
        } 
        for(k = i; k >= 1; k--)
        {
            System.out.print(k);
        }
        for(l = 2; l <= i; l++)
        { 
        	System.out.print(l); 
        } 
        System.out.println(); 
    } 
	for(i = 3; i >= 1; i--)
    {
        int n = 3;
        for(j = 0; j<= n - i; j++)
        { 
        	System.out.print(" "); 
        } 
        for(k = i; k >= 1; k--)
        {
            System.out.print(k);
        }
        for(l = 2; l <= i; l++)
        {
            System.out.print(l);
        }
        System.out.println();
    }
   
	}
}
