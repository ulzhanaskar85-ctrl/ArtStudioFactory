package factorymethod;

public class PencilCreator extends ArtToolCreator {

    @Override
    public ArtTool createArtTool() {
        return new Pencil();
    }
}
