node('jenkins-slave'){
    def issueKey
    def jiraSite = 'JIRA-apigate'

    options {
      buildDiscarder(logRotator(numToKeepStr: '10'))
      disableConcurrentBuilds()
    }

    environment {
      tag = '${BUILD_NUMBER}'   
    }

    stage('Checkout') {
      checkout scm
    }    

    stage('mvn clean'){
      sh 'mvn clean'
    }

    stage('mvn package'){
      sh 'mvn package'
    }

    stage ('Build image') {
        script {
            Image = docker.build("searce-playground/surya-wordpress")
        }
    }

    stage ('Add comment to JIRA Ticket'){
      def comment = [ 
        body: 'Testing comment !!' 
      ]
      jiraAddComment site: 'JIRA', idOrKey: 'DEM-1', input: comment
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
