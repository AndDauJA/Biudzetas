
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class readBankDok {

    public static void main(String[] args) {
        try {
            String failoKelias = "./src/main/files/bank.xml";
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("./src/main/files/bank.xml");
            doc.getDocumentElement().normalize();

            // Gauk GrpHdr informaciją
            NodeList grpHdrList = doc.getElementsByTagName("GrpHdr");
            for (int temp = 0; temp < grpHdrList.getLength(); temp++) {
                Node node = grpHdrList.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String msgId = element.getElementsByTagName("MsgId").item(0).getTextContent();
                    String creDtTm = element.getElementsByTagName("CreDtTm").item(0).getTextContent();
                    System.out.println("MsgId: " + msgId);
                    System.out.println("CreDtTm: " + creDtTm);
                }
            }

            // Gauk Stmt informaciją
            NodeList stmtList = doc.getElementsByTagName("Stmt");
            for (int temp = 0; temp < stmtList.getLength(); temp++) {
                Node node = stmtList.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String id = element.getElementsByTagName("Id").item(0).getTextContent();
                    String elctrncSeqNb = element.getElementsByTagName("ElctrncSeqNb").item(0).getTextContent();
                    System.out.println("Id: " + id);
                    System.out.println("ElctrncSeqNb: " + elctrncSeqNb);

                    // Tęsiami kiti laukai, jei reikia
                }
            }

            // Tęsiamas kodas pagal poreikius


            NodeList txsSummryList = doc.getElementsByTagName("TxsSummry");
            for (
                    int temp = 0; temp < txsSummryList.getLength(); temp++) {
                Node node = txsSummryList.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    NodeList ttlCdtNtriesList = element.getElementsByTagName("TtlCdtNtries");
                    NodeList ttlDbtNtriesList = element.getElementsByTagName("TtlDbtNtries");

                    for (int i = 0; i < ttlCdtNtriesList.getLength(); i++) {
                        Element ttlCdtNtriesElement = (Element) ttlCdtNtriesList.item(i);
                        String sumCdt = ttlCdtNtriesElement.getElementsByTagName("Sum").item(0).getTextContent();
                        System.out.println("TtlCdtNtries Sum: " + sumCdt);
                    }

                    for (int i = 0; i < ttlDbtNtriesList.getLength(); i++) {
                        Element ttlDbtNtriesElement = (Element) ttlDbtNtriesList.item(i);
                        String sumDbt = ttlDbtNtriesElement.getElementsByTagName("Sum").item(0).getTextContent();
                        System.out.println("TtlDbtNtries Sum: " + sumDbt);
                    }
                }

                // Gauk Ntry informaciją
                NodeList ntryList = doc.getElementsByTagName("Ntry");
                for (int temp1 = 0; temp1 < ntryList.getLength(); temp1++) {
                    Node node1 = ntryList.item(temp);
                    if (node1.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) node1;
                        String amt = element.getElementsByTagName("Amt").item(0).getTextContent();
                        String cdtDbtInd = element.getElementsByTagName("CdtDbtInd").item(0).getTextContent();
                        String sts = element.getElementsByTagName("Sts").item(0).getTextContent();
                        String bookgDt = element.getElementsByTagName("BookgDt").item(0).getTextContent();
                        String valDt = element.getElementsByTagName("ValDt").item(0).getTextContent();

                        // ... kitų laukų gavimas ...

                        System.out.println("Amt: " + amt);
                        System.out.println("CdtDbtInd: " + cdtDbtInd);
                        System.out.println("Sts: " + sts);
                        System.out.println("BookgDt: " + bookgDt);
                        System.out.println("ValDt: " + valDt);

                        // Tęsiamas kodas pagal poreikius
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

