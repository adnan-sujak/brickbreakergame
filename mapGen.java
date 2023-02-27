import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.BasicStroke;

public class mapGen {
    

    public int map [][];
    public int brickWidth;
    public int brickHeight;


    public void mapGenerator (int row, int col){

        map = new int [row] [col]; //setting up map using parameters of the function
        
        for(int []map1 : map ){ //for each map1 in map
            for(int j=0; j<map1[0].length; j++){ //traverse map1 and set everything equal to one
                map1[j] =1;

            }
        }

        brickWidth = 540/col; //setting the width of a brick to 540/col
        brickHeight = 540/row;


    }


    public void draw(Graphics2D g){
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                if(map[i][j] >0){ //traversing the map; if it exists we set colors and and fill/draw the rectangles
                    g.setColor(Color.red);
                    g.fillRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
                    g.setColor(Color.black);
                    g.drawRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
                }
            }
        }

    }

    public void setBrickValue(int value, int row, int col){

        map[row][col] = value;


    }


}
