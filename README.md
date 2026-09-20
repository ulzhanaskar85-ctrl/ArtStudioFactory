# Art Studio Factory
## Project Overview
This project demonstrates two creational design patterns:
1. Factory Method
2. Abstract Factory

The chosen domain is an Art Studio Factory. The system creates art tools and materials for different artistic styles.
## Part A — Factory Method
The Factory Method creates one type of product: `ArtTool`.
### Product
`ArtTool` is the common interface.
### Concrete Products
`PaintBrush` `Pencil`
### Creator
`ArtToolCreator` declares the factory method `createArtTool()`.
### Concrete Creators
`PaintBrushCreator` `PencilCreator`

The concrete creators decide which `ArtTool` implementation is created.
## Part B — Abstract Factory
The Abstract Factory creates a family of related products:

`ArtTool` `ArtMaterial`

There are two product families:
### Traditional Art Family
`TraditionalBrush` `TraditionalCanvas`

Created by `TraditionalArtStudioFactory`.
### Digital Art Family
`DigitalStylus` `DigitalCanvas`

Created by `DigitalArtStudioFactory`.

The client (`Main`) works with `ArtStudioFactory`, `ArtTool`, and `ArtMaterial` interfaces and does not instantiate concrete products directly.
## Why These Patterns?
Factory Method is useful when the program needs one product type but different concrete implementations.

Abstract Factory is useful when the program needs multiple related products that should belong to the same family.

In this project:

Factory Method chooses a specific art tool.

Abstract Factory chooses a complete art style family: traditional or digital.
## Clean Code Principles
### 1. Meaningful, intention-revealing names
Bad:
```java
ArtToolCreator c;
```

Better:
```java
ArtToolCreator pencilCreator;
```

Names such as `TraditionalArtStudioFactory` and `createArtMaterial()` clearly describe their purpose.
### 2. Small methods
Bad:
```java
void runEverything() {
    // creates tools, creates materials, prints output,
    // and handles every part of the application
}
```

Better:
```java
private static void demonstrateFactoryMethod() {
    // demonstrates only Factory Method
}

private static void demonstrateAbstractFactory() {
    // demonstrates only Abstract Factory
}
```

Each method has one clear responsibility.
### 3. Consistent formatting and focused classes
Each class has one main responsibility:
- Product interfaces define contracts.
- Concrete products implement products.
- Creators/factories create objects.
- `Main` demonstrates the system.
### 4. Encapsulation
Instead of exposing internal implementation details, the program uses interfaces:

```java
ArtTool tool = factory.createArtTool();
```

The client depends on the `ArtTool` abstraction rather than a concrete class.
### 5. Dependency on abstractions

The client depends on abstract interfaces:
ArtStudioFactory factory =
new TraditionalArtStudioFactory();
```java
ArtTool tool =
factory.createArtTool();

ArtMaterial material =
factory.createArtMaterial();
```
Instead of directly creating concrete products:
```java
TraditionalBrush brush =
new TraditionalBrush();

TraditionalCanvas canvas =
new TraditionalCanvas();
```
This keeps the client independent from concrete product classes.
## Example of Dependency Inversion
The client uses:

```java
ArtStudioFactory factory;
ArtTool tool;
ArtMaterial material;
```

rather than:

```java
TraditionalBrush brush = new TraditionalBrush();
TraditionalCanvas canvas = new TraditionalCanvas();
```

This keeps the client independent from concrete product classes.
## How to Run
1. Open the project in IntelliJ IDEA.
2. Make sure the `src` folder is marked as Sources Root if IntelliJ does not detect it automatically.
3. Open `Main.java`.
4. Run `Main`.
   Expected output includes sections for Factory Method, Traditional Art Studio, and Digital Art Studio.
## Git Commit History
Commit 1: Create Factory Method structure

Commit 2: Add Abstract Factory for art studio families

Commit 3: Add README and finalize project