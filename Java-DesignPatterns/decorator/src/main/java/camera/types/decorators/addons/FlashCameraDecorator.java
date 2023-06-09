package camera.types.decorators.addons;

import camera.ICamera;
import camera.types.decorators.CameraDecorator;

/**
 * The FlashCameraDecorator class is a concrete decorator that adds flash functionality
 * to the decorated camera.
 */
public class FlashCameraDecorator extends CameraDecorator {

    /**
     * Constructs a new FlashCameraDecorator object with the specified camera to be decorated.
     *
     * @param camera The camera object to be decorated with flash functionality.
     */
    public FlashCameraDecorator(ICamera camera) {
        super(camera);
    }

    /**
     * Takes a photo using the decorated camera object with the flash turned on.
     * This method first turns on the flash and then delegates the operation to the wrapped camera object.
     */
    @Override
    public void takePhoto() {
        System.out.println("Flash was turned on");
        super.takePhoto();
    }
}