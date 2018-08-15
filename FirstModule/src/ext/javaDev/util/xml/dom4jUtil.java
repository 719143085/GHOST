package ext.javaDev.util.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Iterator;

public class dom4jUtil {

    /**
     * 建立XML文档
     * @param fileName 文件全路径名称
     */
    public void createXml(String fileName) throws Exception {
        Document document = DocumentHelper.createDocument();  //创建document对象
        Element employee = document.addElement("employee");       //添加一个节点
        Element name = employee.addElement("name");              //为节点添加一个属性
        name.setText("张雨");
        Element sex = employee.addElement("sex");                 //为 节点添加一个性别属性
        sex.setText("男");
        Element age =  employee.addElement("age");                //为节点添加年龄属性
        age.setText("19");
        Writer fileWriter = new FileWriter(fileName);
        XMLWriter xmlWriter =new XMLWriter(fileWriter);
        xmlWriter.write(document);
        xmlWriter.close();                                         //关闭流

    }
    /**
     * 解析XML文档
     * @param fileName 文件全路径名称
     */
    public void parserXml(String fileName) {
        File inputXml = new File(fileName);
        SAXReader saxReader = new SAXReader();
        try {
            Document document=saxReader.read(inputXml);       //SAX生成和解析XML文档
            Element employees = document.getRootElement();    //获得根节点
            for(Iterator i = employees.elementIterator(); i.hasNext();){
                Element employee = (Element) i.next();
                for(Iterator j = employee.elementIterator(); j.hasNext();){
                    Element node=(Element) j.next();
                    System.out.println(node.getName()+":"+node.getText());
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
}
