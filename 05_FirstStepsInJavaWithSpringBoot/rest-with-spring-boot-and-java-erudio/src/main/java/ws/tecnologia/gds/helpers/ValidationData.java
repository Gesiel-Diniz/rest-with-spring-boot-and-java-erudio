package ws.tecnologia.gds.helpers;

public class ValidationData {
	
	public static Double convertToDouble(String strNumber) {
		strNumber = strNumber.replaceAll(",", ".");
		return Double.parseDouble(strNumber);
	}

	public static boolean isNumeric(String strNumber) {
		strNumber = strNumber.replaceAll(",", ".");
		try {
			Double.parseDouble(strNumber);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
	}
	
}
