import greenfoot.*;


public class scores extends Actor
{
    private static scores mainscores;
    private int[] topscores;
    public scores()
    {
        topscores = new int[10];
        for (int i=0;i<topscores.length;i++){
            topscores[i]=-1;
            }
        }
    public static scores getmainscores() {
        if (mainscores == null) {
            mainscores = new scores();
        }
        return mainscores;
    }
    public void addscore(int newscore){
        for(int i=0;i<9;i++){
            if(newscore>topscores[i]){
            
                for(int k=8;k>i;k--){
                    topscores[k]=topscores[k-1];
                }
                topscores[i] = newscore;
                break;
            }
        }
    }
     public int[] getscores() {
        return topscores.clone();
    }
    
}

