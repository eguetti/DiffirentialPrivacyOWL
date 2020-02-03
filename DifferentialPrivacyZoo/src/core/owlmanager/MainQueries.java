package core.owlmanager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.query.Query;
import org.apache.jena.rdf.model.ModelFactory;

public class MainQueries {
	
	private String ontologyFileName = null;
	
	protected OntModel model = null;
    
	private QueryManager qm;

	public static void main(String args[]) {
		
		String dir = System.getProperty("user.dir");
		String sep = System.getProperty("file.separator");
		
		//System.out.println(System.getProperty("user.home"));
		
		///home/erika/git/DiffirentialPrivacyOWL/DifferentialPrivacyZoo/src/AnimalRDF.owl
		///home/erika/git/DiffirentialPrivacyOWL/DifferentialPrivacyZoo/src/AnimalRDF.owl
		String fileName = dir+sep+"src"+sep+"AnimalRDF.owl";
		MainQueries queries =  new MainQueries();
		
		System.out.println(fileName);
		queries.selectOntology(fileName);
	}
	
	//("OWL Ontologies (RDF/XML format)", "owl", "rdf", "xml");
	public void selectOntology(String fileName) {
		if (fileName == null) {
            model = null;
            ontologyFileName = null;
            return;
        }
		
		try {
            OntModel m = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
            m.read(new FileInputStream(fileName), null);
            model = m;
        } catch (FileNotFoundException e) {
            //throw e;
        	System.out.print(e.getMessage());
        } catch (Exception e) {
            throw new IllegalArgumentException("The ontology file could not be parsed. Please use RDF/XML format.");
        }
        this.ontologyFileName = fileName;
        
	}
	
	public String runQuery(String queryString) throws FileNotFoundException {
		
		Query query;
		
		return null;
	}
}
