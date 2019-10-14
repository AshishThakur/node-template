pipeline {
  agent any

  stages {
    stage('Pre-Build') {
      steps {
        echo 'Pre-Building..'
      }
    }
    stage('Build') {
      steps {
        echo 'Building..'
      }
    }
    stage('Run Unit Tests') {
      steps {
        echo 'Running Unit Tests..'
      }
    }
  }
}