package net.sansa_stack.ml.spark.kge.linkprediction.NewDesign

import net.sansa_stack.ml.spark.kge.linkprediction.NewDesign._
import org.apache.spark.sql._

trait ConverterTrait {
  
  def getTriplesByIndex(dsTriplesInString : Dataset[RecordStringTriples]) : Dataset[RecordLongTriples]
  
  def getTriplesByString(dsTriplesInLong : Dataset[RecordLongTriples]) : Dataset[RecordStringTriples]
  
  def getEntitiesByIndex(dsEntitiesIndices : Dataset[Long]) : Dataset[(String,Long)]
  
  def getPredicatesByIndex(dsPredicatesIndicies : Dataset[Long]) : Dataset[(String,Long)]
  
  def getEntities() : Dataset[Long]
  
  def getPredicates() : Dataset[Long]
  
}