import abstractfactory.ArtMaterial;
import abstractfactory.ArtStudioFactory;
import abstractfactory.DigitalArtStudioFactory;
import abstractfactory.TraditionalArtStudioFactory;
import factorymethod.ArtTool;
import factorymethod.ArtToolCreator;
import factorymethod.PaintBrushCreator;
import factorymethod.PencilCreator;

public class Main {
    public static void main(String[] args) {
        demonstrateFactoryMethod();
        demonstrateAbstractFactory();
    }
    private static void demonstrateFactoryMethod() {
        System.out.println("-- FACTORY METHOD --");

        ArtToolCreator brushCreator = new PaintBrushCreator();
        ArtTool brush = brushCreator.createArtTool();
        brush.use();

        ArtToolCreator pencilCreator = new PencilCreator();
        ArtTool pencil = pencilCreator.createArtTool();
        pencil.use();
    }
    private static void demonstrateAbstractFactory() {
        System.out.println("\n-- ABSTRACT FACTORY --");

        printStudioFamily("Traditional Art Studio",
                new TraditionalArtStudioFactory());
        printStudioFamily("Digital Art Studio",
                new DigitalArtStudioFactory());
    }
    private static void printStudioFamily(
            String studioName,
            ArtStudioFactory factory) {

        System.out.println("\n" + studioName);

        ArtTool tool = factory.createArtTool();
        ArtMaterial material = factory.createArtMaterial();

        tool.use();
        material.prepare();
    }
}
