package it.bridgeconsulting.btefa.interfaces;

import it.bridgeconsulting.btefa.data.Document;

/**
 * @author fcambi
 * @version 0.7
 */
public interface HOCRParser {

    public Document parseHOCRString(String hocr);

}
