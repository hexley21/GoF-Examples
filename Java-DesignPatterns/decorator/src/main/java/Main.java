import camera.ICamera;
import camera.types.CameraNikon;
import camera.types.decorators.addons.FlashCameraDecorator;
import camera.types.decorators.addons.LensCameraDecorator;
import camera.types.decorators.addons.MemoreCameraDecorator;

public class Main {
    public static void main(String[] args) {
        // Create a decorated camera object with multiple decorators
        ICamera camera = new MemoreCameraDecorator(
                new LensCameraDecorator(
                        new FlashCameraDecorator(
                                new CameraNikon("D5600")
                        )
                )
        );

        // Take a photo using the decorated camera
        camera.takePhoto();
    }
}