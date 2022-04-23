pipeline {
 agent any
  stages {
    stage("Cleaning Stage") {
      steps {
        sh "mvn clean"
      }
    }
    stage("Testing Stage") {
      steps {
        sh "mvn test"
      }
    }
    stage("Packaging Stage") {
      steps {
        sh "mvn package"
      }
    }
    stage("Consolidate Results") {
      steps {
       input("Do you want to capture results?")
       junit '**/target/surefire-reports/TEST-*.xml'
       archiveArtifacts artifacts: 'target/*.jar', allowEmptyArchive: true
      }
   }
  }
}
