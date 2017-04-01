package com.radw2020.OwlApi_Trainning;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.log4j.BasicConfigurator;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;

/**
 *
 * @author RadW
 */
public class Main {
    
    /**
     * @param args the command line arguments
     * @throws org.semanticweb.owlapi.model.OWLOntologyCreationException
     */
    public static void main(String[] args) throws OWLOntologyCreationException {
        
        try {
            //try {
            BasicConfigurator.configure();
            
            DbPedia totem = new DbPedia();
            
            System.out.println("\nshouldLoad");
            //totem.shouldLoad();
            System.out.println("\nshouldSaveOntologies()");
            //totem.shouldSaveOntologies();
            System.out.println("\nshouldAccessEntities()");
            //totem.shouldAccessEntities();
            System.out.println("\nshouldBuildDataRanges()");
            //totem.shouldBuildDataRanges();
            System.out.println("\nshouldUseDataranges()");
            //totem.shouldUseDataranges();
            System.out.println("\nshouldInstantiateLiterals()");
            //totem.shouldInstantiateLiterals();
            System.out.println("\nshouldLoadAndSave()");
            //totem.shouldLoadAndSave();
            System.out.println("\nshouldAddAxiom()");
            //totem.shouldAddAxiom();
            System.out.println("\nshouldCreateOntology()");
            //totem.shouldCreateOntology();
            System.out.println("\nshouldCreatePropertyAssertions()");
            //totem.shouldCreatePropertyAssertions();
            System.out.println("\nshouldAddClassAssertion()");
            //totem.shouldAddClassAssertion();
            System.out.println("\nshouldCreateAndSaveOntology()");
            //totem.shouldCreateAndSaveOntology();
            System.out.println("\nshouldAddObjectPropertyAssertions()");
            //totem.shouldAddObjectPropertyAssertions();
            System.out.println("\nshouldDeleteIndividuals()");
            //totem.shouldDeleteIndividuals();
            System.out.println("\nshouldCreateRestrictions()");
            //totem.shouldCreateRestrictions();
            System.out.println("\nshouldUseReasoner()");
            //totem.shouldUseReasoner();
            System.out.println("\nshouldLookAtRestrictions()");
            //totem.shouldLookAtRestrictions();
            System.out.println("\nshouldCreateAndReadAnnotations()");
            //totem.shouldCreateAndReadAnnotations();
            System.out.println("\nshouldCreateInferredAxioms()");
            //totem.shouldCreateInferredAxioms();
            System.out.println("\nshouldMergeOntologies()");
            //totem.shouldMergeOntologies();
            System.out.println("\nshouldWalkOntology()");
            //totem.shouldWalkOntology();
            System.out.println("\nshouldQueryWithReasoner()");
            //totem.shouldQueryWithReasoner();
            System.out.println("\nshouldUseIRIMappers()");
            //totem.shouldUseIRIMappers();
            System.out.println("\nshouldExtractModules()");
            //totem.shouldExtractModules();
            System.out.println("\nowlPrimer()");
            totem.owlPrimer();
            
            
            //} catch (OWLOntologyStorageException | IOException ex) {
            //   Logger.getLogger(DbPedia.class.getName()).log(Level.SEVERE, null, ex);
            //}
        //shouldCreateInferredAxioms()    
        /*} catch (OWLOntologyStorageException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);*/
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
