package camera.types;

import camera.ICamera;

public class CameraNikon implements ICamera {

    private final String model;

    public CameraNikon(String model) {
        this.model = model;
    }

    @Override
    public void takePhoto() {
        System.out.printf("Nikon - %s took a photo", model);
    }
}
