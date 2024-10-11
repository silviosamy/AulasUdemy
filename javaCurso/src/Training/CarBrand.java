package Training;

import java.util.List;

public class CarBrand {

    String name;
    List<CarModel> modelList;

    public CarBrand(String name) {
        this.name = name;
    }

    public List<CarModel> getModelList() {
        return modelList;
    }

    public void setModelList(List<CarModel> modelList) {
        this.modelList = modelList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
