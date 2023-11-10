public class Color{
    private String colorName;
    private String hexValue;

    public Color(String colorName, String hexValue){
        this.colorName = colorName;
        this.hexValue = hexValue;
    };

    public void setColorName(String colorName){
        this.colorName = colorName;
    }

    public void setHexValue(String hexValue){
        this.hexValue = hexValue;
    }

    public String getColorName(){
        return colorName;
    }

    public String getHexValue(){
        return hexValue;
    }

    public String toString(){
        return(
            "Color[Color name: " + colorName + ", Hex Value: " + hexValue + "]"
        );
    }
}