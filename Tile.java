package test;
import java.util.Random;
public class Tile {
    public final char later;
    public final int score;
    private Tile(char later,int score){
        this.char=later;
        this.score=score;

    }
    @override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Tile)) return false;
        if (!super.equals(object)) return false;
        Tile tile = (Tile) object;
        return later == tile.later && score == tile.score;
    }
    @override
    public int hashCode() {
        return Objects.hash(super.hashCode(), later, score);
    }


    public static class Bag{
       private int[] laters;
       private Tile[] tiles;
       private int[] scores;
       private int currentAmount;
       private int[]constantlaters;
        private static Bag singleTone;


        private Bag() {
            this.currentAmount=98;
            this.laters=new int[]{9,2,2,4,12,2,3,2,9,1,1,4,2,6,8,2,1,6,4,6,4,2,2,1,2,1};
            this.tiles= new Tile[26];
            this.scores=new int[]{1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
            this.constantlaters=new int[]{9,2,2,4,12,2,3,2,9,1,1,4,2,6,8,2,1,6,4,6,4,2,2,1,2,1};
            for ( int i=0 ; i<26;i++){
                tiles[i]=new Tile('A'+1,scores[i]);
        }

    }
חמ
    public Tile getRand() {
            if (currentAmount==0){
                return null;
            }

        Random rand = new Random();
        int randomNumber = rand.nextInt(26);
        if(laters[randomNumber]==0){
            return null;

        }
        laters[randomNumber]=laters[randomNumber]-1;
        currentAmount--;
        return tiles[randomNumber];

    }
    public Tile getTile(char later){

            int indx=(int)later-"A";

        if(laters[indx]==0){
            return null;

        }
        laters[indx]=laters[indx]-1;
        currentAmount--;
        return tiles[indx];

    }

    public void put(Tile tile){
          char c=tile.later;
        if( laters[indx]+1 <= constantlaters[indx]){
            int indx=(int)c-'A';
            laters[indx]=laters[indx]+1;
            currentAmount++;

        }


    }
    public int size(){
            return  currentAmount;
    }
    public int getQuantities(){

            return this.laters.clone();
    }


    public static Bag getBag(){
            if (singleTone==null){
                singleTone=new Bag();

            }
        return singleTone;
    }

    }
}
