public class IFEvalLogic {

    // Data Definitions
    public String resultOfCompare;
    public String alpha1;
    public String alpha2;
    public int numeric1;
    public int numeric2;
    public String numeric2String;

    // BR-01: Alphanumeric Equality Check
    public void checkAlphanumericEquality() {
        if (alpha1.equals(alpha2)) {
            resultOfCompare = "equal";
        } else {
            resultOfCompare = "different";
        }
    }

    // BR-02: Alphanumeric Literal Check
    public void checkAlphanumericLiteral() {
        if ("foobar".equals(alpha1)) {
            resultOfCompare = "equal";
        } else {
            resultOfCompare = "different";
        }
    }

    // BR-03: Numeric Data Validation
    public void validateAndIncrementNumeric2() {
        try {
            numeric2 = Integer.parseInt(numeric2String);
            numeric2 += 1;
        } catch (NumberFormatException e) {
            numeric2 = 1;
        }
    }

    // BR-04: Division by Zero Prevention
    public void preventDivisionByZero() {
        if (numeric1 != 0) {
            numeric2 = numeric2 / numeric1;
        } else {
            numeric2 = numeric2 - 1;
        }
    }

    // BR-05: Numeric Comparison
    public void compareNumerics() {
        if (numeric1 > numeric2) {
            resultOfCompare = "numeric-1";
        } else if (numeric1 == numeric2) {
            resultOfCompare = "equal";
        } else {
            resultOfCompare = "numeric-2";
        }
    }

    // BR-06: Multi-Case Evaluation (Simple)
    public void evaluateSimpleMultiCase() {
        if (numeric1 > numeric2) {
            resultOfCompare = "numeric-1";
        } else if (numeric1 < numeric2) {
            resultOfCompare = "numeric-2";
        } else {
            resultOfCompare = "equal";
        }
    }

    // BR-07: Multi-Case Evaluation (Complex)
    public void evaluateComplexMultiCase() {
        if (numeric1 > numeric2 && alpha1.startsWith("THX")) {
            resultOfCompare = "THX and numeric-1";
        } else if (numeric1 < numeric2 && alpha1.startsWith("THX")) {
            resultOfCompare = "THX and numeric-2";
        } else if (numeric1 == numeric2 && "Terminator".equals(alpha2)) {
            resultOfCompare = "Terminator and equal numbers";
        } else {
            resultOfCompare = "undefined";
        }
    }
}
