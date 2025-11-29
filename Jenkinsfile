pipeline {
    agent any
    tools{
        maven 'maven_3_8_5'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/jhonleturne192005/apiproductest']])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker compose build'
                    sh 'docker compose up -d'
                }
            }
        }
    }
}