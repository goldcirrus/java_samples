

/**
 *This is the most bottom class, it extends Exception 
 * @author jcuzzola
 */                      //extends Exception  is(checked exception), so the main driver method class must use throws this exception
public class IDontLikeMondaysException extends Exception {
   //is a class                                          // extends RuntimeException is(unchecked exception), no need throws in the driver method class
}
