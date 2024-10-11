package Training;

import java.util.ArrayList;
import java.util.List;

public class DealerShip {
    public static void main(String[] args) {

        Util utilClass = new Util();
        List<CarBrand> carBrandList = new ArrayList<>();
        carBrandList.add(utilClass.newBrand("Ford"));
        carBrandList.add(utilClass.newBrand("Fiat"));

        for (CarBrand carBrand : carBrandList) {
            List<CarModel> carModelList = new ArrayList<>();
            if (carBrand.getName().equals("Ford")) {
                carModelList.add(utilClass.newModel("Fiesta"));
                carModelList.add(utilClass.newModel("Ka"));
            }
            if (carBrand.getName().equals("Fiat")) {
                carModelList.add(new CarModel("Uno"));
                carModelList.add(new CarModel("Argo"));
                carModelList.add(new CarModel("Palio"));
            }
            carBrand.setModelList(carModelList);
        }
        for (CarBrand carBrand : carBrandList) {
            System.out.println("Brand name: " + carBrand.getName());
            for (CarModel carModel : carBrand.getModelList()) {
                System.out.println("Cars: " + carModel.getName());
            }
        }
    }

}
