package ua.lviv.iot.exeptions;

public class IdProvidedWhileUpdatingException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Failed to update a saw with passed id. Update method should not use external ids";
    }
}
