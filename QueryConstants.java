package Assignment;

public class QueryConstants {
	
	
	public static String prefixString=
			"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
			"PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"+
			"PREFIX untitled-ontology-2: <http://www.semanticweb.org/szhang10/ontologies/2021/5/untitled-ontology-2#>";

	public static String ASG1_FIND_hasConcept=

			"select * where  { ?s untitled-ontology-2:hasConcept ?o }";

	public static String ASG1_FIND_hasTOPIC=
			"select * where  { ?s untitled-ontology-2:hasTopic ?o }";

	public static String ASG1_FIND_Relatedto=
			"select * where  { ?s untitled-ontology-2:isRelatedToConcept ?o }";

}
