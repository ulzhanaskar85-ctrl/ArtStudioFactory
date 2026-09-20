package abstractfactory;
import factorymethod.ArtTool;
public interface ArtStudioFactory {

    ArtTool createArtTool();
    ArtMaterial createArtMaterial();
}
