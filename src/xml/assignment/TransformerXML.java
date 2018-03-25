package xml.assignment;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class TransformerXML {
	public static void main(String[] args) {

		String ProjectPath = args[0];
		String inputXmlPath = args[1];
		String operation = args[2];
		String XSLFILE="";
		String INFILE="";
		String OUTFILE="";

		if(args.length != 3){
			System.out.println("3 parameters needed ");
			System.out.println("1. Project Path (/Users/Pratik/Documents/DB/hw4-xml-assignment)");
			System.out.println("2. Input XML file's Path (/src/xml/assignment/site.xml)");
			System.out.println("3. Operation XML2XML or XML2HTML");
			return ;
		}
		if(operation.equals("XML2XML")){
			XSLFILE = ProjectPath + "/src/xml/assignment/site2website.xsl";
			INFILE = ProjectPath + inputXmlPath;
			OUTFILE = ProjectPath + "/src/xml/assignment/website.xml";
		}else if(operation.equals("XML2HTML")){
			XSLFILE = ProjectPath + "/src/xml/assignment/websiteXml2Html.xsl";
			INFILE = ProjectPath + inputXmlPath;
			OUTFILE = ProjectPath + "/src/xml/assignment/website.html";
		}


		StreamSource xslcode = new StreamSource(new File(XSLFILE));
		StreamSource input = new StreamSource(new File(INFILE));
		StreamResult output =new StreamResult(new File(OUTFILE));
		
		TransformerFactory tf =	TransformerFactory.newInstance();
		Transformer trans;
		try {
			trans = tf.newTransformer(xslcode);
			trans.transform(input, output);
		}catch(TransformerConfigurationException e) {
			e.printStackTrace();
		}catch(TransformerException e) {
			e.printStackTrace();
		}
	}
}
