import greenfoot.*;


public class scores extends Actor
{
    private static scores instance;
    private int[] topscores;
    public scores()
    {
        topscores = new int[10];
        for(int i=0;i<10;i++){
            topscores[i] = 0;
        }
    }
    public static scores getinstance() {
        if (instance == null) {
            instance = new scores();
        }
        return instance;
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

