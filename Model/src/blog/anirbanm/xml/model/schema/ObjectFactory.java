
package blog.anirbanm.xml.model.schema;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the blog.anirbanm.xml.model.schema package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: blog.anirbanm.xml.model.schema
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Customxml }
     *
     */
    public Customxml createCustomxml() {
        return new Customxml();
    }

    /**
     * Create an instance of {@link Customxml.Xmlnodes }
     *
     */
    public Customxml.Xmlnodes createCustomxmlXmlnodes() {
        return new Customxml.Xmlnodes();
    }

    /**
     * Create an instance of {@link Customxml.Xmlnodes.Xmlnode }
     *
     */
    public Customxml.Xmlnodes.Xmlnode createCustomxmlXmlnodesXmlnode() {
        return new Customxml.Xmlnodes.Xmlnode();
    }

}
