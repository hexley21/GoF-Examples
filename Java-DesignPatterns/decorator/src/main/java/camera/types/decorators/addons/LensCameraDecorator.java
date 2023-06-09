package camera.types.decorators.addons;

import camera.ICamera;
import camera.types.decorators.CameraDecorator;

public class LensCameraDecorator extends CameraDecorator {
    public LensCameraDecorator(ICamera camera) {
        super(camera);
    }

    @Override
    public void takePhoto() {
        System.out.println("Lens was adjusted");
        super.takePhoto();
    }
}
