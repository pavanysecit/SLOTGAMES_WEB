package stepDefinition_GoldenCrown;


import java.io.File;
import static org.opencv.highgui.Highgui.imread;
import static org.opencv.highgui.Highgui.imwrite;
import static org.opencv.imgproc.Imgproc.COLOR_BGR2GRAY;
import static org.opencv.imgproc.Imgproc.cvtColor;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;



public class RecognizeText {
	
	// Source path content images
	static String SRC_PATH = "E:/Recognize/java_text/";
	static String TESS_DATA = "E:/Programs/ocr/Tesseract-OCR/tessdata";
	
	// Create tess obj
	static Tesseract tesseract = new Tesseract();
	
	// Load OPENCV
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		tesseract.setDatapath(TESS_DATA);
	}
		String extractTextFromImage(Mat inputMat) {
		String result = "";
		Mat gray = new Mat();
		
		// Convert to gray scale
		cvtColor(inputMat, gray, COLOR_BGR2GRAY);
		imwrite(SRC_PATH + "gray.png", gray);
		try {
			// Recognize text with OCR
			result = tesseract.doOCR(new File(SRC_PATH + "gray.png"));
		} catch (TesseractException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Start recognize text from image");
		long start = System.currentTimeMillis();
	
		// Read image
		Mat origin = imread(SRC_PATH + "sikuliximage-15765825931532.png");
		String result = new RecognizeText().extractTextFromImage(origin);
		System.out.println(result);
		System.out.println("Time");
		System.out.println(System.currentTimeMillis() - start);
		System.out.println("Done");

	}
}