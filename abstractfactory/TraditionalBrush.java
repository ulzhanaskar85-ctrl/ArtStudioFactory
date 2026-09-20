package abstractfactory;
import factorymethod.ArtTool;
public class TraditionalBrush implements ArtTool {

    @Override
    public void use() {
        System.out.println("Using a traditional brush with physical paint");
    }
}
