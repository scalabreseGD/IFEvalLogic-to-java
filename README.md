# IFEvalLogic Java Migration

This project is a Java implementation of the COBOL `IFEVAL.CBL` program, designed to replicate its conditional logic in a modern, object-oriented structure.

## Purpose

The primary goal is to migrate the functionality of the original COBOL program to a Java class (`IFEvalLogic.java`). This serves as an example of modernizing legacy code by encapsulating business rules within a clear and testable class structure.

### Original COBOL Program

The logic is based on the `IFEVAL.CBL` program from the `neopragma/cobol-samples` repository. You can find the original source code here: [IFEVAL.CBL](https://github.com/neopragma/cobol-samples/blob/main/src/main/cobol/IFEVAL.CBL).

## Key Functionality

The `IFEvalLogic.java` class contains a series of methods that mirror the conditional evaluations in the COBOL program, including:

- **String and Numeric Comparisons**: Evaluating equality, greater/less than conditions, and other relational checks.
- **Data Validation**: Implementing logic for validating data types and values.
- **Complex Evaluations**: Handling nested `IF/ELSE` blocks and combined conditions to execute specific logic paths.

Each method is self-contained, making the logic easy to understand, test, and maintain.
