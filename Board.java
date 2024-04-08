package test;


public class Board {

    private static  Board single;
    private Tile[][] newBoard;

    private  Board(){
        newBoard=new Tile[15][15];

    }
    public Board getBoard(){
        if(this.single==null){
            single=new Board();
        }
        return single;
    }

}
