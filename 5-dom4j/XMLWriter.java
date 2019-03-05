import java.io.*;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Attribute;
import org.dom4j.io.SAXReader;

public class XMLWriter{
  public static void main(String[] args) throws Exception{

    Document doc = DocumentHelper.createDocument();
    Element root = doc.addElement("root");
    // System.out.println(doc);
    Element book = root.addElement("book");
    book.addAttribute("name", "Effective Java");
    book.addText("get a high level of Java");
    Writer w = new FileWriter(new File(".", "Writer_created.xml"));
    doc.write(w);
    w.close(); // 没有执行这句话的话，文件竟然是空的。
  }
}