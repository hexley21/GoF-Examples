package camera.types.decorators.addons;

import camera.ICamera;
import camera.types.decorators.CameraDecorator;

/**
 * The LensCameraDecorator class is a concrete decorator that adds lens adjustment functionality
 * to the decorated camera.
 */
public class LensCameraDecorator extends CameraDecorator {

    /**
     * Constructs a new LensCameraDecorator object with the specified camera to be decorated.
     *
     * @param camera The camera object to be decorated with lens adjustment functionality.
     */
    public LensCameraDecorator(ICamera camera) {
        super(camera);
    }

    /**
     * Takes a photo using the decorated camera object with the lens adjusted.
     * This method first adjusts the lens and then delegates the operation to the wrapped camera object.
     */
    @Override
    public void takePhoto() {
        System.out.println("Lens was adjusted");
        super.takePhoto();
    }
}
