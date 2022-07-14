pipeline {
  agent any
  stages {
    stage('Functional') {
      steps {
        sh 'gradle clean test'
      }
    }

    stage('Integration') {
      steps {
        echo 'Integration Test'
      }
    }

    stage('Mobile') {
      steps {
        echo 'Integration Test'
      }
    }

    stage('Performance') {
      steps {
        echo 'Performance Test'
      }
     }
    stage('Clean up') {
      steps {
        deleteDir()
      }
    }
  }
}