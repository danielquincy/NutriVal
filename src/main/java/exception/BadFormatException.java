package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Daniel Alexander Prado Amoretty
 * @since 11/01/2022
 * @apiNote Excepción controlada para informar que la información que ha ingresado el usuario no
 *     tiene el formato correcto.
 */
@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class BadFormatException extends RuntimeException {
  private static final long SERIALVERSIONUID = 1L;

  public BadFormatException(String message) {
    super(message);
  }
}
