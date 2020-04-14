package by.bsuir.exception;

/**
 * Неправильное выражение.
 */
public class WrongExpressionException extends VisitorException {
    public WrongExpressionException(String message) {
        super(message);
    }
}
