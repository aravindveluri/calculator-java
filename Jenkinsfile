pipeline {
    environment{
        registry = "aravindv178/calculator-mini-project:latest"
        registryCredential = "c089af6c-79be-4415-a024-be0ef3c9d2e3"
        dockerImage = ""
    }
    agent any

    stages {
        stage('Git Cloning') {
            steps {
                git 'https://github.com/aravindveluri/calculator-java.git'
            }
        }
        stage('Maven & Environment Building') {
            steps {
                sh 'mvn clean install'
                sh 'pip3 install docker'
            }
        }
        
        stage('Building Docker Image')
        {
            steps{
                script{
                    dockerImage = docker.build "aravindv178/calculator-mini-project:latest"
                }
            }
        }
        stage('Push Docker Image')
        {
            steps{
                script{
                    docker.withRegistry("", registryCredential){
                        dockerImage.push()
                    }
                }
            }
        }
        stage('Deploy using Ansible')
        {
            steps{
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory.ini', playbook: 'playbook.yml', sudoUser: null
            }
        }
    }
}