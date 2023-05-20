import phones.types.GooglePixel;
import phones.types.IPhone;

public class Main {
    public static void main(String[] args) {
        // Create an iPhone object
        IPhone iPhone = new IPhone(15, 123456, false, true);

        // Create a GooglePixel object
        GooglePixel googlePixel = new GooglePixel(14, 654321, false, "Tensor 3");

        // Clone the iPhone
        IPhone clonedIPhone = (IPhone) iPhone.clone();
        System.out.println("Cloned iPhone:");
        System.out.println("OS: " + clonedIPhone.OS);
        System.out.println("Version: " + clonedIPhone.version);
        System.out.println("Face ID: " + clonedIPhone.hasFaceId);
        System.out.println();

        // Clone the Google Pixel
        GooglePixel clonedGooglePixel = (GooglePixel) googlePixel.clone();
        System.out.println("Cloned Google Pixel:");
        System.out.println("OS: " + clonedGooglePixel.OS);
        System.out.println("Version: " + clonedGooglePixel.version);
        System.out.println("Tensor Chip: " + clonedGooglePixel.tensorChip);
    }

}
