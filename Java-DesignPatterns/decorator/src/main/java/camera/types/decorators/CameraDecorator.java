package camera.types.decorators;

import camera.ICamera;

public class CameraDecorator implements ICamera {

    private final ICamera camera;

    public CameraDecorator(ICamera camera) {
        this.camera = camera;
    }

    @Override
    public void takePhoto() {
        camera.takePhoto();
    }
}
