package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> cars;

    static {
        cars = new ArrayList<>();
        cars.add(new Car("Car1", 1, 1000));
        cars.add(new Car("Car2", 2, 2000));
        cars.add(new Car("Car3", 3, 3000));
        cars.add(new Car("Car4", 4, 4000));
        cars.add(new Car("Car5", 5, 5000));
    }

    @Override
    public List<Car> getAllCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
