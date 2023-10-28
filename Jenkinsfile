pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -f pom.xml -B -DskipTests clean package'
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
