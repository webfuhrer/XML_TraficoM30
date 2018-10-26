import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


public class AccesoDatos {

	public static Trafico obtenerTrafico() {
		
			Trafico t=null;
			String totalVehiculosTunel=null, totalVehiculosCalle30=null, velocidadMediaTunel=null, velicidadMediaSuperfice=null;
			SAXBuilder builder = new SAXBuilder();
			try {
				Document documento=builder.build(new File("D:\\LUIS_SANZ\\XML_M30\\fichero.xml"));
				Element elemento_raiz=documento.getRootElement();
				List<Element> elementos_dato_global=elemento_raiz.getChildren("DatoGlobal");
				for (Element element : elementos_dato_global) {
					String nombre=element.getChild("Nombre").getValue();
					if (nombre.equals("totalVehiculosTunel"))
					{
						 totalVehiculosTunel=element.getChild("VALOR").getValue();
					}
					if (nombre.equals("totalVehiculosCalle30"))
					{
						 totalVehiculosCalle30=element.getChild("VALOR").getValue();
					}
					if (nombre.equals("velocidadMediaTunel"))
					{
						 velocidadMediaTunel=element.getChild("VALOR").getValue();
					}
					if (nombre.equals("velicidadMediaSuperfice"))
					{
						 velicidadMediaSuperfice=element.getChild("VALOR").getValue();
					}
					
				}
				t=new Trafico(Integer.parseInt(totalVehiculosTunel), Integer.parseInt(totalVehiculosCalle30),
						Float.parseFloat(velocidadMediaTunel), Float.parseFloat(velicidadMediaSuperfice));	
				//c.setMuicipio(...)
			} catch (JDOMException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return t;
		}

		
	}


