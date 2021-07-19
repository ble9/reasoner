package Assignment;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;

import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		SPARQL sparql= new SPARQL();
		System.out.println("Running Queries !!\n");

		
		String inputFile="C:\\Users\\brian\\IdeaProjects\\hello-semantic-web\\src\\model.rdf";
		Model model=ModelFactory.createDefaultModel();
		InputStream in= FileManager.get().open(inputFile);
		if (in == null) {
			throw new IllegalArgumentException("Filenot found");
		}
		model.read(in,"");


		sparql.runQuery(QueryConstants.ASG1_FIND_hasConcept, model);
		sparql.runQuery(QueryConstants.ASG1_FIND_hasTOPIC, model);
		sparql.runQuery(QueryConstants.ASG1_FIND_Relatedto, model);

		
	}

}
