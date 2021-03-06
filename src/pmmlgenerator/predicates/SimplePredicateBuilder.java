/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmmlgenerator.predicates;

import java.util.*;
import pmmlgenerator.*;
import pmmlgenerator.PMML42.*;    
import pmmlgenerator.util.*;

/**
 *
 * @author Angel Salamanca
 */
public class SimplePredicateBuilder extends PredicateBuilder {

      private SimplePredicate directPredicate;
    
      public Object build(ModelContext modelContext) throws Exception
      {
          SimplePredicate sp = new SimplePredicate();
          
          DATATYPE fddatatype = modelContext.generator.pickDataType();
          
          FieldDescriptor fd = modelContext.context.randomField(fddatatype, true, false, false, false); // 
          FieldHelper fh = new FieldHelper(fd.fieldName, fd.modelContext);
          sp.setField(fd.fieldName);
          DATATYPE datatype = fh.getDataType();
           
          if (datatype == DATATYPE.STRING)
          {
               sp.setOperator(modelContext.generator.pickOne(General.stringRelationalOperators));
          }
          else
          {
            sp.setOperator(modelContext.generator.pickOne(General.relationalOperators));
          }
          
          if((!sp.getOperator().equals("isMissing")) && !(sp.getOperator().equals("isNotMissing")))
          {                    
                    sp.setValue(modelContext.generator.getValue(datatype));
          }          
          
          this.directPredicate = sp;
          return sp;
      }
      
      public Object complementaryPredicate() throws Exception
      {
            SimplePredicate sp = new SimplePredicate();
            sp.setField(this.directPredicate.getField());
            sp.setValue(this.directPredicate.getValue());
            String newOp;
            // "equal", "notEqual", "lessThan", "lessOrEqual", "greaterThan", "greaterOrEqual", "isMissing", "isNotMissing"};
            switch(directPredicate.getOperator())
            {
                case "equal":
                    newOp =  "notEqual"; 
                    break;
                case  "notEqual":    
                    newOp = "equal";
                    break;
                case "lessThan":
                    newOp = "greaterOrEqual";
                    break;
                case "greaterOrEqual":
                    newOp = "lessThan";    
                    break;
                 case "lessOrEqual":
                    newOp =  "greaterThan"; 
                    break;
                case "greaterThan":
                    newOp =  "lessOrEqual"; 
                    break;
                case "isMissing":
                    newOp =  "isNotMissing"; 
                    break;
                case "isNotMissing":
                    newOp =  "isMissing"; 
                    break;
                    
                default:
                    throw new Exception("Unexpected operator");
            }
            sp.setOperator(newOp);
            return sp;
      }
    
}


