package camera.types.decorators.addons;

import camera.ICamera;
import camera.types.decorators.CameraDecorator;

/**
 * The MemoreCameraDecorator class is a concrete decorator that adds additional memory card functionality
 * to the decorated camera.
 */
public class MemoreCameraDecorator extends CameraDecorator {

    /**
     * Constructs a new MemoreCameraDecorator object with the specified camera to be decorated.
     *
     * @param camera The camera object to be decorated with additional memory card functionality.
     */
    public MemoreCameraDecorator(ICamera camera) {
        super(camera);
    }

    /**
     * Takes a photo using the decorated camera object with an additional memory card inserted.
     * This method first inserts an additional memory card and then delegates the operation to the wrapped camera object.
     */
    @Override
    public void takePhoto() {
        System.out.println("Additional memory card was inserted");
        super.takePhoto();
    }
}
