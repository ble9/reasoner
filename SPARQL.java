package Assignment;

import org.apache.jena.query.*;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;

public class SPARQL {


		public static void runQuery(String queryString, Model model) {

			Query query = QueryFactory.create(QueryConstants.prefixString +queryString);

			// Execute the query and obtain results
			QueryExecution qe = QueryExecutionFactory.create(query, model);
			ResultSet results = qe.execSelect();

			ResultSetFormatter.out(System.out, results, query);

			for (; results.hasNext(); ) {
				QuerySolution soln = results.nextSolution();
				RDFNode x = soln.get("rdf");
				Resource r = soln.getResource("rdf");
				Literal l = soln.getLiteral("rdf");

				System.out.println(x);
				System.out.println(r);
				System.out.println(l);
				qe.close();
			}
		}
}