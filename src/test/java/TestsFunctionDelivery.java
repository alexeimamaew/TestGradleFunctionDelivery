import Mamaev.FuntionDelivery;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestsFunctionDelivery {

    @Test
    @Tag("Smoke")
    @DisplayName("Калькуляция суммы доставки")
    void DeliveryCostExampleTest() {
        double distance = 5.0;
        FuntionDelivery.Size size = FuntionDelivery.Size.LARGE;
        boolean isFragile = false;
        FuntionDelivery.LoadLevel loadLevel = FuntionDelivery.LoadLevel.HIGH;

        int expectedCost = (int) ((100 + 200) * 1.4);
        int actualCost = FuntionDelivery.calculateDeliveryCost(distance, size, isFragile, loadLevel);

        assertEquals(expectedCost, actualCost, "Расчет стоимости доставки неверен");
};

    @Test
    @Tag("Smoke")
    @DisplayName("Калькуляция минимальной суммы доставки")
    void DeliveryMinCostTest() {
        double distance = 2.0;
        FuntionDelivery.Size size = FuntionDelivery.Size.SMALL;
        boolean isFragile = false;
        FuntionDelivery.LoadLevel loadLevel = FuntionDelivery.LoadLevel.NORMAL;

        int expectedCost = (int) (400);
        int actualCost = FuntionDelivery.calculateDeliveryCost(distance, size, isFragile, loadLevel);

        assertEquals(expectedCost, actualCost, "Расчет минимальной стоимости доставки неверен");
    };

    @Test
    @Tag("Smoke")
    @DisplayName("Калькуляция суммы доставки на дистанцию в 10 км")
    void DeliveryCostTest10km() {
        double distance = 10.0;
        FuntionDelivery.Size size = FuntionDelivery.Size.SMALL;
        boolean isFragile = false;
        FuntionDelivery.LoadLevel loadLevel = FuntionDelivery.LoadLevel.NORMAL;

        int expectedCost = (int) (400);
        int actualCost = FuntionDelivery.calculateDeliveryCost(distance, size, isFragile, loadLevel);

        assertEquals(expectedCost, actualCost, "Расчет минимальной стоимости доставки неверен");
    };

    @Test
    @Tag("Smoke")
    @DisplayName("Калькуляция суммы доставки на дистанцию в 30 км")
    void DeliveryCostTest30km() {
        double distance = 30.0;
        FuntionDelivery.Size size = FuntionDelivery.Size.SMALL;
        boolean isFragile = false;
        FuntionDelivery.LoadLevel loadLevel = FuntionDelivery.LoadLevel.NORMAL;

        int expectedCost = (int) (400);
        int actualCost = FuntionDelivery.calculateDeliveryCost(distance, size, isFragile, loadLevel);

        assertEquals(expectedCost, actualCost, "Расчет минимальной стоимости доставки неверен");
    };

    @Test
    @Tag("Smoke")
    @DisplayName("Калькуляция суммы доставки на дистанцию в 31 км")
    void DeliveryCostTest31km() {
        double distance = 31.0;
        FuntionDelivery.Size size = FuntionDelivery.Size.SMALL;
        boolean isFragile = false;
        FuntionDelivery.LoadLevel loadLevel = FuntionDelivery.LoadLevel.NORMAL;

        int expectedCost = (int) (400);
        int actualCost = FuntionDelivery.calculateDeliveryCost(distance, size, isFragile, loadLevel);

        assertEquals(expectedCost, actualCost, "Расчет минимальной стоимости доставки неверен");
    };

    @Test
    @Tag("Smoke")
    @DisplayName("Калькуляция суммы доставки на дистанцию в 31 км, большого груза")
    void DeliveryCost31kmBigBoxTest() {
        double distance = 31.0;
        FuntionDelivery.Size size = FuntionDelivery.Size.LARGE;
        boolean isFragile = false;
        FuntionDelivery.LoadLevel loadLevel = FuntionDelivery.LoadLevel.NORMAL;

        int expectedCost = (int) (500);
        int actualCost = FuntionDelivery.calculateDeliveryCost(distance, size, isFragile, loadLevel);

        assertEquals(expectedCost, actualCost, "Расчет минимальной стоимости доставки неверен");
    };

    @Test
    @Tag("Negative")
    @DisplayName("Калькуляция суммы доставки на дистанцию в 31 км, большого груза, негативный тест")
    void DeliveryCost31kmBigBoxNegativeTest() {
        double distance = 31.0;
        FuntionDelivery.Size size = FuntionDelivery.Size.LARGE;
        boolean isFragile = false;
        FuntionDelivery.LoadLevel loadLevel = FuntionDelivery.LoadLevel.NORMAL;

        int expectedCost = (int) (400);
        int actualCost = FuntionDelivery.calculateDeliveryCost(distance, size, isFragile, loadLevel);

        assertEquals(expectedCost, actualCost, "Расчет минимальной стоимости доставки неверен");
    };

    @Test
    @Tag("Smoke")
    @DisplayName("Калькуляция суммы доставки на дистанцию в 31 км, большого груза, повышенная загруженность (1.2)")
    void DeliveryCost31kmBigBoxIncreasedTest() {
        double distance = 31.0;
        FuntionDelivery.Size size = FuntionDelivery.Size.LARGE;
        boolean isFragile = false;
        FuntionDelivery.LoadLevel loadLevel = FuntionDelivery.LoadLevel.INCREASED;

        int expectedCost = (int) (600);
        int actualCost = FuntionDelivery.calculateDeliveryCost(distance, size, isFragile, loadLevel);

        assertEquals(expectedCost, actualCost, "Расчет минимальной стоимости доставки неверен");
    };

    @Test
    @Tag("Smoke")
    @DisplayName("Калькуляция суммы доставки на дистанцию в 31 км, большого груза, высокая загруженность (1.4)")
    void DeliveryCost31kmBigBoxHighTest() {
        double distance = 31.0;
        FuntionDelivery.Size size = FuntionDelivery.Size.LARGE;
        boolean isFragile = false;
        FuntionDelivery.LoadLevel loadLevel = FuntionDelivery.LoadLevel.HIGH;

        int expectedCost = (int) (700);
        int actualCost = FuntionDelivery.calculateDeliveryCost(distance, size, isFragile, loadLevel);

        assertEquals(expectedCost, actualCost, "Расчет минимальной стоимости доставки неверен");
    };

    @Test
    @Tag("Smoke")
    @DisplayName("Калькуляция суммы доставки на дистанцию в 31 км, большого груза, очень высокая загруженность (1.6)")
    void DeliveryCost31kmBigBoxVeryHighTest() {
        double distance = 31.0;
        FuntionDelivery.Size size = FuntionDelivery.Size.LARGE;
        boolean isFragile = false;
        FuntionDelivery.LoadLevel loadLevel = FuntionDelivery.LoadLevel.VERY_HIGH;

        int expectedCost = (int) (800);
        int actualCost = FuntionDelivery.calculateDeliveryCost(distance, size, isFragile, loadLevel);

        assertEquals(expectedCost, actualCost, "Расчет минимальной стоимости доставки неверен");
    };


    @Test
    @Tag("Smoke")
    @DisplayName("Калькуляция суммы доставки на дистанцию в 30 км, большого хрупкого груза, очень высокая загруженность (1.6)")
    void DeliveryCost30kmBigFragileBoxVeryHighTest() {
        double distance = 30.0;
        FuntionDelivery.Size size = FuntionDelivery.Size.LARGE;
        boolean isFragile = true;
        FuntionDelivery.LoadLevel loadLevel = FuntionDelivery.LoadLevel.VERY_HIGH;

        int expectedCost = (int) (1120);
        int actualCost = FuntionDelivery.calculateDeliveryCost(distance, size, isFragile, loadLevel);

        assertEquals(expectedCost, actualCost, "Расчет минимальной стоимости доставки неверен");
    };

    @Test
    @Tag("Negative")
    @DisplayName("Калькуляция суммы доставки на дистанцию в 31 км хрупкого груза")
    void DeliveryCost31kmFragileBoxTest() {
        double distance = 31.0;
        FuntionDelivery.Size size = FuntionDelivery.Size.LARGE;
        boolean isFragile = true;
        FuntionDelivery.LoadLevel loadLevel = FuntionDelivery.LoadLevel.VERY_HIGH;

        int expectedCost = (int) (1500);
        int actualCost = FuntionDelivery.calculateDeliveryCost(distance, size, isFragile, loadLevel);

        assertEquals(expectedCost, actualCost, "Расчет минимальной стоимости доставки неверен");

    }
}