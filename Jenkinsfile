pipeline {
    agent any
    tools{
        maven '3.6.3'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/duyphong170195/spring-jenkins']])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t duyphong170195/spring-jenkins .'
                }
            }
        }
        stage('Push image to Hub') {
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                        // some block
                        sh 'docker login -u duyphong170195 -p ${dockerhubpwd}'
                        sh 'docker push duyphong170195/spring-jenkins'
                    }
                }
            }
        }
    }
}