package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * @author Daniel Alexander Prado Amoretty
 * @since 11/01/2022
 * @apiNote Excepción controlada para informar que no se encontraron valores para la información
 *     ingresada.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
  private static final long SERIALVERSIONUID = 1L;

  public ResourceNotFoundException(String message) {
    super(message);
  }
}
