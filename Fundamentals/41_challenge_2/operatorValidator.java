class operatorValidator {
    // Method to check if input is a valid operator
    public static boolean isValid(String input) {
        String[] operators = {"+", "-", "/", "*", "%"};
        boolean isValid = false;

        // Checking if input matches any operator
        for (String sign : operators) {
            if (sign.equals(input)) {
                isValid = true;
            }
        }

        // Checking if input matches any numeric value representing an operator
        for (int i = 1; i <= 5; i++) {
            if (input.equals(String.valueOf(i))) {
                isValid = true;
            }
        }
        return isValid;
    }

    // Method to find operation based on operator
    public static String operationFinder(String operator) {
        switch (operator) {
            case "+":
            case "1":
                return "addition (+)";
            case "-":
            case "2":
                return "subtraction (-)";
            case "*":
            case "3":
                return "multiplication (*)";
            case "/":
            case "4":
                return "division (/)";
            case "%":
            case "5":
                return "modulus (%)";
            default:
                return "invalid";
        }
    }

    // Method to get operator sign based on numeric value
    public static String getSign(String sign) {
        switch (sign) {
            case "1":
                return "+";
            case "2":
                return "-";
            case "3":
                return "*";
            case "4":
                return "/";
            case "5":
                return "%";
        }
        return sign;
    }
}
