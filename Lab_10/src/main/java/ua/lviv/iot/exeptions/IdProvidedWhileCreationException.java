package ua.lviv.iot.exeptions;

public class IdProvidedWhileCreationException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Failed to create a saw with passed id. Creation method should not use external ids";
    }
}
