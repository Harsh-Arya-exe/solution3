pipeline{
    agent any
    stages{
        stage('Build'){
            echo 'Building...'
            echo 'python3 P1.py'
        }
        stage('Test'){
            echo 'Testing...'
        }
        stage('Deploy){
            echo 'Deploy'
        }

    }
}