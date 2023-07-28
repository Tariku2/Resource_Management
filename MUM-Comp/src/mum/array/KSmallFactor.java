package mum.array;

public class KSmallFactor {
    private static int u,v;

    static boolean hasKSmallFactors(int k, int n){
        n = u * v;

        if(u<k & v<k)
        {
            return true;
        }
        if(u!=0 & v!=0){
            return false;
        }
        return false;
    }
}
