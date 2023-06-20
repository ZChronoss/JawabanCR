public class FullRectanglePrinter extends RectanglePrinter{

    public FullRectanglePrinter(Rectangle r) {
        super(r);
        //TODO Auto-generated constructor stub
    }
    
    public void print() {
        int height = getR().getHeight();
        int width = getR().getWidth();
        
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
