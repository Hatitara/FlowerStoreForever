package ua.ucu.edu.apps.lab8_forever.model.decorators;

import org.junit.jupiter.api.Test;
import ua.ucu.edu.apps.lab8_forever.model.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoratorTests {

    static class Flower extends Item {
        @Override
        public String getDescription() {
            return "Flower";
        }

        @Override
        public double price() {
            return 20.0;
        }
    }

    @Test
    void testPaperDecorator() {
        Item flower = new Flower();
        Item paperDecoratedFlower = new PaperDecorator(flower);

        assertEquals("Flower + added paper deco.", paperDecoratedFlower.getDescription());
        assertEquals(33.0, paperDecoratedFlower.price(), 0.01);
    }

    @Test
    void testRibbonDecorator() {
        Item flower = new Flower();
        Item ribbonDecoratedFlower = new RibbonDecorator(flower);

        assertEquals("Flower + added ribbon.", ribbonDecoratedFlower.getDescription());
        assertEquals(60.0, ribbonDecoratedFlower.price(), 0.01);
    }

    @Test
    void testBasketDecorator() {
        Item flower = new Flower();
        Item basketDecoratedFlower = new BasketDecorator(flower);

        assertEquals("Flower + fit in basket.", basketDecoratedFlower.getDescription());
        assertEquals(24.0, basketDecoratedFlower.price(), 0.01);
    }

    @Test
    void testMultipleDecorators() {
        Item flower = new Flower();
        Item decoratedFlower = new BasketDecorator(new RibbonDecorator(new PaperDecorator(flower)));

        assertEquals("Flower + added paper deco. + added ribbon. + fit in basket.", decoratedFlower.getDescription());
        assertEquals(77.0, decoratedFlower.price(), 0.01);
    }
}
