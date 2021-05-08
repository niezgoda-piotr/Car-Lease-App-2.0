package bykovsky.soh.carleaseapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CarNotFoundException extends RuntimeException{
    private final static String MESSAGE = "Can't find car with carUuid: ";

    public CarNotFoundException(String carUuid) {
        super(MESSAGE + carUuid);
    }
}
