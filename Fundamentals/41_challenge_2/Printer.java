class Printer{
	public static double printResult(String sign, double value1, double value2){
		double result = 0.0;
		switch (sign){
			case "+":
			case "1":
				result = Addition.add(value1, value2);
				break;
			case "-":
			case "2":
				result =Subtraction.subtract(value1, value2);
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

			String equation = value1 + " " + operatorValidator.getSign(sign)+ " "+ value2+ " = " + result;

			historyViewer.history.add(equation);
			System.out.println("\n" + equation);
			System.out.println("\n\n" + "****************************************");
			return result;
	}
}