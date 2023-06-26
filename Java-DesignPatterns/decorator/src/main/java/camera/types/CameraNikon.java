package camera.types;

import camera.ICamera;

/**
 * The CameraNikon class represents a specific implementation of the ICamera interface,
 * specifically a Nikon camera.
 */
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
