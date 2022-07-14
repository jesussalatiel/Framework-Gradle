#!/usr/bin/env groovy

pipeline {
  agent any

  stages {
    stage('Test') {
      steps {
        sh 'gradle clean test'
      }
    }
    stage('Clean up') {
      steps {
        deleteDir()
      }
    }
  }
}