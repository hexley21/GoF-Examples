package camera.types.decorators.addons;

import camera.ICamera;
import camera.types.decorators.CameraDecorator;

public class FlashCameraDecorator extends CameraDecorator {
    public FlashCameraDecorator(ICamera camera) {
        super(camera);
    }

    @Override
    public void takePhoto() {
        System.out.println("Flash was turned on");
        super.takePhoto();
    }
}
