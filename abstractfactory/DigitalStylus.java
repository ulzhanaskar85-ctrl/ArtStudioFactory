package abstractfactory;
import factorymethod.ArtTool;
public class DigitalStylus implements ArtTool {
    @Override
    public void use() {
        System.out.println("Using a digital stylus for drawing");
    }
}
