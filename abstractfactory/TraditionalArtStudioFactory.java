package abstractfactory;
import factorymethod.ArtTool;
public class TraditionalArtStudioFactory implements ArtStudioFactory {

    @Override
    public ArtTool createArtTool() {
        return new TraditionalBrush();
    }

    @Override
    public ArtMaterial createArtMaterial() {
        return new TraditionalCanvas();
    }
}
