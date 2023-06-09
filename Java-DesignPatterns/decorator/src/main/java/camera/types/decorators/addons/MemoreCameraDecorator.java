package camera.types.decorators.addons;

import camera.ICamera;
import camera.types.decorators.CameraDecorator;

public class MemoreCameraDecorator extends CameraDecorator {
    public MemoreCameraDecorator(ICamera camera) {
        super(camera);
    }

    @Override
    public void takePhoto() {
        System.out.println("Additional memory card was inserted");
        super.takePhoto();
    }
}
