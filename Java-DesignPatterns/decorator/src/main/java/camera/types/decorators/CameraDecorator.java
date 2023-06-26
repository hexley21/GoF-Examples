package camera.types.decorators;

import camera.ICamera;

/**
 * The CameraDecorator class is an abstract decorator that implements the ICamera interface
 * and provides a base implementation for all camera decorators.
 */
public abstract class CameraDecorator implements ICamera {

    /**
     * The wrapped camera object being decorated.
     */
    protected final ICamera camera;

    /**
     * Constructs a new CameraDecorator object with the specified camera to be decorated.
     *
     * @param camera The camera object to be decorated.
     */
    public CameraDecorator(ICamera camera) {
        this.camera = camera;
    }

    /**
     * Takes a photo using the decorated camera object.
     * This method delegates the operation to the wrapped camera object.
     */
    @Override
    public void takePhoto() {
        camera.takePhoto();
    }
}
