import java.io.FileNotFoundException;

import com.itextpdf.text.DocumentException;

public class MainTest {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		// TODO Auto-generated method stub

		DatosColegio coledata = new DatosColegio("DAVID","PEREZ ALONSO","03866873K","COLEGIO VALLE DEL MIRO","CC123445","MADRID","C/ CLARA CAMPOAMOR","28032","12345678","12345678","123456789","VALDEMORO");
		DatosEmpresa empdata = new DatosEmpresa("DAVID","PEREZ ALONSO", "03866873K","INDRA","CC123445","MADRID","C/ CLARA CAMPOAMOR","28032","12345678","12345678","123456789","VALDEMORO");

		AnexoI anexoI = new AnexoI(coledata, empdata);
		
		anexoI.generarAnexoI("", "");

	}

}
