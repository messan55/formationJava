package principal;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NameList;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class Program {
	
	public static void main(String[] args) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			File f = new File("baseexport.xml");
			
			Document doc = db.parse(f);
			
			/*NodeList nl = doc.getElementsByTagName("data");
			System.out.println("-----------------");
			parcourEnfant(nl);
			System.out.println("-----------------");*/
			
			XPathFactory xpathfact = XPathFactory.newInstance();
			XPath xpath = xpathfact.newXPath();
			XPathExpression xpexpr = xpath.compile("//data/table[@name='articles']/row/cell[@name='stock' and text()>8]/" + "../cell[@name='nom']/text()"
					+ "");
			NodeList nl = (NodeList)xpexpr.evaluate(doc, XPathConstants.NODESET);
			parcourEnfant(nl);
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void parcourEnfant(NodeList nl) {
		System.out.println("################");
		for (int i = 0; i < nl.getLength(); i++) {
			Node n = nl.item(i);
			afficheNoeud(n);
			NamedNodeMap attrs = n.getAttributes();
			if (attrs != null) {
				for (int j = 0; j < attrs.getLength(); j++) {
					Attr a = (Attr)attrs.item(j);
					afficheNoeud(a);
				}
				parcourEnfant(n.getChildNodes());
			}
		}
	}

	private static void afficheNoeud(Node n) {
		System.out.println("type noeud = " + n.getNodeType());
		
		switch (n.getNodeType()) {
		case Node.ELEMENT_NODE:
			System.out.println("element");
			Element el = (Element)n;
			System.out.println(el.getTagName());
			break;
		case Node.ATTRIBUTE_NODE:
			System.out.println("attribut");
			Attr a = (Attr)n;
			System.out.println(a.getName() + " = " + a.getValue());
			break;
		case Node.TEXT_NODE:
			System.out.println("texte");
			Text t = (Text)n;
			System.out.println(t.getTextContent());
			break;
		}
	}
}
