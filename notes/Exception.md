## Introduction ##

Encountering an unexpected event

Physical Limitation
1. Memory
2. Network

Input related
1. Unvalidated inputs

Resource related limitation
1. unavailable resources

Code related
1. Unable to perform operations


Code execution is interrupted and thread of execution is terminated abruptly

## Errors ## 
Situation that can not be resolved and recovered
like infinite recursion and iterations

## Exception ##
Situation that can be caught and handled
Creates and exception object that is comprised of all the metadata related to the exception currently caught
like Division by 0, array out of bounds
Categorized into
1. Runtime: Due to programming errors called unchecked exceptions 
    IllegalArguments
    NullPointer
    ArrayOutOfBounds
    ArithmeticException
2. I/O: Checked Exceptions
    FileNotFound
    EndOfFile

## Handling of exceptions ##
Integrate suspicios fragments withing <try---catch---block>
Exception handling is to be included in catch block
ExceptionObect => exp
    exp.getMessage() to get the message regarding exception
