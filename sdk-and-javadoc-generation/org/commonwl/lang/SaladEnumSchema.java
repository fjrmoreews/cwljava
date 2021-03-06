
/*****************************************************************************************************
*
*  Authors:
*          
*          <b> Java SDK for CWL </b>
*          
*            @author Paul Grosu (pgrosu@gmail.com), Northeastern University
*            @version 0.20
*            @since April 28, 2016
*          
*          <p> Alternate SDK (via Avro): 
*          
*            Denis Yuen (denis.yuen@gmail.com)
*          
*          CWL Draft:
*          
*            Peter Amstutz (peter.amstutz@curoverse.com), Curoverse
*            Nebojsa Tijanic (nebojsa.tijanic@sbgenomics.com), Seven Bridges Genomics
*          
*            Contributors:
*          
*            Luka Stojanovic (luka.stojanovic@sbgenomics.com), Seven Bridges Genomics
*            John Chilton (jmchilton@gmail.com), Galaxy Project, Pennsylvania State University
*            Michael R. Crusoe (crusoe@ucdavis.edu), University of California, Davis
*            Herve Menager (herve.menager@gmail.com), Institut Pasteur
*            Maxim Mikheev (mikhmv@biodatomics.com), BioDatomics
*            Stian Soiland-Reyes (soiland-reyes@cs.manchester.ac.uk), University of Manchester
*
*****************************************************************************************************/

package org.commonwl.lang;

/*****************************************************************************************************
*
*   Define an enumerated type.
*/
public class SaladEnumSchema extends EnumSchema implements SchemaDefinedType {

  /*****************************************************************************************************
  *
  *   Indicates that this enum inherits symbols from a base enum.  
  */
  Object extends_value = null;


  /*****************************************************************************************************
  *
  *  Must be `enum`
  */
  Enum type = null;

  /*****************************************************************************************************
  *
  *  Defines the set of valid symbols.
  */
  String [] symbols = null;


  /*****************************************************************************************************
  *
  *   If true, indicates that the type is a valid at the document root.  At least one type in a schema must be tagged with `documentRoot: true`.  
  */
  Boolean documentRoot = null;

  /*****************************************************************************************************
  *
  *   Annotate this type with linked data context.
  */
  Object jsonldPredicate = null;


  /*****************************************************************************************************
  *
  *   Hint to indicate that during documentation generation, documentation for this type should appear in a subsection under `docParent`.
  */
  String docParent = null;

  /*****************************************************************************************************
  *
  *  A documentation string for this type, or an array of strings which should be concatenated.
  */
  Object doc = null;

  /*****************************************************************************************************
  *
  *   Hint to indicate that during documentation generation, documentation for this type should appear after the `docAfter` section at the same level.
  */
  String docAfter = null;

  /*****************************************************************************************************
  *
  *   Hint to indicate that during documentation generation, documentation for `docChild` should appear in a subsection under this type.
  */
  Object docChild = null;


  public SaladEnumSchema() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of extends_value.
  *
  *  @param   value will update extends_value, which is a String type.
  *
  */
  public void setextends( String value ) {
    extends_value = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of extends_value.
  *
  *  @param   value will update extends_value, which is a String array.
  *
  */
  public void setextends( String [] value ) {
    extends_value = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of extends_value.
  *
  *  @return   This method will return the value of extends_value, which is a Object type.
  *
  */
  public Object getextends() {
    return extends_value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of type.
  *
  *  @param   value will update type, which is a Enum type.
  *
  */
  public void settype( Enum value ) {
    type = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of type.
  *
  *  @return   This method will return the value of type, which is a Enum type.
  *
  */
  public Enum gettype() {
    return type;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of symbols.
  *
  *  @param   value will update symbols, which is a String array.
  *
  */
  public void setsymbols( String [] value ) {
    symbols = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of symbols.
  *
  *  @return   This method will return the value of symbols, which is a String array.
  *
  */
  public String [] getsymbols() {
    return symbols;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of documentRoot.
  *
  *  @param   value will update documentRoot, which is a Boolean type.
  *
  */
  public void setdocumentRoot( Boolean value ) {
    documentRoot = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of documentRoot.
  *
  *  @return   This method will return the value of documentRoot, which is a Boolean type.
  *
  */
  public Boolean getdocumentRoot() {
    return documentRoot;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of jsonldPredicate.
  *
  *  @param   value will update jsonldPredicate, which is a String type.
  *
  */
  public void setjsonldPredicate( String value ) {
    jsonldPredicate = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of jsonldPredicate.
  *
  *  @param   value will update jsonldPredicate, which is a JsonldPredicate type.
  *
  */
  public void setjsonldPredicate( JsonldPredicate value ) {
    jsonldPredicate = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of jsonldPredicate.
  *
  *  @return   This method will return the value of jsonldPredicate, which is a Object type.
  *
  */
  public Object getjsonldPredicate() {
    return jsonldPredicate;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of docParent.
  *
  *  @param   value will update docParent, which is a String type.
  *
  */
  public void setdocParent( String value ) {
    docParent = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of docParent.
  *
  *  @return   This method will return the value of docParent, which is a String type.
  *
  */
  public String getdocParent() {
    return docParent;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of doc.
  *
  *  @param   value will update doc, which is a String type.
  *
  */
  public void setdoc( String value ) {
    doc = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of doc.
  *
  *  @param   value will update doc, which is a String array.
  *
  */
  public void setdoc( String [] value ) {
    doc = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of doc.
  *
  *  @return   This method will return the value of doc, which is a Object type.
  *
  */
  public Object getdoc() {
    return doc;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of docAfter.
  *
  *  @param   value will update docAfter, which is a String type.
  *
  */
  public void setdocAfter( String value ) {
    docAfter = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of docAfter.
  *
  *  @return   This method will return the value of docAfter, which is a String type.
  *
  */
  public String getdocAfter() {
    return docAfter;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of docChild.
  *
  *  @param   value will update docChild, which is a String type.
  *
  */
  public void setdocChild( String value ) {
    docChild = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of docChild.
  *
  *  @param   value will update docChild, which is a String array.
  *
  */
  public void setdocChild( String [] value ) {
    docChild = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of docChild.
  *
  *  @return   This method will return the value of docChild, which is a Object type.
  *
  */
  public Object getdocChild() {
    return docChild;
  }

}