public class CustomException extends Exception {
    enum ErrorType {
        inputMatrixMessage,
        outOfRangeMessage,
        alreadyFoundMessage,
        differentCoordinateMessage
    }

    private final ErrorType errorType;

    CustomException(ErrorType errorType) {
        this.errorType = errorType;
    }
    ErrorType getErrorType() {
        return errorType;
    }


}