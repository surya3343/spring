pipeline {

  agent {
      label 'jenkins-slave'
  }

  options {
      buildDiscarder(logRotator(numToKeepStr: '10'))
      disableConcurrentBuilds()
  }

  environment {
      tag = '${BUILD_NUMBER}'

  }

  stages {

    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('mvn clean'){
      steps {
        ansiColor('xterm') {
          sh 'mvn clean'
        }
      }
    }

    stage('mvn package'){
      steps {
        ansiColor('xterm') {
          sh 'mvn package'
        }
      }
    }

    stage ('Build image') {
        steps {
            script {
            Image = docker.build("searce-playground/surya-wordpress")
            }
        }
    }
    stage ('Push image') {
        steps {
            script {
                docker.withRegistry('https://us.gcr.io', 'gcr:searce-playground') {
                    Image.push(tag)
                }
            }

        }
    }

}
}