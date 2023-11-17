package web.dao;
import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> listCars() {

        List<Car> carsList = new ArrayList<>();

        carsList.add(new Car("LADA", "White", 123));
        carsList.add(new Car("UAZ", "Black", 345));
        carsList.add(new Car("EVOLUTE", "Greed", 678));
        carsList.add(new Car("SKYWELL", "Rad", 901));
        carsList.add(new Car("HONGQI", "Blue", 321));

        return carsList;
    }
}
