import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.XMLStreamException;
import java.io.FileWriter;
import java.io.IOException;

public class XML {

    public static void main(String[] args) {
        // Crear el fichero donde se guardará el XML
        try( FileWriter fileWriter = new FileWriter("tendas.xml")) {


            XMLOutputFactory salida = XMLOutputFactory.newInstance();
            XMLStreamWriter escribe = salida.createXMLStreamWriter(fileWriter);

            // Inicio del documento
            escribe.writeStartDocument("1.0");
            escribe.writeStartElement("autores");

            // Autor 1
            escribe.writeStartElement("autor");
            escribe.writeAttribute("codigo", "a1");

            escribe.writeStartElement("nome");
            escribe.writeCharacters("Alexandre Dumas ");
            escribe.writeEndElement();

            escribe.writeStartElement("titulo");
            escribe.writeCharacters(" El conde de montecristo");
            escribe.writeEndElement();

            escribe.writeStartElement("titulo");
            escribe.writeCharacters(" Los miserables ");
            escribe.writeEndElement();

            escribe.writeEndElement(); // Cierra autor a1

            // Autor 2
            escribe.writeStartElement("autor");
            escribe.writeAttribute("codigo", "a2");

            escribe.writeStartElement("nome");
            escribe.writeCharacters("Fiodor Dostoyevski");
            escribe.writeEndElement();

            escribe.writeStartElement("titulo");
            escribe.writeCharacters(" El idiota");
            escribe.writeEndElement();

            escribe.writeStartElement("titulo");
            escribe.writeCharacters(" Noches blancas ");
            escribe.writeEndElement();

            escribe.writeEndElement(); // Cierra autor a2

            // Cierre del elemento raíz y del documento
            escribe.writeEndElement(); // Cierra autores
            escribe.writeEndDocument();


            System.out.println("Archivo 'tendas.xml' generado exitosamente.");

        } catch (XMLStreamException | IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

