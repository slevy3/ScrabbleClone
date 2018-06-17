package com.Stephen;

public class pointValues {

    int[] pointsArray = {1,2,3,4,5,8,10,0};
    char[] charsArray = {'e','a','i','o','n','r','t','l','s','u','d','g','b','c','m','p','f','h','v','w','y','k','j','x','q','z',' '};
    int [] numberOf = {12,9,9,8,6,6,6,4,4,4,3,2,2,2,2,2,2,2,2,2,1,1,1,1,1,2,2};

    public Tile makeTiles(){

        //ToDo: Extend loop to iterate over each letter for the numberOf
        //ToDo: Make A Bag Of Tiles
        for (int i = 0; i < numberOf[i]; i++){
            Tile tile = new Tile();
            tile.letter = charsArray[i];
            if (charsArray[i]== 'e' || charsArray[i] == ('a') ||
            charsArray[i] == 'i' || charsArray[i] == ('o') || charsArray[i] == ('n') ||
            charsArray[i] == ('r') || charsArray[i] == ('t') || charsArray[i] == ('l') ||
                    charsArray[i] == ('s') || charsArray[i] == ('u')){
                tile.points = 1;
            }
            if (charsArray[i] == 'd' || charsArray[i] == 'g'){
                tile.points = 2;
            }
            if (charsArray[i] == 'b' || charsArray[i] == 'c' || charsArray[i] == 'm' || charsArray[i] == 'p'){
                tile.points = 3;
            }
            if (charsArray[i] == 'f' || charsArray[i] == 'h' || charsArray[i] == 'v' || charsArray[i] == 'w'
                    || charsArray[i] == 'y'){
                tile.points = 4;
            }
            if (charsArray[i] == 'k'){
                tile.points = 5;
            }
            if (charsArray[i] == 'j' || charsArray[i] == 'x'){
                tile.points = 8;
            }
            if (charsArray[i] == 'q' || charsArray[i] == 'z'){
                tile.points = 10;
            }
        }


        return null;
    }


}



