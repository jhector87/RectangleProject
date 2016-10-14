/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleproject;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;



/**
 *
 * @author jonathanhector
 * 
 * creates the scene and scene Title
 * 
 */
public class RectangleProject extends Application {
    
    Shape rect1;
    Shape rect2;
    
private void setScene(Stage stage) {
    Parent root = new Group();
   Scene scene = new Scene(root, 600, 800);

   stage.setScene(scene);
    stage.setTitle("Two Rectangles Not Behaving!!!");
    stage.show();

        /**
         * Creates the rectangles and gives it its dimensions.
         * This part fills the rectangles with Light Grey color.
         */
      rect1 = new Rectangle(10,10,40,50);
      rect1.setFill (Color.LIGHTGREY);
      
       rect2 = new Rectangle(20,35,40,50);
      rect2.setFill (Color.LIGHTGREY);    

    }
/**
 * tell the rectangle behavior
 */

    private Shape rectangleBehaviour (){
        Shape rectUnion = Shape.union(rect1, rect2);
       rectUnion = rectUnion.setFill(Color.VIOLET);
        
       Shape rectIntersect = Shape.intersect(rect2, rect2);
       rectIntersect = rectIntersect.setFill(Color.BLUE);
        
        Shape rectSubtract = Shape.subtract(rect1, rect1);
        Shape rectSubtract = rectSubtract.setFill(Color.YELLOW);  
        return rectSubtract;
    }
    /**
     * @param args the command line arguments
     */

        /**
         * sets the titles stating determine the outcome.
         */
    private title(){
        Text title1 = new Text(20, 5, "Sets intersection");
title1.setFont(new Font(24));
title1.setTextOrigin(VPos.TOP);
rootNode.getChildren().add(title1)
        launch(args);
        
        Text title2 = new Text(20, 5, "Sets union");
title1.setFont(new Font(24));
title1.setTextOrigin(VPos.MIDDLE);
rootNode.getChildren().add(title2);
        launch(args);
        
        Text title3 = new Text(20, 5, "Sets symmetrical difference");
title1.setFont(new Font(24));
title1.setTextOrigin(VPos.BOTTOM);
rootNode.getChildren().add(title3);
        launch(args);
       
        }
        
    public static void main(String[] args) {      
            Application.launch(args);   
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
