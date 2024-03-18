class Printer {
    // Method to print result based on sign and values
    public static double printResult(String sign, double value1, double value2) {
        double result = 0.0;
        // Performing operation based on sign
        switch (sign) {
            case "+":
            case "1":
                result = Addition.add(value1, value2);
                break;
            case "-":
            case "2":
                result = Subtraction.subtract(value1, value2);
                break;
            case "*":
            case "3":
                result = Multiplication.multiply(value1, value2);
                break;
            case "/":
            case "4":
                result = Division.divide(value1, value2);
                break;
            case "%":
            case "5":
                result = Modulus.modulus(value1, value2);
                break;
        }

        // Creating equation string
        String equation = value1 + " " + operatorValidator.getSign(sign) + " " + value2 + " = " + result;

        // Adding equation to history
        historyViewer.history.add(equation);

        // Printing equation
        System.out.println("\n" + equation);
        System.out.println("\n\n" + "****************************************");

        return result;
    }
}
