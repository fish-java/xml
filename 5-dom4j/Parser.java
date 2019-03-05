import java.io.*;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Attribute;
import org.dom4j.io.SAXReader;

public class Parser{
  public static void main(String[] args) throws Exception{

    SAXReader reader = new SAXReader();
    Document doc = reader.read(new File(".", "conf.xml"));
    // System.out.println(doc);
    Element root = doc.getRootElement();
    System.out.println(root.getName());

    Iterator<Element> eles = root.elementIterator();
    while(eles.hasNext()){
      Element e = eles.next();
      System.out.println(e.getName());
      Attribute id = e.attribute("id");
      System.out.println(id.getValue());
    }
  }
}