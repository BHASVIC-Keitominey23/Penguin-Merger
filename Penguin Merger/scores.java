import greenfoot.*;


public class scores extends Actor
{
    private static scores mainscores;//Stores a specific scores array
    private int[] topscores;//The array that stores the scores
    //Constructor for scores
    public scores()
    {
        topscores = new int[10];
        for (int i=0;i<topscores.length;i++)
        {
            topscores[i]=-1;
        }
    }
    //Returns the array unless there is no array. It defines a new array if there isn't.
    public static scores getmainscores() {
        if (mainscores == null) {
            mainscores = new scores();
        }
        return mainscores;
    }
    //This procedure takes the new score and adds it to the specific static score array and places it in the correct in the correct position. 
    public void addscore(int newscore)
    {
        for(int i=0;i<10;i++)
        {
            if(newscore>topscores[i])
            {
            
                for(int k=9;k>i;k--)
                {
                    topscores[k]=topscores[k-1];
                }
                topscores[i] = newscore;
                break;
            }
        }
    }
    //Returns the scores in the array.
     public int[] getscores() 
    {
        return topscores.clone();
    }
    
}

