package gestionxml;
/**
 *
 * @author Lorena
 * @author Cristina
 */
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
//EL documento se llama "profesores"
public class ActualizarXml {
   public void ModificarXml (String profesores, String profesor, String DNI,
                              String Nombre, String Apellido, String nota,
                              String Prefiere, String P1, String P2, String P3){
    //Cargamos el documento
    try {
         FileInputStream fileInputStream = new FileInputStream("profesor");
         DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
         Document xmlDocument = documentBuilder.parse(fileInputStream);
        } catch (Exception e) {
        e.printStackTrace();
    }
    
    //Añadimos elementos
    Element profesorTag=profesores.createElement("profesor")
    Element dniTag=profesores.createElement("dni")
    Text dniTxt=profesores.createTextNode("76635983Y");
    Element nomrbeTag=profesores.createElement("nombre")
    Text nombreTxt=profesores.createTextNode("Juan");
    Element apellidosTag=profesores.createElement("apellidos")
    Text apellidosTxt=profesores.createTextNode("Barcelo Maldonado");
    Element notaTag=profesores.createElement("nota")
    Text notaTxt=profesores.createTextNode("8");
    Element preferenciasTag=profesores.createElement("preferencias")
    Element p1Tag=profesores.createElement("p1")
    Text p1Txt=profesores.createTextNode("Gestion base de datos");
    Element p2Tag=profesores.createElement("p2")
    Text p2Txt=profesores.createTextNode("Entornos en desarrollo");
    Element p3Tag=profesores.createElement("p3")
    Text p3Txt=profesores.createTextNode("Programacion");
    profesorTag.appendChild(profesorTxt);
    profesores.getDocumentElement().appendChild(profesorTag);
    dniTag.appendChild(dniTxt);
    profesores.getDocumentElement().appendChild(dniTag);
    nombreTag.appendChild(nombreTxt);
    profesores.getDocumentElement().appendChild(nombreTag);
    apellidosTag.appendChild(apellidosTxt);
    profesores.getDocumentElement().appendChild(apellidosTag);
    notaTag.appendChild(notaTxt);
    profesores.getDocumentElement().appendChild(notaTag);
    preferenciaTag.appendChild(preferenciasTxt);
    profesores.getDocumentElement().appendChild(preferenciasTag);
    p1Tag.appendChild(p1Txt);
    profesores.getDocumentElement().appendChild(p1Tag);
    p2Tag.appendChild(p2Txt);
    profesores.getDocumentElement().appendChild(p2Tag);
    p3Tag.appendChild(p3Txt);
    profesores.getDocumentElement().appendChild(p3Tag);
    profesores.getDocumentElement().appendChild(p3Tag);
    
   
                              }
}
