package Mamaev;

import java.util.Objects;

public class FuntionDelivery {
    public FuntionDelivery(double v, Size size, boolean b, LoadLevel loadLevel) {
    }

    public enum LoadLevel {
        VERY_HIGH,
        HIGH,
        INCREASED,
        NORMAL
    }

    public enum Size {
        LARGE,
        SMALL
    }

    public static int calculateDeliveryCost(double distance, Size size, boolean isFragile, LoadLevel loadLevel) {
        int baseCost = 0;

        // Расчет стоимости в зависимости от расстояния
        if (distance > 30) {
            baseCost += 300;
        } else if (distance <= 30 && distance > 10) {
            baseCost += 200;
        } else if (distance <= 10 && distance > 2) {
            baseCost += 100;
        } else if (distance <= 2) {
            baseCost += 50;
        }

        // Расчет стоимости в зависимости от габаритов груза
        if (size == Size.LARGE) {
            baseCost += 200;
        } else {
            baseCost += 100;
        }

        // Расчет стоимости в зависимости от хрупкости груза
        if (isFragile) {
            if (distance > 30) {
                throw new IllegalArgumentException("Хрупкие грузы нельзя возить на расстояние более 30 км.");
            }
            baseCost += 300;
        }

        // Применение коэффициента загруженности
        double loadFactor = 1.0;
        switch (loadLevel) {
            case VERY_HIGH:
                loadFactor = 1.6;
                break;
            case HIGH:
                loadFactor = 1.4;
                break;
            case INCREASED:
                loadFactor = 1.2;
                break;
            case NORMAL:
                loadFactor = 1.0;
                break;
        }

        int totalCost = (int) (baseCost * loadFactor);

        // Применение минимальной суммы доставки
        final int MINIMAL_COST = 400; // Вынесено в константу
        return Math.max(totalCost, MINIMAL_COST);
    }


}

