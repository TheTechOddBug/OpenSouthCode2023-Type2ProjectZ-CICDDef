#!/usr/bin/env groovy

def getProjectInfo() {

  def projectCICDDef = [:]
  def theProjectPipelineStagesDef = [:]

  def theProjectRepo = 'https://github.com/TheTechOddBug/OpenSouthCode2023-Type2ProjectZ.git'
  def theProjectType = 'projectType2'

  theProjectPipelineStagesDef.put(10, ['ProjectZ - Stage 1 - OvWr', { println 'Overwriting stageOne in ProjectZ.' }])
  theProjectPipelineStagesDef.put(15, ['ProjectZ - New Stage 1.5', { println 'New pipeline stage by ProjectZs.' }])

  projectCICDDef.projectRepo = theProjectRepo
  projectCICDDef.projectType = theProjectType
  projectCICDDef.projectPipelineStagesDef = theProjectPipelineStagesDef

  return projectCICDDef
}
