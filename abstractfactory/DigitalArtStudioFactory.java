package abstractfactory;
import factorymethod.ArtTool;
public class DigitalArtStudioFactory implements ArtStudioFactory {

    @Override
    public ArtTool createArtTool() {
        return new DigitalStylus();
    }

    @Override
    public ArtMaterial createArtMaterial() {
        return new DigitalCanvas();
    }
}
