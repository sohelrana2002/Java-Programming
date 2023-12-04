public class JFrame {
    private String title;
    private int width, height;
    private boolean visible;

    public JFrame(){
       title = "Nothing";
       width = 0;
       height = 0;
       visible = false;
    }

    public JFrame(String title){
        this.title = title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setSize(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void setVisible(boolean visible){
        this.visible = visible;
    }

    public String toString(){
        return(
            "JFrame[Title: " + title + ", Width: " + width + ", Height: " + height + ", Visible: " + visible + "]"
        );
    }
}
