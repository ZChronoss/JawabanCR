public class BorderRectanglePrinter extends RectanglePrinter{

    public BorderRectanglePrinter(Rectangle r){
        super(r);
    }
    
    public void print() {
        int height = getR().getHeight();
        int width = getR().getWidth();
        
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print(
                        j == 0 || j == width-1 || 
                        i == 0 || i == height-1 ? "*" : " ");
            }
            System.out.println("");
        }
    }
    
}
