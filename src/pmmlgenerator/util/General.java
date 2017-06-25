/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.util;

/**
 *
 * @author Angel Salamanca
 */
public class General {
    
    public static String[] models = {"GeneralRegressionModel"};
    public static String[] GRMModelTypes = {"regression", "generaLlinear","multinomialLogistic","ordinalMultinomial","generalizedLinear"}; // TODO ,"CoxRegression"};
    public static  String[] GRMFunctions = {"CLASSIFICATION","REGRESSION"}; // classification and regression
    public static int[] GRMcumLinkFunctions = {0,1,2,3,4}; // all available
    public static int[] GRMLinkFunctions = {0,1,2,3,4,5,6,7,8,9}; // all available
    public static String[] GRMDistributions = {"binomial", "gamma", "igauss", "negbin", "normal", "poisson", "tweedie"};   
    public static AttributeConstraintUniverse attributeConstraintUniverse;
    
    
}
