pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -f pom.xml'
            }
            post {
                success {
                    echo "Salvando"
                    archiveArtifacts artifacts: '**/*.jar'
                }
            }
        }
        stage('Testes') {
            steps {
                sh 'mvn -f pom.xml test'
            }
        }
    }
}