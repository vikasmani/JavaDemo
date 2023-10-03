package org.dp.creational.builder.builders;

import org.dp.creational.builder.cars.CarType;
import org.dp.creational.builder.components.Engine;
import org.dp.creational.builder.components.GPSNavigator;
import org.dp.creational.builder.components.Transmission;
import org.dp.creational.builder.components.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
