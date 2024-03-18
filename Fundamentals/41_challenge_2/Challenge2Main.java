class Challenge2Main {
    public static void main(String[] args) {
        // Initializing variables
        String contQuestion = "";
        String result = "";

        // Printing welcome message
        System.out.println(MenuPrinter.printWelcome());

        // Main menu loop
        menuLoop:
        while (true) {
            // Prompting user for input and displaying menu
            String sign = Prompter.prompt(MenuPrinter.printMenu());

            // Checking if user chose to exit
            if (!sign.equalsIgnoreCase("6")) {
                while (true) {
                    // Checking whether the user wants to exit or not
                    if (sign.equalsIgnoreCase("x")) {
                        System.out.println("Goodbye!");
                        // Exiting main loop
                        break menuLoop;
                    }
                    // Checking whether the entered value is a valid numerical digit or operator
                    else {
                        if (operatorValidator.isValid(sign))
                            break;
                        else
                            sign = Prompter.prompt("Enter a valid option or operator sign or 'X' to exit:");
                    }
                }

                // Handling user input for value1
                String value1;
                if (contQuestion.equalsIgnoreCase("Y")) {
                    value1 = result;
                } else {
                    // Prompting user for value1
                    value1 = Prompter.prompt("Enter value 1:");
                    // Validating value1
                    while (true) {
                        if (NumberValidator.isValid(value1))
                            break;
                        else
                            value1 = Prompter.prompt("Enter a valid numerical value:");
                    }
                }

                // Prompting user for operator
                String operator = Prompter.prompt("Enter the operator for " + operatorValidator.operationFinder(sign) + ":");
                // Validating operator
                while (true) {
                    if (operator.equals(((operatorValidator.operationFinder(sign)).split("\\(")[1]).replace(")", "")))
                        break;
                    else
                        operator = Prompter.prompt("Enter a valid operator for " + operatorValidator.operationFinder(sign));
                }

                // Handling user input for value2
                String value2 = Prompter.prompt("Enter value 2:");
                // Validating value2
                while (true) {
                    if (NumberValidator.isValid(value2)) {
                        if (NumberValidator.isValidDivide(value2, operator))
                            break;
                        else 
                            value2 = Prompter.prompt("Enter a valid, non-zero, numerical value:");
                    } else
                        value2 = Prompter.prompt("Enter a valid numerical value:");
                }

                // Calculating result and converting it to String
                result = String.valueOf(Printer.printResult(sign, Double.parseDouble(value1), Double.parseDouble(value2)));
                // Prompting user to continue or not
                contQuestion = Prompter.prompt(MenuPrinter.printRepeat(result));
            } else {
                // Displaying history of equations
                historyViewer.display();
            }
        }
    }
}
